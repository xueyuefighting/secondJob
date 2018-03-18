package com.yonyou.scf.contract.service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.net.ftp.FTPClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.entity.File;
import com.yonyou.scf.common.entity.FileExample;
import com.yonyou.scf.common.gateway.entity.TokenBean;
import com.yonyou.scf.common.mapper.auto.FileMapper;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.util.CreateID;
import com.yonyou.scf.common.util.Timer;
import com.yonyou.scf.common.util.TokenUtil;
import com.yonyou.scf.contract.constant.Constant;
import com.yonyou.scf.contract.constant.IpFactory;
import com.yonyou.scf.contract.ftp.FTPfixPool;
import com.yonyou.scf.contract.util.CommonUtil;
import com.yonyou.scf.contract.util.ConstractTools;
import com.yonyou.scf.common.gateway.entity.FileRedisEntity;
import com.yonyou.scf.contract.utilEntity.FileResponseEntity;

import lombok.Cleanup;

@Service
public class FileService {
	
	private static final Logger logger = LoggerFactory.getLogger(FileService.class);
	
	@Autowired
	private RedisTemplate<Object,Object> redisTemplate;
	@Autowired
	private FTPfixPool fTPfixPool;
	@Autowired
	private FileMapper fileMapper;
	
	/*
	 * 上传文件 但是没有最后提交，只是放入缓存，当最后提交的时候 将从缓存中取 放入ftp中
	 * @param multiReq
	 * @return
	 */
	@Transactional(rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
	public FileResponseEntity upTempFile(MultipartHttpServletRequest multiReq)throws Exception {
		logger.info("enter into upTempFile()...");
		List<MultipartFile> list = multiReq.getFiles("file");
		
		if(StringUtils.isEmpty(list) || list.size()==0) {
			logger.warn("附件对象为空，请检测页面");
			throw new NullPointerException("附件对象为空，请检测页面");
		}
		
		List<FileRedisEntity> fileList = new ArrayList<>();
		
		list.stream().forEach(x->{
			try {
				ConstractTools.upTempFileToRedis(fileList, x, redisTemplate);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		FileResponseEntity free = null;
		for (FileRedisEntity file : fileList) {
			
			if(file==null || StringUtils.isEmpty(file.getFileId()))
				continue;
			
			//没用流 是因为流不能做到只初始化一个对象 然后循环赋值
			free = new FileResponseEntity();
			
			free.setFileId(file.getFileId());
			free.setName(file.getName());
			free.setSubfix(file.getSubfix());
			free.setViewUrl(URLConst.URL_CONTRACT+"/fileControl/viewFile?fileId="+file.getFileId());
			free.setDownUrl(URLConst.URL_CONTRACT+"/fileControl/downFile?fileId="+file.getFileId());
			return free;
		}
		
		return null;
	}
	
	@Transactional(rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
	public FileResponseEntity upTempFile2(InputStream is, String filename )throws Exception {
		logger.info("enter into upTempFile()...");
//		List<MultipartFile> list = multiReq.getFiles("file");
		
//		if(StringUtils.isEmpty(list) || list.size()==0) {
//			logger.warn("附件对象为空，请检测页面");
//			throw new NullPointerException("附件对象为空，请检测页面");
//		}
		
		List<FileRedisEntity> fileList = new ArrayList<>();
		
//		list.stream().forEach(x->{
			try {
//				ConstractTools.upTempFileToRedis(fileList, x, redisTemplate);
				
				logger.info("将附件对象转化为二进制流存储在redis中，返回FileRedisEntity实体类对象--开始");
				String uploadFilePath = filename;
				// 截取上传文件的文件名
				String uploadFileName = uploadFilePath.substring(uploadFilePath.lastIndexOf('\\') + 1, uploadFilePath.indexOf('.'));
				// 截取上传文件的后缀
				String uploadFileSuffix = uploadFilePath.substring( uploadFilePath.indexOf('.') + 1, uploadFilePath.length());
				//组成文件名
				String key = CommonUtil.createFileId();
				
				System.out.println("上传文件的文件名："+uploadFileName);
				System.out.println("上传文件的后缀："+uploadFileSuffix);
				System.out.println("文件名key："+key);
				
				FileRedisEntity fre = new FileRedisEntity();
				fre.setFileId(key);
				fre.setName(uploadFileName);
				fre.setSubfix(uploadFileSuffix);
				fre.setKeyPrefix(ConstractTools.FILEIDKEYS);
				//将临时文件信息 放入指定包装类
				fileList.add(fre);
				
				@Cleanup ByteArrayOutputStream os = new ByteArrayOutputStream();
				//准备转化数组
				FileCopyUtils.copy(is, os);
				fre.setFile(os.toByteArray());
				logger.info("将附件对象转化为二进制流存储在redis中，返回FileRedisEntity实体类对象--成功");
				//刷新缓存
				ConstractTools.flushFileRedis(fre, redisTemplate);
				logger.info("Redis更新文件大小 1:"+fre.getFile().length);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
//		});
		
		FileResponseEntity free = null;
		for (FileRedisEntity file : fileList) {
			
			if(file==null || StringUtils.isEmpty(file.getFileId()))
				continue;
			
			//没用流 是因为流不能做到只初始化一个对象 然后循环赋值
			free = new FileResponseEntity();
			
			free.setFileId(file.getFileId());
			free.setName(file.getName());
			free.setSubfix(file.getSubfix());
			free.setViewUrl("");
			free.setDownUrl("");
			free.setViewUrl(URLConst.URL_CONTRACT+"/fileControl/viewFile?fileId="+file.getFileId());
			free.setDownUrl(URLConst.URL_CONTRACT+"/fileControl/downFile?fileId="+file.getFileId());
			return free;
		}
		
		return null;
	}

	/*
	 * 查看图片
	 * @param fileId
	 * @param outputStream
	 */
	public void viewFile(String fileId, String id, ServletOutputStream os) throws Exception{
		
		if(StringUtils.isEmpty(id) && StringUtils.isEmpty(fileId)) {
			 return;
		 }
		
		if(!StringUtils.isEmpty(id)) {
			fileId = fileMapper.selectByPrimaryKey(Long.parseLong(id)).getFileId();
		}
		 
		 FTPClient ftpClient = fTPfixPool.borrowFTP();
		try {
			
			//redis命中图片
			FileRedisEntity fre = ConstractTools.obtainsFileWithRedis(fileId,ConstractTools.IMGIDKEYS, redisTemplate);
			
			if(fre!=null) {
				logger.info("Redis命中文件大小 1:"+fre.getFile().length);
				
				os.write(fre.getFile(), 0, fre.getFile().length);
				os.flush();
				return;
			}
			
			//先到redis中命中文件
			Optional<Object> fileArray = Optional.ofNullable((redisTemplate.opsForValue().get(ConstractTools.FILEIDKEYS+fileId)));
			
			//（1）redis命中则返回 （2）redis中没有命中，则去ftp系统中取
			if(fileArray.isPresent()) {
				String stringValue = (String)fileArray.get();
				
				final FileRedisEntity fre1 = JSON.parseObject(stringValue, FileRedisEntity.class);
				
				@Cleanup InputStream is = new ByteArrayInputStream(fre1.getFile()); 
				logger.info("Redis命中文件大小 2:"+fre1.getFile().length);
				
				//判断是否为支持文档格式  其他的为图片格式
				long exitsCnt = ConstractTools.SUPPORT_DOCUMENT_YPES.stream().map(String::toUpperCase).filter(x->x.equals(fre1.getSubfix().toUpperCase())).count();
				
				if(exitsCnt>0) {//A-证明为pdf等文档
					System.out.println("开始刷新");
					//生成图片 并刷新
					byte[] imgByte = ConstractTools.pdfToOutputStream(is, null, redisTemplate, fileId, ConstractTools.IMGIDKEYS);
					
					if(imgByte==null) {
						throw new Exception("合成失败");
					}
					System.out.println("合成后大小:"+imgByte.length);
					os.write(imgByte, 0, imgByte.length);
					os.flush();
					return;
				}
				
				//A-否则为图片 直接回显
				FileCopyUtils.copy(is, os);
				os.flush();
				return;
			}else {
				com.yonyou.scf.common.entity.File file = getFileEntity(fileId);
				
				String subfix  = file.getNameSubfix();
				
				@Cleanup InputStream is = ConstractTools.getFile(ftpClient, fileId,subfix, redisTemplate);
				
				//判断是否为支持文档格式  其他的为图片格式
				long exitsCnt = ConstractTools.SUPPORT_DOCUMENT_YPES.stream().map(String::toUpperCase).filter(x->x.equals(subfix.toUpperCase())).count();
				
				if(exitsCnt>0) {
					logger.info("开始刷新");
					//生成图片 并刷新
					byte[] imgByte = ConstractTools.pdfToOutputStream(is, null, redisTemplate, fileId, ConstractTools.IMGIDKEYS);
					
					if(imgByte==null) {
						throw new Exception("合成失败");
					}
					logger.info("合成文件大小:"+imgByte.length);
					os.write(imgByte, 0, imgByte.length);
					os.flush();
					return;
				}
				
				FileCopyUtils.copy(is, os);
				os.flush();
			}
			
		} finally {
			fTPfixPool.returnFTP(ftpClient);
		}
		
	}

	private com.yonyou.scf.common.entity.File getFileEntity(String fileId) throws Exception {
		FileExample fileExample = new FileExample();
		fileExample.createCriteria().andFileIdEqualTo(fileId);
		
		List<com.yonyou.scf.common.entity.File> list = fileMapper.selectByExample(fileExample);
		
		if(list==null || list.size()>1 || list.size()==0) {
			throw new Exception("没有找到对应的文件");
		}
		com.yonyou.scf.common.entity.File file = list.get(0);
		return file;
	}

	public void downFile(String fileId, String id, HttpServletResponse response) {

		FTPClient ftpClient = null;
		
		
		try {
			
			if(StringUtils.isEmpty(id) && StringUtils.isEmpty(fileId)) {
				 return;
			 }
			
			if(!StringUtils.isEmpty(id)) {
				fileId = fileMapper.selectByPrimaryKey(Long.parseLong(id)).getFileId();
			}
			
			ftpClient = fTPfixPool.borrowFTP();
			if(StringUtils.isEmpty(ftpClient)) {
				return;
			}
			@Cleanup InputStream is = null;
			
			String fileName = "";//文件的名字
			String subfix = "";//文件的后缀
			
			FileRedisEntity fre = ConstractTools.obtainsFileWithRedis(fileId, ConstractTools.FILEIDKEYS, redisTemplate);
			
			//如果在redis中没有找到  那么去数据库中取值，用值到ftp中找，如果都没有找到，那么放弃
			if(fre==null) {
				FileExample fileExample = new FileExample();
				fileExample.createCriteria().andFileIdEqualTo(fileId);
				
				List<com.yonyou.scf.common.entity.File> list = fileMapper.selectByExample(fileExample);
				
				if(list==null || list.size()>1 || list.size()==0) {
					throw new Exception("没有找到对应的文件");
				}
				com.yonyou.scf.common.entity.File file = list.get(0);
				
				fileName = file.getName();
				subfix  = file.getNameSubfix();
				//刷新redis缓存
				is = ConstractTools.getFile(ftpClient,file,redisTemplate);
			}else {
				is = new ByteArrayInputStream(fre.getFile());
				fileName = fre.getName();
				subfix = fre.getSubfix();
				
			}
			
			System.out.println(fileName);
			System.out.println(subfix);
			System.out.println((fileName+"."+subfix));
			String finalName = new String((fileName+"."+subfix).getBytes("UTF-8"), "ISO8859-1");
			System.out.println("下载文件名："+(fileName+"."+subfix));
			response.setHeader("OriginalFilename", finalName);
			response.setHeader("Content-Disposition", "attachment;fileName="+finalName);
			
			OutputStream os = response.getOutputStream();
			FileCopyUtils.copy(is, os);
			os.close();
			os.flush();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(ftpClient!=null) {
				fTPfixPool.returnFTP(ftpClient);
			}
		}
	}
	
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public ResultBean saveFile(JSONObject obj) {
		
		logger.info("enter saveFile...");
		
		//参数校验---s
		if(StringUtils.isEmpty(obj) || !obj.containsKey("fileId")) {
			logger.warn(Constant.MSG_File_1000);
			return new ResultBean(Constant.CODE_File_1000,Constant.MSG_File_1000);
		}
		
		if(!obj.containsKey("key")) {
			logger.warn(Constant.MSG_TOKEN_1001);
			return new ResultBean(Constant.CODE_1000,Constant.MSG_TOKEN_1001);
		}
		
		String tokenKey = obj.getString("key");
		
		TokenBean tokenBean  = TokenUtil.getBean(tokenKey, redisTemplate);
		
		if(StringUtils.isEmpty(tokenBean)) {
			logger.warn(Constant.MSG_TOKEN_1000);
			return new ResultBean(Constant.CODE_1000,Constant.MSG_TOKEN_1000);
		}
		//参数校验---e
		
		//文件id
		String fileId = obj.getString("fileId");
		try {
			
			//执行上传保存主要方法
			String id = saveOrUpdateFileEntity(tokenBean, fileId);
			return new ResultBean(Constant.CODE_2000,Constant.MSG_2000,Arrays.asList(id));
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,e.getMessage());
		}
	}
	
	@Transactional(propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	public String saveOrUpdateFileEntity(TokenBean tokenBean, String fileId) throws Exception {
		FTPClient ftpClient = null;
		System.out.println("saveOrUpdateFileEntity");
		try {
			ftpClient = fTPfixPool.borrowFTP();
			
			//包装好要保存的file类
			File file = packFileEntity(fileId,tokenBean,redisTemplate);
			
			FileExample fileExample = new FileExample();
			fileExample.createCriteria().andFileIdEqualTo(fileId);
			List<File> listFile = fileMapper.selectByExample(fileExample);
			
			if(listFile!=null && listFile.size()>0) {
				logger.warn("file表入库失败...，同一份redis中的附件只能入库一次");
				throw new Exception("所有参数正确，但file表入库失败，同一份redis中的附件只能入库一次");
			}
			
			//上传至ftp
			ConstractTools.sendToFtpByKey(fileId, redisTemplate, ftpClient);
			
			int resultInt = fileMapper.insert(file);
			
			if(resultInt>0) {
				logger.info("file表入库成功...");
				return String.valueOf(file.getId());
			}
			logger.warn("file表入库失败...");
			throw new Exception("所有参数正确，但file表入库失败");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}finally {
			if(ftpClient!=null) {
				fTPfixPool.returnFTP(ftpClient);
			}
		}
	}
	
	@Transactional(propagation=Propagation.MANDATORY,rollbackFor=Exception.class)
	private File packFileEntity(String fileId,TokenBean tokenBean,RedisTemplate<Object,Object> redisTemplate) throws Exception{
		FileRedisEntity entity = ConstractTools.obtainsFileWithRedis(fileId, ConstractTools.FILEIDKEYS, redisTemplate);
		if(StringUtils.isEmpty(entity)) {
			throw new Exception(Constant.MSG_FILEREDIS_1000);
		}
		//获取主键id
		long id = CreateID.createId();
		//当前时间
		String currentTime = Timer.getDateTimeNow(Timer.Role2);
		
		File file = new File();
		file.setCreUserId(Long.parseLong(tokenBean.getUserId()));
		file.setExclusiveNo("");
		file.setFileId(fileId);
		file.setFilePath(ConstractTools.CONSTRACTPATH_IN_FTP);
		file.setGmtCreate(currentTime);
		file.setGmtModified(currentTime);
		file.setId(id);
		file.setModUserId(Long.parseLong(tokenBean.getUserId()));
		file.setName(entity.getName());
		file.setNameSubfix(entity.getSubfix());
		
		return file;
	}

	/*
	 * idList Long类型  id集合
	 * zipName 下载的文件名字
	 * @param obj
	 * @param outputStream
	 */
	public void zipDown(String param, HttpServletResponse response) throws Exception{
		
		JSONObject obj = JSON.parseObject(param, JSONObject.class);
		
//		
		
		if(StringUtils.isEmpty(obj) || !obj.containsKey("idList") || !obj.containsKey("zipName")) {
			throw new Exception("参数不全");
		}
		
		String idListS = CommonUtil.getFromJSONObject(obj, "idList").toString();
		
		String zipName = CommonUtil.getFromJSONObject(obj, "zipName").toString();
		
		System.out.println(zipName);
		String finalName = new String(zipName.getBytes("UTF-8"), "ISO8859-1");
		System.out.println("下载文件名："+zipName);
		response.setHeader("OriginalFilename", finalName);
		response.setHeader("Content-Disposition", "attachment;fileName="+finalName);
//		OutputStream os = response.getOutputStream();
		
		List<Long>  idList = JSON.parseObject(idListS, ArrayList.class);
		
		FileExample fileExample = new FileExample();
		fileExample.createCriteria().andIdIn(idList);
		
		List<File> fileList = fileMapper.selectByExample(fileExample);
		
		OutputStream os = response.getOutputStream();
		ZipOutputStream zos = new ZipOutputStream(os);
		
		List<String> nameList = new ArrayList<String>();
		
		for (File file : fileList) {
			FTPClient fTPClient = null;
			try {
				//杜瑞修改文件重名问题
				ZipEntry zipEntry;
				if(nameList.contains(file.getName()+"."+file.getNameSubfix())) {
					zipEntry= new ZipEntry(CreateID.createId()+"."+file.getNameSubfix());  
				} else {
					zipEntry= new ZipEntry(file.getName()+"."+file.getNameSubfix());  
				}
				nameList.add(file.getName()+"."+file.getNameSubfix());
				
				zos.putNextEntry(zipEntry);
					FileRedisEntity fre = ConstractTools.obtainsFileWithRedis(file.getFileId(),ConstractTools.FILEIDKEYS, redisTemplate);
					if(fre!=null) {
						zos.write(fre.getFile(), 0, fre.getFile().length);
						continue;
					}
					fTPClient = fTPfixPool.borrowFTP();
					@Cleanup InputStream is = ConstractTools.getFileFromFTP(fTPClient, file.getFileId(), file.getNameSubfix(), ConstractTools.CONSTRACTPATH_IN_FTP);
					@Cleanup ByteArrayOutputStream bos = new ByteArrayOutputStream();
					FileCopyUtils.copy(is, bos);
					zos.write(bos.toByteArray(), 0, bos.toByteArray().length);
			} finally {
				if(fTPClient!=null) {
					fTPfixPool.returnFTP(fTPClient);
				}
			}
		}

//		os.close();
//		os.flush();
		
//		String finalName = new String((zipName).getBytes("UTF-8"), "ISO8859-1");
//		System.out.println("下载文件名："+finalName);
//		response.setHeader("OriginalFilename", finalName);
//		response.setHeader("Content-Disposition", "attachment;fileName="+finalName);
		zos.flush();
		zos.close();
		
		
		
	}
}

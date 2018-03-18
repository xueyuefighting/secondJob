package com.yonyou.scf.contract.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.entity.FileExample;
import com.yonyou.scf.common.mapper.auto.ContractSignerMapper;
import com.yonyou.scf.common.mapper.auto.FileMapper;
import com.yonyou.scf.contract.constant.IpFactory;
import com.yonyou.scf.contract.ftp.FTPfixPool;
import com.yonyou.scf.contract.mapper.FileUtilMapper;
import com.yonyou.scf.contract.util.ConstractTools;
import com.yonyou.scf.common.gateway.entity.FileRedisEntity;
import com.yonyou.scf.contract.utilEntity.FileResponseEntity;

import lombok.Cleanup;

@Service
public class LFBankFileService{
	
	@Autowired
	private RedisTemplate<Object,Object> redisTemplate;
	@Autowired
	private FTPfixPool fTPfixPool;
	
	@Autowired
	private FileMapper fileMapper;
	
	@Autowired
	private FileUtilMapper fileUtilMapper;
	
	@Autowired
	private ContractSignerMapper contractSignerMapper;
	
	/*
	 * 上传文件 但是没有最后提交，只是放入缓存，当最后提交的时候 将从缓存中取 放入ftp中
	 * @param multiReq
	 * @return
	 */
	@Transactional(rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
	public FileResponseEntity upTempFile(MultipartHttpServletRequest multiReq) {
		
		List<MultipartFile> list = multiReq.getFiles("file");
		
		List<FileRedisEntity> fileList = new ArrayList<>();
		
		list.stream().forEach(x->{
			try {
				ConstractTools.upTempFileToRedis(fileList, x, redisTemplate);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
		
		FileResponseEntity free = null;
		List<FileResponseEntity> li = new ArrayList<FileResponseEntity>();
		for (FileRedisEntity file : fileList) {
			
			if(file==null || StringUtils.isEmpty(file.getFileId()))
				continue;
			
			//没用流 是因为流不能做到只初始化一个对象 然后循环赋值
			free = new FileResponseEntity();
			
			free.setFileId(file.getFileId());
			free.setName(file.getName());
			free.setSubfix(file.getSubfix());
			free.setViewUrl(URLConst.URL_CONTRACT+"/constract/viewPDF?fileId="+file.getFileId());
			free.setDownUrl(URLConst.URL_CONTRACT+"/constract/downPDF?fileId="+file.getFileId());
			return free;
		}
		
		return null;
	}
	/* (non-Javadoc)
	 * 上传文件  直接入库 文件上传到ftp中。 场景：在列表中 上传和更换
	 * @see com.yonyou.scf.contract.interf.IFileHandle#upFile(org.springframework.web.multipart.MultipartHttpServletRequest)
	 */
	@Transactional(rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
	public List<FileResponseEntity> upFile(MultipartHttpServletRequest multiReq) {
		
		List<MultipartFile> list = multiReq.getFiles("file");
		
		List<com.yonyou.scf.common.entity.File> fileList = new ArrayList<>();
		
		try {
			list.parallelStream().forEach(x->ConstractTools.upLoadFile(fileList, x, fTPfixPool, redisTemplate));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int resultInt = fileUtilMapper.insertBatchData(fileList);
		
		//没有操作成功 直接返回""
		if(resultInt<1) return null;
		
		
		FileResponseEntity free = null;
		List<FileResponseEntity> li = new ArrayList<FileResponseEntity>();
		for (com.yonyou.scf.common.entity.File file : fileList) {
			
			if(file==null || StringUtils.isEmpty(file.getFileId()))
				continue;
			
			//没用流 是因为流不能做到只初始化一个对象 然后循环赋值
			free = new FileResponseEntity();
			
			free.setFileId(file.getFileId());
			free.setName(file.getName());
			free.setSubfix(file.getNameSubfix());
			free.setViewUrl(URLConst.URL_CONTRACT+"/constract/viewPDF?fileId="+file.getFileId());
			free.setDownUrl(URLConst.URL_CONTRACT+"/constract/downPDF?fileId="+file.getFileId());
			li.add(free);
		}
		
		return li;
	}

	/*
	 * 查看附件，实际是将pdf转为图片，然后返回一个outputStream 在前端展示
	 * @param id
	 * @param os
	 * @throws Exception
	 */
	public void viewPdf(String id, OutputStream os) throws Exception {
		
		if(StringUtils.isEmpty(id)) {
			return;
		}
		
		FTPClient fTPClient = fTPfixPool.borrowFTP();
		
		//取库中文件属性
		com.yonyou.scf.common.entity.File file = fileMapper.selectByPrimaryKey(Long.valueOf(id));
		
		if(StringUtils.isEmpty(file)) {
			throw new Exception("从数据库中获取附件为空");
		}
		
		//用（IMGIDKEYS+）id  去redis中 命中图片  有则立刻返回  
		FileRedisEntity fre = ConstractTools.obtainsFileWithRedis(file.getFileId(), ConstractTools.IMGIDKEYS, redisTemplate);
		
		if(fre!=null && fre.getFile().length>0) {
			os.write(fre.getFile(), 0, fre.getFile().length);
			return;
		}
		
		
		//取pdf文件 生成图片
		InputStream is = ConstractTools.getFileFromFTP(fTPClient,file);
		
		if(is==null) {
			throw new Exception("文件不存在");
		}
		
		//生成图片
		byte[] imgByte = ConstractTools.pdfToOutputStream(is, null, redisTemplate, file.getFileId(), ConstractTools.IMGIDKEYS);
		
		if(imgByte==null) {
			throw new Exception("合成失败");
		}
	
		os.write(imgByte, 0, imgByte.length);
		os.flush();
	}
	
	public void downFile(String fileId, HttpServletResponse response) throws Exception {
		
		FTPClient ftpClient = fTPfixPool.borrowFTP();
		
		@Cleanup OutputStream os = response.getOutputStream();
		
		try {
			if(StringUtils.isEmpty(ftpClient) || StringUtils.isEmpty(os)) {
				return;
			}
			
			FileExample fileExample = new FileExample();
			fileExample.createCriteria().andFileIdEqualTo(fileId);
			
			List<com.yonyou.scf.common.entity.File> list = fileMapper.selectByExample(fileExample);
			
			if(list==null || list.size()>1 || list.size()==0) {
				throw new Exception("没有找到对应的文件");
			}
			com.yonyou.scf.common.entity.File file = list.get(0);
			//刷新redis缓存
			InputStream is = ConstractTools.getFile(ftpClient,file,redisTemplate);
			
			FileCopyUtils.copy(is, os);
			
			String newName = new String((file.getName()+file.getNameSubfix()).getBytes("UTF-8"), "ISO8859-1");
			response.setHeader("Content-Disposition", "attachment;fileName="+newName+"."+file.getNameSubfix());
			
			os.flush();
		} finally {
			fTPfixPool.returnFTP(ftpClient);
		}
	}
}

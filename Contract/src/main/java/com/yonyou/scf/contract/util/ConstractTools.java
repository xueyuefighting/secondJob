package com.yonyou.scf.contract.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.imageio.ImageIO;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.yonyou.scf.common.constant.ContractConstant;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.constant.UserConst;
import com.yonyou.scf.common.entity.ContractAttribute;
import com.yonyou.scf.common.entity.ContractAttributeExample;
import com.yonyou.scf.common.entity.ContractCredit;
import com.yonyou.scf.common.entity.ContractNo;
import com.yonyou.scf.common.entity.ContractNoExample;
import com.yonyou.scf.common.entity.ContractSigner;
import com.yonyou.scf.common.entity.ContractSignerExample;
import com.yonyou.scf.common.entity.ContractTemplate;
import com.yonyou.scf.common.entity.ContractTemplateExample;
import com.yonyou.scf.common.entity.File;
import com.yonyou.scf.common.gateway.entity.TokenBean;
import com.yonyou.scf.common.input.BZContractBean;
import com.yonyou.scf.common.input.FWFContractBean;
import com.yonyou.scf.common.input.JJContractBean;
import com.yonyou.scf.common.input.JKContractBean;
import com.yonyou.scf.common.mapper.auto.ContractAttributeMapper;
import com.yonyou.scf.common.mapper.auto.ContractNoMapper;
import com.yonyou.scf.common.mapper.auto.ContractSignerMapper;
import com.yonyou.scf.common.mapper.auto.ContractTemplateMapper;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.util.CreateID;
import com.yonyou.scf.common.util.Timer;
import com.yonyou.scf.common.util.net.HttpClientUtil;
import com.yonyou.scf.contract.config.SpringContextUtil;
import com.yonyou.scf.contract.constant.Constant;
import com.yonyou.scf.contract.ftp.FTPfixPool;
import com.yonyou.scf.common.gateway.entity.FileRedisEntity;

import lombok.Cleanup;

/**
 * *****************************************其他表中的file_id  只是存着file表的主键  而在redis中的key 和ftp上的文件名 都是file表中的file_id
 * (1) 缓存在redis中的文件，key="fileIdKeys"+file表file_id value=fileRedisEntity对象
 * (2) 存在ftp系统中的文件，文件名是由 17位时间+6个随机字符组成
 * (3) file表中 fileId相对应ftp文件的文件名
 * (4) file表中 name是上传时，文件的名字，用于回显
 * @author zhangjlm
 *
 */
public class ConstractTools {
	
	private static Lock lock = new ReentrantLock(true);
	
	private static final Logger logger = LoggerFactory.getLogger(ConstractTools.class);
	
	public static String FILEIDKEYS = "fileIdKeys";//redis中文件key的前缀
	
	public static String FILE_IDKEYS_STUFF = "fileIdKeysStuff";//redis中填入值的文件key的前缀
	
	public static String IMGIDKEYS = "imgIdKeys";//没有填入值的文件
	
	public static String IMG_IDKEYS_STUFF = "imgIdKeysStuff";//填入值的文件图片
	
	public static String CON_NO_IDKEYS = "comNoIDKeys";//根据融资申请id 生成一批合同编号  只有在确认页面 生成一次 (如果要在redis中删除，只有签署起始方保存完毕删除)
	
	public static String CONSTRACTPATH_IN_FTP = "constract";//ftp上 保存合同的路径
	
	public static String SN_PREFIX = "snPrefix";//sn放在redis中的前缀
	
	public static String FTP_CON_ABSOLUTE_PATH_PREFIX = "/home";//ftp保存合同的全路径
	public static String FTP_CON_ABSOLUTE_PATH_SUBFIX = "constract";//ftp保存合同的全路径
	
	public static List<String> SUPPORT_DOCUMENT_YPES = Arrays.asList("pdf");//所支持的文档格式
	
	public static Map<String,String> getStuffMapWithClass(ContractSigner contractSigner,TokenBean tokenBean, ContractTemplate contractTemplate, ContractSignerMapper contractSignerMapper) throws Exception {
		String contractType = contractTemplate.getContractType();
		
		switch(contractType) {
		case ContractConstant.CONTRACT_TPN_JJ_TYPE:
			return getStuffMapWithClass_1(contractSigner, tokenBean, JJContractBean.class, null);
		case ContractConstant.CONTRACT_TPN_JK_TYPE:
			return getStuffMapWithClass_1(contractSigner, tokenBean, JKContractBean.class, null);
		case ContractConstant.CONTRACT_TPN_BZ_TYPE:
			
			//查询当前合同对应的担保方id
			ContractSignerExample contractSignerExample = new ContractSignerExample();
			contractSignerExample.createCriteria().andCreditIdEqualTo(contractSigner.getCreditId()).andPlaceholderNoEqualTo(contractSigner.getPlaceholderNo())
			.andFileIdEqualTo(contractSigner.getFileId()).andSignerNoEqualTo(UserConst.user_role_type_4);
			List<ContractSigner> list = contractSignerMapper.selectByExample(contractSignerExample);
			if(list==null || list.size()==0) {
				throw new Exception("不存在担保方信息");
			}
			return getStuffMapWithClass_1(contractSigner, tokenBean, BZContractBean.class,list.get(0));
		case ContractConstant.CONTRACT_TPN_FWF_TYPE:
			return getStuffMapWithClass_1(contractSigner, tokenBean, FWFContractBean.class, null);
			default:
				throw new Exception("提供的模版类中合同类型不符合--当前为TPN请检查合同type");
		}
	}
	
	/*
	 * 太平鸟合同，通过授信id等 获取合同填值的bean
	 * @param creditId
	 * @param tokenBean
	 * @param s
	 * @param contractSigner_db 当为担保合同的时候 此参数有值 担保签署信息
	 * @return
	 * @throws Exception
	 */
	public static Map<String, String> getStuffMapWithClass_1(ContractSigner contractSigner,TokenBean tokenBean, Class<?> s, ContractSigner contractSigner_db) throws Exception {
		if(StringUtils.isEmpty(s)) {
			throw new NullPointerException("授信id不存在");
		}
		
		JSONObject obj = new JSONObject();
		obj.put("creditId", contractSigner.getCreditId());
		
		String url = URLConst.URL_CREDIT;
		
		if( s == BZContractBean.class ) {
			url+="/6602022";
			obj.put("warrantorId", contractSigner_db.getSignerId());
		}else if( s == JKContractBean.class ) {
			url+="/6602023";
		}else if( s == JJContractBean.class ) {
			//借据合同是融资申请合同   被动调用
			//url+="/6602024";
			logger.warn("待发送请求类型不存在，请检查获取合同的方法及相关bean，class:"+s.getName());
		}else if( s == FWFContractBean.class ) {
			url+="/6602024";
			obj.put("tokenBean", tokenBean);
		}else {
			logger.warn("待发送请求类型不存在，请检查获取合同的方法及相关bean");
			throw new Exception("当前输入的class 不是指定的，请检查参数");
		}
		logger.info("准备向授信模版发送请求，请求url："+url+"。参数为："+obj);
		String resultString = HttpClientUtil.post(url, obj);
		logger.info("向授信模版发送请求结束，返回值为："+resultString);
		
		ResultBean resultBean = JSON.parseObject(resultString, ResultBean.class);
		
		if(StringUtils.isEmpty(resultBean)) {
			throw new Exception("请求授信模块返回值异常");
		}
		
		if(Constant.CODE_1000.equals(resultBean.getCode())) {
			throw new Exception(resultBean.getMessage());
		}
		
		String data = resultBean.getDataList().get(0);
		
		return StringUtils.isEmpty(data) ? Collections.emptyMap() : JSON.parseObject(data, HashMap.class);
	}
	
	/*
	 * 构造合同填写域值
	 * @return
	 */
	public static  Map<String,String> createConMap(String applicationId,Map<String,String> map,TokenBean tokenBean,ContractTemplate contractTemplate,
										RedisTemplate<Object,Object> redisTemplate, ContractAttributeMapper contractAttributeMapper,
										ContractNoMapper contractNoMapper,TPNContractToolService tPNContractToolService) throws Exception {
		logger.info("构造填合同模版域所有值---开始,参数：applicationId"+applicationId+"。map："+map+"。");
		LocalDate localDate = LocalDate.now();
		String currentYear = String.valueOf(localDate.getYear());
		String currentMonth = String.valueOf(localDate.getMonth().getValue());
		String currentDay = String.valueOf(localDate.getDayOfMonth());
		
		//存储合同模版编号的map
		String redisKey = ConstractTools.CON_NO_IDKEYS+applicationId;
		
		Map<Object, Object> entriesMap = null;
		if(CommonUtil.searchStr(ContractConstant.REGISTER_COMMON_STR, contractTemplate.getContractType())>-1) {//通用取合同方法
			entriesMap = tPNContractToolService.getOnePieceFinanceNo(redisKey, tokenBean);
		}else {//保理逻辑  取合同编号
			entriesMap = obtainsNosByApplicationId(redisTemplate, redisKey,tokenBean, contractAttributeMapper, contractNoMapper);
		}
		
		
		Iterator<Entry<Object, Object>> it = entriesMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Object, Object> entry = it.next();
			map.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
		}
		map.put("currentYear", currentYear);
		map.put("currentMonth", currentMonth);
		map.put("currentDay", currentDay);
		logger.info("构造填合同模版域所有值---结束");
		return map;
	}

	 /*
	  * 通过map 填充contractTemplate类
	  * 主键id 不参与操作
	 * @param contractTemplate
	 * @param map
	 */
	public static void reflectConstract(ContractTemplate contractTemplate,JSONObject obj) throws Exception{
		
		//参数校验-s
		if(!obj.containsKey("capitalId") || StringUtils.isEmpty(obj.getString("capitalId"))) {
			throw new Exception("出借方不能为空");
		}
		
		if(!obj.containsKey("contractName") || StringUtils.isEmpty(obj.getString("contractName"))) {
			throw new Exception("合同名称不能为空");
		}
		if(!obj.containsKey("contractType") || StringUtils.isEmpty(obj.getString("contractType"))) {
			throw new Exception("合同类型不能为空");
		}
		if(!obj.containsKey("fundNo") || StringUtils.isEmpty(obj.getString("fundNo"))) {
			throw new Exception("融资模式不能为空");
		}
		
		JSONArray signers = obj.getJSONArray("specialSigners");
		if(StringUtils.isEmpty(signers) || signers.size()<1) {
			throw new Exception("签署方不能为空");
		}
		//参数校验-e
		long companyId = 0;
		if(obj.containsKey("companyId") && !StringUtils.isEmpty(obj.getString("companyId"))) {
			companyId = Long.parseLong(obj.getString("companyId"));
		}
		contractTemplate.setCapitalId(Long.parseLong(obj.getString("capitalId")));
		contractTemplate.setCompanyId(companyId);
		contractTemplate.setContractName(obj.getString("contractName"));
		contractTemplate.setContractType(obj.getString("contractType"));
		contractTemplate.setFundNo(obj.getString("fundNo"));
		contractTemplate.setIsSpecialCompany(Integer.parseInt(obj.getString("isSpecialCompany")));
		
		String specualSigners = org.apache.commons.lang.StringUtils.join(signers, ",");
		
		contractTemplate.setSpecialSigners(specualSigners);
		contractTemplate.setPlaceholderNo(obj.getString("placeholderNo"));
//		
//		Method[] methods = ContractTemplate.class.getDeclaredMethods();
//		
//		Stream.of(methods)//循环每一个方法
//		.filter(x->x.getName().startsWith("set"))//取所有set方法
//		.forEach(x->{
//			String variable = String.valueOf(x.getName().substring(3).charAt(0)).toLowerCase()+x.getName().substring(3).substring(1);//取属性值 但是要保证当前元素还是方法
//			if(map.containsKey(variable) && !"id".equals(variable)) {//map中有的key  ， id不参与操作
//				try {
//					x.invoke(contractTemplate, map.get(variable));//反射方法
//				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
//					e.printStackTrace();
//				}
//			}
//		});
	 }
	
	/*
	 * 将给定文件 写入文字域
	 * @param map
	 * @param is
	 * @return
	 * @throws IOException
	 * @throws DocumentException
	 */
	public static byte[] stuffPDF(Map<String,String> map, InputStream is)
			throws Exception{
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		if(map==null || map.size()<1) {
			FileCopyUtils.copy(is, bos);
			return bos.toByteArray();
		}
		
		PdfReader pdfReader = new PdfReader(is);
		PdfStamper stamer = new PdfStamper(pdfReader,bos);
		AcroFields af = stamer.getAcroFields();
		 
		Iterator<Entry<String, String>> ite = map.entrySet().iterator();
		BaseFont bf = BaseFont.createFont("STSongStd-Light",  "UniGB-UCS2-H", false);

		while(ite.hasNext()) {
			 Entry<String, String>  entry = ite.next();
			 af.setFieldProperty(entry.getKey(), "textfont", bf, null);
			 af.setField(entry.getKey(), entry.getValue());
		}
		stamer.setFormFlattening(true);
		stamer.close();
		pdfReader.close();
		
		return bos.toByteArray();
	}
	
	/*
	 * 先从redis中取文件，如果没有命中，则从ftp文件系统中获取文件 刷新redis缓存 返回文件流InputStream
	 * 
	 * 重要的一点 文件在redis库中的key格式为：FileIdKeys+文件表主键id
	 * @param ftpClient
	 * @param file
	 * @param os
	 * @throws IOException
	 */
	public static InputStream getFile(final FTPClient ftpClient,	com.yonyou.scf.common.entity.File file,
								RedisTemplate<Object,Object> redisTemplate) throws Exception {
		
		if(file==null) {
			throw new NullPointerException("文件对象不能为空");
		}
		
		//先到redis中命中，如果没有命中则去ftp中取
		Optional<Object> fileArray = Optional.ofNullable((redisTemplate.opsForValue().get(FILEIDKEYS+file.getFileId())));
		
		//（1）redis命中则返回 （2）redis中没有命中，则去ftp系统中取
		if(fileArray.isPresent()) {
			String stringValue = (String)fileArray.get();
			
			FileRedisEntity fre = JSON.parseObject(stringValue, FileRedisEntity.class);
			
			InputStream is = new ByteArrayInputStream(fre.getFile()); 
			return is;
		}		
		
		InputStream is = getFileFromFTP(ftpClient, file);
		
		//刷新缓存
		flushFileRedis(file,is,redisTemplate, FILEIDKEYS);
		
		return is;
	}
	public static InputStream getFile(final FTPClient ftpClient,	String fileId,String subfix,
			RedisTemplate<Object,Object> redisTemplate) throws Exception {
		logger.info("getFile()开始获取文件。。。参数分别为：ftpClient："+ftpClient+"。fileId："+fileId+"。subfix："+subfix+"。redisTemplate："+redisTemplate);
		if(StringUtils.isEmpty(fileId)) {
			throw new NullPointerException("文件对象不能为空");
		}
		
		//先到redis中命中，如果没有命中则去ftp中取
		Optional<Object> fileArray = Optional.ofNullable((redisTemplate.opsForValue().get(FILEIDKEYS+fileId)));
		
		//（1）redis命中则返回 （2）redis中没有命中，则去ftp系统中取
		if(fileArray.isPresent()) {
			String stringValue = (String)fileArray.get();
			
			FileRedisEntity fre = JSON.parseObject(stringValue, FileRedisEntity.class);
			logger.info("Redis命中文件大小 3:"+fre.getFile().length);
			InputStream is = new ByteArrayInputStream(fre.getFile()); 
			logger.info("获取文件结束，成功获取。文件长度为："+fre.getFile().length);
			return is;
		}		
		ftpClient.changeWorkingDirectory(CONSTRACTPATH_IN_FTP);
		
		String str = new String((fileId+"."+subfix).getBytes("UTF-8"),"ISO8859-1");
		
		FTPFile[] files = ftpClient.listFiles(str);
		
		if(files.length<1) {
			throw new IOException("ftp系统中找不到指定文件");
		}
		logger.info("FTP获取文件大小 1:"+str.length());
		InputStream is = ftpClient.retrieveFileStream(str);
//		ByteArrayOutputStream bas = new ByteArrayOutputStream();
//		FileCopyUtils.copy(is, bas);
		
//		logger.info("获取文件结束，成功获取。文件为："+bas.toByteArray().length);
		return is;
	}
	
	/*
	 * 三个操作
	 * 1.根据输入流生成 合成图片 
	 * 2.刷新redis缓存  
	 * 3.删除临时图片 
	 * @param is
	 * @param tempPath
	 * @param redisTemplate
	 * @param imgIdInRedis
	 * @return
	 * @throws IOException
	 */
	public static byte[] pdfToOutputStream(InputStream is, String tempPath,
				RedisTemplate<Object,Object> redisTemplate, String fileId, String prefix) throws IOException {
		
		logger.info("根据流生成图片开始...");
		
		String tempPath_new = StringUtils.isEmpty(tempPath)?"":tempPath;
		
		logger.info("在redis中图片名为："+prefix+fileId);
		
		//合成png图片 用默认图片临时保存路径
		
		logger.info("内部分解文件开始...");
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		FileCopyUtils.copy(is, bos);
		String[] ids = CommonUtil.obtaisPDD(bos.toByteArray(),tempPath_new);
		logger.info("内部分解文件结束...成功。ids："+ids);
		//如果没有内容 直接返回
		if(ids==null) {
			return null;
		}
		
		//将合成的图片组装程一个图片，返回byte[]
		logger.info("合成图片开始....");
		ByteArrayOutputStream os = mergeImgsToOs(ids, tempPath_new);
		logger.info("合成图片结束....成功");
		
		if(os!=null) {
			//删除临时图片
			List<java.io.File> files = Stream.of(ids).map(x->tempPath_new+x+".png").map(y->{return new java.io.File(y);}).collect(Collectors.toList());
			long result = CommonUtil.deleteFile(files);
			System.out.println("当前删除临时图片的个数为："+result);
			
			//刷新redis
			FileRedisEntity fre = new FileRedisEntity();
			fre.setFileId(fileId);
			fre.setKeyPrefix(prefix);
			fre.setSubfix("png");
			fre.setFile(os.toByteArray());
			ConstractTools.flushFileRedis(fre, redisTemplate);
			logger.info("Redis更新文件大小 2:"+fre.getFile().length);
			
			return  os.toByteArray();
		}
		return null;
	}
	/*
	 * @param ids 合成前 图片名字集合，这些图片所在文件路径 是指定的临时文件路径
	 * @param tempath 临时路径
	 * @throws IOException
	 */
	public static ByteArrayOutputStream mergeImgsToOs(String[] ids, String tempPath) throws IOException {
		BufferedImage bi = null;
		
		List<BufferedImage> biList = new ArrayList<BufferedImage>();
		
		tempPath = StringUtils.isEmpty(tempPath)?new java.io.File("").getCanonicalPath()+"/"+CommonUtil.TEMPFILE+"/":tempPath;
		
		String tempFilePath = tempPath;
		
		for (String id : ids) {
			InputStream is  = null;
			String file = tempFilePath+id+".png";//仅支持pdf转图片
			
			//如果指定文件不存在 不报错 继续循环
			java.io.File fi = new java.io.File(tempFilePath+id+".png");
			if(!fi.exists()) {
				continue;
			}
			
			try {
				is = new FileInputStream(file);
				bi = ImageIO.read(is);
				biList.add(bi);
			} catch (FileNotFoundException e) {
				throw new FileNotFoundException("图片获取有误");
			}finally {
				if(is!=null) {
					is.close();
				}
			}
			
		}
		
		//没有取到任何图片 直接返回
		if(biList==null || biList.size()==0) {
			return null;
		}
		
		//整合后的宽度
		int sumWidth = biList.get(0).getWidth();
		//整合后的高度
		Optional<Integer> sumHeight = biList.stream().map(x->x.getHeight()).collect(Collectors.toList()).stream().reduce((x,y)->x+y);
		sumHeight.orElseGet(()->0);
		
		//构建整合后元素
		BufferedImage bfi = new BufferedImage(sumWidth,sumHeight.get(),BufferedImage.TYPE_INT_RGB);
		
		//记录每个图片的起始高度
		int everyImgHeight = 0;
		//向最终元素内填写值
		for (BufferedImage buf : biList) {
			bfi.setRGB(0, everyImgHeight, buf.getWidth(), buf.getHeight(),
					buf.getRGB(0, 0, buf.getWidth(), buf.getHeight(), new int[buf.getWidth() * buf.getHeight()], 0, buf.getWidth()),
					0, buf.getWidth());
			everyImgHeight+=buf.getHeight();
		}
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
		
		boolean bool = ImageIO.write(bfi, "png", baos);
		
		if(bool) {
			 return baos;
		}else {
			 return null;
		}
		
		//直接将合并后的文件 放入OutputStream中，不直接生成文件，所以下面代码省略。
		//boolean bool = ImageIO.write(bfi, "png", new java.io.File(tempFilePath+newId+".png"));
//		System.out.println(bool);
	}
	
	/*
	 * 客户端上传文件
	 * @param ftpClient
	 * @param is
	 * @param subfix
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public static File upFileToFTP(final FTPClient ftpClient, InputStream is, String subfix,RedisTemplate<Object,Object> redisTemplate)
			throws UnsupportedEncodingException, IOException {
		
		if(ftpClient==null || redisTemplate==null) {
			return null;
		}
		
		//组成文件名
		String key = CommonUtil.createFileId();
		
		String str = new String((key+"."+subfix).getBytes("UTF-8"),"ISO8859-1");
		
		ftpClient.changeWorkingDirectory(CONSTRACTPATH_IN_FTP);
		
		FTPFile[] files = ftpClient.listFiles(str);
		
		if(files.length>0) {
			throw new IOException("ftp系统中已经存在指定文件名");
		}
		
		boolean bool = ftpClient.storeFile(str, is);
		
		if(bool) {
			File file = new File();
			file.setFileId(key);
			file.setFilePath(CONSTRACTPATH_IN_FTP);
			file.setNameSubfix(subfix);
			
			//刷新缓存
			flushFileRedis(file,is,redisTemplate, FILEIDKEYS);
			
			return file;
		}
		
		return null;
	}
	
	/*
	 *将文件上传至ftp 
	 */
	public static boolean sendToFTPWithoutRedis(FTPClient ftPClient,String name,String subfix, byte[] bytes) throws Exception {
		
		return sendToFTPWithoutRedis(ftPClient, name, subfix,new ByteArrayInputStream(bytes));
	}
	/*
	 *将文件上传至ftp 
	 */
	public static boolean sendToFTPWithoutRedis(FTPClient ftPClient,String name,String subfix, InputStream is) throws Exception {
		//判断是否存在，只有上传失败才会返回false   已经存在 或者上传成功 true
		ftPClient.changeWorkingDirectory(CONSTRACTPATH_IN_FTP);
		
		String newName = new String((name+"."+subfix).getBytes("UTF-8"), "ISO8859-1");
		
		FTPFile[] files = ftPClient.listFiles(newName);
		if(files.length>1) {
			return true;
		}
		
		boolean bool = ftPClient.storeFile(newName, is);
		return bool;
	}
	
	/*
	 * 将临时的文件放入redis
	 * @param fileList
	 * @param x
	 * @param redisTemplate
	 * @throws IOException
	 */
	public static void upTempFileToRedis(List<FileRedisEntity> fileList, MultipartFile x,
						RedisTemplate<Object,Object> redisTemplate) throws IOException {
		logger.info("将附件对象转化为二进制流存储在redis中，返回FileRedisEntity实体类对象--开始");
		String uploadFilePath = x.getOriginalFilename();
		// 截取上传文件的文件名
		String uploadFileName = uploadFilePath.substring(uploadFilePath.lastIndexOf('\\') + 1, uploadFilePath.indexOf('.'));
		// 截取上传文件的后缀
		String uploadFileSuffix = uploadFilePath.substring( uploadFilePath.indexOf('.') + 1, uploadFilePath.length());
		//组成redis文件名
		String key = CommonUtil.createFileId();
		
		System.out.println("上传文件的文件名："+uploadFileName);
		System.out.println("上传文件的后缀："+uploadFileSuffix);
		System.out.println("文件名key："+key);
		
		FileRedisEntity fre = new FileRedisEntity();
		fre.setFileId(key);
		fre.setName(uploadFileName);
		fre.setSubfix(uploadFileSuffix);
		fre.setKeyPrefix(FILEIDKEYS);
		//将临时文件信息 放入指定包装类
		fileList.add(fre);
		
		@Cleanup ByteArrayOutputStream os = new ByteArrayOutputStream();
		//准备转化数组
		FileCopyUtils.copy(x.getInputStream(), os);
		fre.setFile(os.toByteArray());
		logger.info("将附件对象转化为二进制流存储在redis中，返回FileRedisEntity实体类对象--成功");
		//刷新缓存
		flushFileRedis(fre, redisTemplate);
	}
	
	/*
	 * 将客户端直接上传的文件 放入redis 并 上传至ftp 最后封装成file类 放入list
	 * Stream流操作 上传文件
	 * @param fileList
	 * @param x
	 */
	public static void upLoadFile(List<com.yonyou.scf.common.entity.File> fileList, MultipartFile x,FTPfixPool fTPfixPool,
							RedisTemplate<Object,Object> redisTemplate) {
		String uploadFilePath = x.getOriginalFilename();
		// 截取上传文件的文件名
		String uploadFileName = uploadFilePath.substring(uploadFilePath.lastIndexOf('\\') + 1, uploadFilePath.indexOf('.'));
		// 截取上传文件的后缀
		String uploadFileSuffix = uploadFilePath.substring( uploadFilePath.indexOf('.') + 1, uploadFilePath.length());
		//获取主键id
		long id = CreateID.createId();
		//当前时间
		String currentTime = Timer.getDateTimeNow(Timer.Role2);
		
		//获取
		FTPClient ftpClient = null;
		com.yonyou.scf.common.entity.File createFile = null;
		
		try {
			ftpClient = fTPfixPool.borrowFTP();
			createFile = upFileToFTP(ftpClient, x.getInputStream(), uploadFileSuffix,redisTemplate);
			//归还
			fTPfixPool.returnFTP(ftpClient);
			
			if(createFile!=null) {
				//TODO
				createFile.setId(id);
//			file.setCreUserId(creUserId);
				createFile.setGmtCreate(currentTime);
				createFile.setGmtModified(currentTime);
//			file.setModUserId(creUserId);
				createFile.setName(uploadFileName);
				createFile.setExclusiveNo("");//专属号
				createFile.setNameSubfix(uploadFileSuffix);
				createFile.setFilePath(ConstractTools.CONSTRACTPATH_IN_FTP);
				fileList.add(createFile);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * 从ftp中获取文件
	 * @param ftpClient
	 * @param com.yonyou.scf.common.entity.file
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public static InputStream getFileFromFTP(final FTPClient ftpClient, com.yonyou.scf.common.entity.File file)
			throws UnsupportedEncodingException, IOException {
		
		if(file==null || ftpClient==null) {
			return null;
		}
		
		String fileName = file.getFileId();
		String nameSubfix = file.getNameSubfix();
		String filePath = file.getFilePath();
		
		String str = new String((fileName+"."+nameSubfix).getBytes("UTF-8"),"ISO8859-1");
		
		ftpClient.changeWorkingDirectory(filePath);
		
		FTPFile[] files = ftpClient.listFiles(str);
		
		if(files.length<1) {
			throw new IOException("ftp系统中找不到指定文件");
		}
		
		InputStream is = ftpClient.retrieveFileStream(str);
		return is;
	}
	/*
	 * 从ftp中获取文件
	 * @param ftpClient
	 * @param com.yonyou.scf.common.entity.file
	 * @return
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	public static InputStream getFileFromFTP(final FTPClient ftpClient, String name,String subfix,String filePath)
			throws UnsupportedEncodingException, IOException {
		
		if(StringUtils.isEmpty(name) || StringUtils.isEmpty(subfix)) {
			return null;
		}
		
		String fileName = name;
		String nameSubfix = subfix;
		
		String str = new String((fileName+"."+nameSubfix).getBytes("UTF-8"),"ISO8859-1");
		
		ftpClient.changeWorkingDirectory(filePath);
		
		FTPFile[] files = ftpClient.listFiles(str);
		
		if(files.length<1) {
			throw new IOException("ftp系统中找不到指定文件");
		}
		
		InputStream is = ftpClient.retrieveFileStream(str);
		return is;
	}
	
	/*
	 *刷新文件redis缓存 value为byte[]
	 * @param idKey
	 * @param is
	 * @param redisTemplate
	 */
	public static void  flushRedisWithFile(String idKey,InputStream is,RedisTemplate<Object,Object> redisTemplate){
		
		if(is==null || redisTemplate==null) {
			return;
		}
		
			try {
				@Cleanup ByteArrayOutputStream bos = new ByteArrayOutputStream();
				 byte[] buffer = new byte[1024 * 4];
				 int n = 0;
			    while ((n = is.read(buffer)) != -1) {
			    		bos.write(buffer, 0, n);
			    }
				byte[] array =  bos.toByteArray();
				
				redisTemplate.opsForValue().set(idKey, array);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static byte[] getFullFormValue(String redisKey, RedisTemplate<Object,Object> redisTemplate,
			FTPClient ftpClient, boolean isGetImg) throws IOException {
		FileRedisEntity fre = null;
		if(isGetImg) {
			//1.直接去redis去找已经填写好的文件图片
			fre = ConstractTools.obtainsFileWithRedis(redisKey,ConstractTools.IMG_IDKEYS_STUFF, redisTemplate);
			
			if(fre!=null) {
				return fre.getFile(); 
			}
			logger.info("去redis直接命中填写好的文件图片失败...进入下一判断");
		}
		
		//1.1 直接去redis去找已经填写好的文件
		fre = ConstractTools.obtainsFileWithRedis(redisKey,ConstractTools.FILE_IDKEYS_STUFF, redisTemplate);
		byte[] imgByte = null;
		if(!StringUtils.isEmpty(fre)) {
			//生成图片 并刷新
			imgByte = ConstractTools.pdfToOutputStream(new ByteArrayInputStream(fre.getFile(), 0, fre.getFile().length), null, redisTemplate, redisKey, ConstractTools.IMG_IDKEYS_STUFF);
			
				logger.info("合成文件图片大小:"+imgByte.length);
				logger.info("去redis直接命中填写好的文件图片成功，即将直接返回.");
				
				return fre.getFile();
		}
		
		logger.info("去redis直接命中填写好的文件失败...进入下一判断");
		
		
		//2.如果redis中没有填写好的 ，去FTP中查看是否已经存在待签署的文件
		InputStream isFromFTP = null;
		try {
			isFromFTP = ConstractTools.getFileFromFTP(ftpClient, redisKey,"pdf",ConstractTools.CONSTRACTPATH_IN_FTP);//
		} catch (Exception e) {
		}
		
		if(isFromFTP!=null) {
			//现将文件刷新至redis
			ConstractTools.flushRedisWithFile(ConstractTools.FILE_IDKEYS_STUFF+redisKey,isFromFTP,redisTemplate);
			
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			FileCopyUtils.copy(isFromFTP, bos);
			imgByte = bos.toByteArray();
			logger.info("去ftp直接命中填写好的文件图片成功，即将直接返回.文件大小为："+imgByte.length);
			return imgByte;
		}
		return null;
	}
	
	/*
	 * 根据redisKey 去redis中取file 上传至ftp
	 * @param redisKey
	 * @param redisTemplate
	 * @param ftpClient
	 */
	public static void sendToFtpByKey(String fileId, RedisTemplate<Object,Object> redisTemplate,final FTPClient ftpClient) throws IOException {
		
		FileRedisEntity entity = obtainsFileWithRedis(fileId, FILEIDKEYS, redisTemplate);
		
		if(StringUtils.isEmpty(entity)) {
			throw new IOException("redis中不存在制定文件");
		}
		
		String str = new String((entity.getFileId()+"."+entity.getSubfix()).getBytes("UTF-8"),"ISO8859-1");
		
//		ftpClient.changeToParentDirectory();
		ftpClient.changeWorkingDirectory(CONSTRACTPATH_IN_FTP);
//		ftpClient.enterLocalPassiveMode();
		FTPFile[] files = ftpClient.listFiles(str);
		
		logger.info("File Name:"+str);
		if (null != files) {
			logger.info("FTP Files has "+files.length+" items.");	
		} else {
			logger.info("FTP Files Is Empty!");
		}
		
		logger.info("ftpClient.listNames().length:"+ftpClient.listNames().length);
		logger.info("ftpClient.listNames(str).length:"+ftpClient.listNames(str).length);
		
		for (FTPFile filesItme: files) {
		//	logger.info("FTP Files Name is :"+filesItme.getName()+"，Size is :"+filesItme.getSize()+"，Type Directory is :"+filesItme.isDirectory());	
		}
		
		if(files.length>0) {
			throw new IOException("ftp系统中已经存在指定文件名");
		}
		logger.info("开始上传附件至ftp系统,附件的fileId："+fileId);
		boolean bool = ftpClient.storeFile(str, new ByteArrayInputStream(entity.getFile(), 0, entity.getFile().length));
		if(!bool) {
			logger.warn("上传附件，fileId："+fileId+"失败");
			throw new IOException("上传失败");
		}
		logger.info("上传附件，fileId："+fileId+"成功");
	}
	/*
	 * 根据提供的entity 上传至ftp
	 * @param entity
	 * @param redisTemplate
	 * @param ftpClient
	 */
	public static void sendToFtpByEntity(FileRedisEntity entity, RedisTemplate<Object,Object> redisTemplate,final FTPClient ftpClient) throws IOException {
		String str = new String((entity.getFileId()+"."+entity.getSubfix()).getBytes("UTF-8"),"ISO8859-1");
		
		ftpClient.changeWorkingDirectory(CONSTRACTPATH_IN_FTP);
		
		FTPFile[] files = ftpClient.listFiles(str);
		
		if(files.length>0) {
			throw new IOException("ftp系统中已经存在指定文件名");
		}
		
		boolean bool = ftpClient.storeFile(str, new ByteArrayInputStream(entity.getFile(), 0, entity.getFile().length));
		if(!bool) {
			throw new IOException("上传失败");
		}
	}
	
	/*
	 * 根据redis中的key 取文件缓存数据
	 * @param redisKey
	 * @param redisTemplate
	 * @return 不存在或者json解析有误 返回null
	 */
	public static FileRedisEntity obtainsFileWithRedis(String fileId, String prefix, RedisTemplate<Object,Object> redisTemplate) {
		if(redisTemplate==null) {
			return null;
		}
		try {
			logger.info("根据rediskey取value开始，rediskey："+prefix+fileId);
			String entityString = (String)redisTemplate.opsForValue().get(prefix+fileId);
			logger.info("根据rediskey取value结束，rediskey："+prefix+fileId+"，结果：省略");//+entityString
			return JSON.parseObject(entityString, FileRedisEntity.class);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/*
	 * 根据临时文件包装类，进行刷新
	 * 刷新文件缓存  value为包含文件数组的实体类
	 * @param fre
	 * @param redisTemplate
	 */
	public static void flushFileRedis(FileRedisEntity fre, RedisTemplate<Object,Object> redisTemplate) {
		if(redisTemplate==null || fre==null) {
			return;
		}
		String stringValue = JSON.toJSONString(fre);
		redisTemplate.opsForValue().set(fre.getKeyPrefix()+fre.getFileId(), stringValue);
		logger.info("已将FileRedisEntity实体类刷新至redis");
	}
	
	/*
	 * 根据数据库中存的文件属性 刷新
	 * 刷新文件缓存  value为包含文件数组的实体类
	 * @param fre
	 * @param redisTemplate
	 * @param fix 前缀名
	 */
	public static void flushFileRedis(File file,InputStream is, RedisTemplate<Object,Object> redisTemplate, String fix) {
		
		if(redisTemplate==null || file==null || is==null) {
			return;
		}
		
		FileRedisEntity fre = null;
		try {
			fre = new FileRedisEntity(file,is);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String stringValue = JSON.toJSONString(fre);
		
		redisTemplate.opsForValue().set(fix+fre.getFileId(), stringValue);
	}

	/*
	 * 保存合同模版，验证是否重复， 规则：资方+融资模式+合同模板名称+核心企业名称	
	 * @param contractTemplate
	 * @param contractTemplateMapper
	 */
	public static boolean verifyRepeat(ContractTemplate contractTemplate, ContractTemplateMapper contractTemplateMapper) {
		logger.info("合同模版验证开始...");
		ContractTemplateExample contractTemplateExample = new ContractTemplateExample();
		contractTemplateExample.createCriteria().andCapitalIdEqualTo(contractTemplate.getCapitalId())
		.andCompanyIdEqualTo(contractTemplate.getCompanyId())
		.andContractNameEqualTo(contractTemplate.getContractName())
		.andFundNoEqualTo(contractTemplate.getFundNo());
		
		List<ContractTemplate> contractTemplateList = contractTemplateMapper.selectByExample(contractTemplateExample);
		
		if(contractTemplateList==null || contractTemplateList.size()<1) {
			logger.info("合同模版验证结束...没有重复");
			return true;
		}
		logger.info("合同模版验证结束...重复");
		return false;
		
	}
	
	public static Map<Object, Object> obtainsNosByApplicationId(RedisTemplate<Object, Object> redisTemplate, String redisKey,TokenBean tokenBean,
													ContractAttributeMapper contractAttributeMapper,ContractNoMapper contractNoMapper) throws Exception {
		Map<Object, Object> entriesMap = null;
		logger.info("去redis中取当前融资申请所有合同模版的一套编号，redis中的key："+redisKey);
		
		logger.info("确认redis中是否存在这套编号");
		if(!redisTemplate.hasKey(redisKey)) {
			logger.info("确认结果key不存在，新获取..");
			entriesMap = getOnePieceNo(tokenBean,contractAttributeMapper,contractNoMapper);
			redisTemplate.opsForHash().putAll(redisKey, entriesMap);
		}else {
			logger.info("确认结果key存在，继续确认是否可以取到值");
			entriesMap = redisTemplate.opsForHash().entries(redisKey);
			if(entriesMap!=null) {
				logger.info("确认结果key："+redisKey+"的一套编号存在");
				return entriesMap;
			}else {
				logger.info("确认结果key存在，但没有值，新获取..");
				entriesMap = getOnePieceNo(tokenBean,contractAttributeMapper,contractNoMapper);
				redisTemplate.opsForHash().putAll(redisKey, entriesMap);
			}
		}
		return entriesMap;
	}
	/*
	 * 取一套合同编号
	 * @param tokenBean
	 * @param contractAttributeMapper
	 * @param contractNoMapper
	 * @return
	 * @throws Exception
	 */
	public static Map<Object,Object> getOnePieceNo(TokenBean tokenBean, 
									ContractAttributeMapper contractAttributeMapper,ContractNoMapper contractNoMapper) throws Exception{
		Map<Object,Object> map = new HashMap<>();
		//如果日后加合同，这个地方需要改造
		map.put(ContractConstant.CONTRACT_BLHT_TYPE_KEY, getContractNoByRule(ContractConstant.CONTRACT_BLHT_TYPE,tokenBean,contractAttributeMapper,contractNoMapper));
		map.put(ContractConstant.CONTRACT_TZ_TYPE_KEY, getContractNoByRule(ContractConstant.CONTRACT_TZ_TYPE,tokenBean,contractAttributeMapper,contractNoMapper));
		map.put(ContractConstant.CONTRACT_DJ_TYPE_KEY, getContractNoByRule(ContractConstant.CONTRACT_DJ_TYPE,tokenBean,contractAttributeMapper,contractNoMapper));
		
		return map;
	}
	/*
	 * 根据合同序号 或许当前合同编号
	 * @param contractType
	 * @param bean
	 * @param mapper
	 * @param contractNoMapper
	 * @return
	 * @throws Exception
	 */
	public static String getContractNoByRule(String contractType,TokenBean bean,  ContractAttributeMapper mapper, ContractNoMapper contractNoMapper) throws Exception{
		ContractAttributeExample contractAttributeExample = new ContractAttributeExample();
		contractAttributeExample.createCriteria().andContractTypeEqualTo(contractType);
		List<ContractAttribute> contractAttributeList = mapper.selectByExample(contractAttributeExample);
		if(contractAttributeList==null || contractAttributeList.size()<1) {
			logger.info("..............当前合同没有编号");
			return "";
		}
		String rule = contractAttributeList.get(0).getContractGenerateRule();

		String currentTime = Timer.getDateTimeNow(Timer.Role6);
		rule = rule.replace(Constant.CONTRACT_NO_RULE, currentTime);
		
		//获取当前流水号
		String conGeneratNo = getConGeneratNo(contractType,bean,currentTime,contractNoMapper);
		return rule+conGeneratNo;
	}
	
	/*
	 * 获取合同流水号错误则抛出异常 正常则返回xxx
	 * @param contractType
	 * @param bean
	 * @param contractNoMapper
	 * @return
	 * @throws Exception
	 */
	public static String getConGeneratNo(String contractType,TokenBean bean,String limitDate,  ContractNoMapper contractNoMapper) throws Exception {
		logger.info("enter into getConGeneratNo..获取合同流水号方法");
		if(StringUtils.isEmpty(contractType)) {
			logger.warn("生成合同流水号有误，合同编号为空");
			throw new Exception("生成合同流水号有误，合同编号为空");
		}
		
		try {
			ContractNo contractNo = initCN(contractType,bean,limitDate, contractNoMapper);
			logger.info("获取流水号成功，合同类型为："+contractNo.getContractType()+"。限定日期为："+contractNo.getTimeLimit()+"。当前流水号为："+contractNo.getContractGenerateRule());
			return contractNo.getContractGenerateRule();
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("生成合同流水号有误，合同编号为："+contractType+"。错误信息："+e.getMessage());
		}
	}
	/*
	 * 当前流水号规则 只适用于  000
	 * @param contractType
	 * @param bean
	 * @param limitDate
	 * @param contractNoMapper
	 * @return
	 * @throws Exception
	 */
	public static ContractNo initCN (String contractType,TokenBean bean,String limitDate, ContractNoMapper contractNoMapper) throws Exception{
		ContractNo contractNo = null;
		String currentTime = Timer.getDateTimeNow(Timer.Role2);
//		String currentDate = Timer.getDateTimeNow(Timer.Role6);
		
		ContractNoExample contractNoExample = new ContractNoExample();
		contractNoExample.createCriteria().andContractTypeEqualTo(contractType).andTimeLimitEqualTo(limitDate);
		List<ContractNo> contractNoList = contractNoMapper.selectByExample(contractNoExample);
		DecimalFormat df = new DecimalFormat("000");
		
		lock.lock();
		logger.warn("获取生成合同流水号锁成功....");
		try {
			if(contractNoList==null || contractNoList.size()<1) {
				logger.info("合同类型为："+contractType+"。限定日期为："+limitDate+"。不存在流水号，新增开始...");
				contractNo = new ContractNo();
				Integer i = 1;//初始化流水号
				
				String j = df.format(i);
				
				contractNo.setContractGenerateRule(j);
				contractNo.setContractType(contractType);
				contractNo.setCreUserId(Long.parseLong(bean.getUserId()));
				contractNo.setGmtCreate(currentTime);
				contractNo.setId(CreateID.createId());
				contractNo.setTimeLimit(limitDate);
				contractNo.setGmtModified(currentTime);
				contractNo.setModUserId(Long.parseLong(bean.getUserId()));
				int resultInt = contractNoMapper.insert(contractNo);
				logger.info("合同类型为："+contractType+"。限定日期为："+limitDate+"。不存在流水号，新增结束...");
			}else {
				logger.info("合同类型为："+contractType+"。限定日期为："+limitDate+"。存在流水号，更新（+1）开始...");
				contractNo = contractNoList.get(0);
				String oldNo = contractNo.getContractGenerateRule();
				contractNo.setContractGenerateRule(df.format(Integer.parseInt(oldNo)+1));
				contractNo.setGmtModified(currentTime);
				contractNo.setModUserId(Long.parseLong(bean.getUserId()));
				int resultInt = contractNoMapper.updateByPrimaryKey(contractNo);
				logger.info("合同类型为："+contractType+"。限定日期为："+limitDate+"。存在流水号，更新（+1）结束...");
			}
		} finally {
			logger.info("释放生成合同流水号锁....");
			lock.unlock();
		}
		
		return contractNo;
	}
	
	
}

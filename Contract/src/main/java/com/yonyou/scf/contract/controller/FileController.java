package com.yonyou.scf.contract.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.contract.annotation.FileErrorImgAnno;
import com.yonyou.scf.contract.constant.Constant;
import com.yonyou.scf.contract.constant.IpFactory;
import com.yonyou.scf.contract.service.FileService;
import com.yonyou.scf.contract.utilEntity.FileResponseEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * 文件通用操作类
 * @author zhangjlm
 *
 */
@RestController
@Api(value = "所有类型的文件操作类",description = "v2.0 测试用")
//@RequestMapping("/fileControl")
@CrossOrigin
public class FileController {
	
	@Autowired
	private FileService fileService;
	
	/*
	 * idList Long类型  id集合
	 * zipName 下载的文件名字
	 * @param obj
	 * @param outputStream
	 */
	@ApiOperation(value="打包zip并下载",notes="V2.0测试用")
	@RequestMapping(value = "/zipDown", method = RequestMethod.GET)
	public void zipDown(@RequestParam(name="data") String obj, HttpServletResponse response){
		response.setContentType("multipart/form-data"); 
		response.setContentType("application/force-download");
		
		try {
			fileService.zipDown(obj,response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@ApiOperation(value="查看文件",notes="V2.0测试用")
	@RequestMapping(value = "/viewFile", method = RequestMethod.GET)
	@FileErrorImgAnno
	public void viewPDF(@RequestParam(name="fileId",required=false) String fileId,@RequestParam(name="id",required=false) String id, HttpServletResponse response) throws IOException, Exception{
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/png");
		
//		try {
			fileService.viewFile(fileId,id,response.getOutputStream());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	
	@ApiOperation(value="下载文件",notes="V2.0测试用")
	@RequestMapping(value = "/downFile", method = RequestMethod.GET)
	public void downPDF(@RequestParam(name="fileId",required=false) String fileId,@RequestParam(name="id",required=false) String id, HttpServletResponse response) {
		try {
			response.setContentType("multipart/form-data"); 
			response.setContentType("application/force-download");
			fileService.downFile(fileId,id,response);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	@ApiOperation(value="浏览打开文件调用--将文件存在临时路径redis",notes="V2.0测试用")
	@RequestMapping(value = "/upTempFile", method = RequestMethod.POST)
	public String upTempFile(HttpServletRequest request) {
		try {

			MultipartHttpServletRequest req =(MultipartHttpServletRequest)request;
			FileResponseEntity entityList = fileService.upTempFile(req);
			
			if(StringUtils.isEmpty(entityList)) {
				return "<script>location.href='" + URLConst.URL_WEBSITE
						+ "/upload.html?data=" + JSON.toJSONString(new ResultBean(Constant.CODE_1000,Constant.MSG_1000))
						+ "';</script>";
			}
			
			ResultBean bean = new ResultBean(Constant.CODE_2000,Constant.MSG_2000,Arrays.asList(JSON.toJSONString(entityList)));
			
			return "<script>location.href='" + URLConst.URL_WEBSITE
					+ "/upload.html?data=" + JSON.toJSONString(bean)
					+ "';</script>";
			
			} catch (Exception e) {
				e.printStackTrace();
				return "<script>location.href='" + URLConst.URL_WEBSITE
						+ "/upload.html?data=" + JSON.toJSONString(new ResultBean(Constant.CODE_1000,e.getMessage()))
						+ "';</script>";
		}
	}
	
	@ApiOperation(value="浏览打开文件调用--将文件存在临时路径redis",notes="V2.0测试用")
	@RequestMapping(value = "/upTempFileByIE", method = RequestMethod.POST)
	public String upTempFileByIE(HttpServletRequest request) {
		try {
			MultipartHttpServletRequest req =(MultipartHttpServletRequest)request;
			FileResponseEntity entityList = fileService.upTempFile(req);
			
			if(StringUtils.isEmpty(entityList)) {
//				return "<script>location.href='" + URLConst.URL_WEBSITE
//						+ "/upload.html?data=" + JSON.toJSONString(new ResultBean(Constant.CODE_1000,Constant.MSG_1000))
//						+ "';</script>";
				return JSON.toJSONString(new ResultBean(Constant.CODE_1000,Constant.MSG_1000));
			}
			
			ResultBean bean = new ResultBean(Constant.CODE_2000,Constant.MSG_2000,Arrays.asList(JSON.toJSONString(entityList)));
			
//			return "<script>location.href='" + URLConst.URL_WEBSITE
//					+ "/upload.html?data=" + JSON.toJSONString(bean)
//					+ "';</script>";
			return JSON.toJSONString(bean);
			
			} catch (Exception e) {
				e.printStackTrace();
//				return "<script>location.href='" + URLConst.URL_WEBSITE
//						+ "/upload.html?data=" + JSON.toJSONString(new ResultBean(Constant.CODE_1000,e.getMessage()))
//						+ "';</script>";
				return JSON.toJSONString(new ResultBean(Constant.CODE_1000,e.getMessage()));
		}
	}
	
	@ApiOperation(value="浏览打开文件调用--将文件存在临时路径redis",notes="V2.0测试用")
	@RequestMapping(value = "/upTempFile4FEP", method = RequestMethod.POST)
	public String upTempFile4FEP(HttpServletRequest request) {
		try {
			InputStream is = null;
			if (null != request.getInputStream()) {
				is = request.getInputStream();
			} else {
				return "<script>location.href='" + URLConst.URL_WEBSITE
						+ "/upload.html?data=" + JSON.toJSONString(new ResultBean(Constant.CODE_1000,Constant.MSG_1000))
						+ "';</script>";
			}
			
			String filename = request.getHeader("OriginalFilename");
			
			String finalName = new String((filename).getBytes("ISO8859-1"), "UTF-8");
			System.out.println("上传文件名："+finalName);

			FileResponseEntity entityList = fileService.upTempFile2(is, finalName);
			
			if(StringUtils.isEmpty(entityList)) {
				//return "Empty";
				return "<script>location.href='" + URLConst.URL_WEBSITE
						+ "/upload.html?data=" + JSON.toJSONString(new ResultBean(Constant.CODE_1000,Constant.MSG_1000))
						+ "';</script>";
			}
			
			ResultBean bean = new ResultBean(Constant.CODE_2000,Constant.MSG_2000,Arrays.asList(JSON.toJSONString(entityList)));
			
			//return "OK !!!";
			//return "<script>location.href='" + URLConst.URL_WEBSITE					+ "/upload.html?data=" + JSON.toJSONString(bean)					+ "';</script>";
			return JSON.toJSONString(bean);
			
			} catch (Exception e) {
			//return "Exception";
				e.printStackTrace();
				return "<script>location.href='" + URLConst.URL_WEBSITE
						+ "/upload.html?data=" + JSON.toJSONString(new ResultBean(Constant.CODE_1000,e.getMessage()))
						+ "';</script>";
		}
	}
	
	@ApiOperation(value="浏览打开文件调用--将文件存在临时路径redis",notes="V2.0测试用")
	@RequestMapping(value = "/upTempFileByIE4FEP", method = RequestMethod.POST)
	public String upTempFileByIE4FEP(HttpServletRequest request) {
		try {
			InputStream is = null;
			if (null != request.getInputStream()) {
				is = request.getInputStream();
			} else {
//				return "<script>location.href='" + URLConst.URL_WEBSITE
//						+ "/upload.html?data=" + JSON.toJSONString(new ResultBean(Constant.CODE_1000,Constant.MSG_1000))
//						+ "';</script>";
				return JSON.toJSONString(new ResultBean(Constant.CODE_1000,Constant.MSG_1000));
			}
			
			String filename = request.getHeader("OriginalFilename");
			
			String finalName = new String((filename).getBytes("ISO8859-1"), "UTF-8");
			System.out.println("上传文件名："+finalName);

			FileResponseEntity entityList = fileService.upTempFile2(is, finalName);
			
			if(StringUtils.isEmpty(entityList)) {
				//return "Empty";
//				return "<script>location.href='" + URLConst.URL_WEBSITE
//						+ "/upload.html?data=" + JSON.toJSONString(new ResultBean(Constant.CODE_1000,Constant.MSG_1000))
//						+ "';</script>";
				return JSON.toJSONString(new ResultBean(Constant.CODE_1000,Constant.MSG_1000));
			}
			
			ResultBean bean = new ResultBean(Constant.CODE_2000,Constant.MSG_2000,Arrays.asList(JSON.toJSONString(entityList)));
			
			//return "OK !!!";
			//return "<script>location.href='" + URLConst.URL_WEBSITE					+ "/upload.html?data=" + JSON.toJSONString(bean)					+ "';</script>";
			return JSON.toJSONString(bean);
			
			} catch (Exception e) {
			//return "Exception";
				e.printStackTrace();
//				return "<script>location.href='" + URLConst.URL_WEBSITE
//						+ "/upload.html?data=" + JSON.toJSONString(new ResultBean(Constant.CODE_1000,e.getMessage()))
//						+ "';</script>";
				return JSON.toJSONString(new ResultBean(Constant.CODE_1000,e.getMessage()));
		}
	}
	
	/*
	 * 如@ApiOperation所写
	 * @param obj
	 * @param request
	 * @return
	 */
	@ApiOperation(value="保存文件，入库，入ftp，返回file表主键id",notes="V2.0测试用")
	@RequestMapping(value = "/upSaveFile", method = RequestMethod.POST)
	public ResultBean upSaveFile(@RequestBody JSONObject obj,HttpServletRequest request) {
		try {
			return fileService.saveFile(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
}

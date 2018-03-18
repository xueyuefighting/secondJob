package com.yonyou.scf.contract.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.contract.constant.Constant;
import com.yonyou.scf.contract.constant.IpFactory;
import com.yonyou.scf.contract.gatewayBean.ResponseBean;
import com.yonyou.scf.contract.service.LFBankFileService;
import com.yonyou.scf.contract.utilEntity.FileResponseEntity;

//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "廊坊银行-前后端分离链条测试接口",description = "v2.0 测试用")
//@RequestMapping("/LFBankController")
@CrossOrigin
public class LFBankController {
	
	@Autowired
	private LFBankFileService lBankFileService;
	
	@ApiOperation(value="查看廊坊银行文件",notes="V2.0测试用")
	@RequestMapping(value = "/LFBankviewPDF", method = RequestMethod.GET)
	public void viewPDF(@RequestParam(name="fileId") String fileId, HttpServletResponse response){
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/png");
		
		try {
			lBankFileService.viewPdf(fileId, response.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@ApiOperation(value="下载廊坊银行文件",notes="V2.0测试用")
	@RequestMapping(value = "/LFBankdownPDF", method = RequestMethod.GET)
	public void downPDF(@RequestParam(name="fileId") String fileId, HttpServletResponse response) {
		try {
			lBankFileService.downFile(fileId, response);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}

	@ApiOperation(value="上传廊坊银行文件-没有最后提交",notes="V2.0测试用")
	@RequestMapping(value = "/LFBankupTempFile", method = RequestMethod.POST)
	public String upTempFile(HttpServletRequest request) {
		try {
			
			MultipartHttpServletRequest req =(MultipartHttpServletRequest)request;
			FileResponseEntity entityList = lBankFileService.upTempFile(req);
			
			ResultBean bean = null;
			
			if(StringUtils.isEmpty(entityList)) {
				bean = new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
			}else {
				bean = new ResultBean(Constant.CODE_2000,Constant.MSG_2000,Arrays.asList(JSON.toJSONString(entityList)));
			}
			
			return "<script>location.href='" + URLConst.URL_WEBSITE
					+ "/upload.html?data=" + JSON.toJSONString(bean)
					+ "';</script>";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	@ApiOperation(value="上传廊坊银行文件-提交",notes="V2.0测试用")
	@RequestMapping(value = "/LFBankupSaveFile", method = RequestMethod.POST)
	public String upSaveFile(HttpServletRequest request) {
		try {
			ObjectMapper om = new ObjectMapper();
			ResponseBean bean = new ResponseBean();
			
			MultipartHttpServletRequest req =(MultipartHttpServletRequest)request;
			List<FileResponseEntity> entityList = lBankFileService.upFile(req);
			
			bean.setCode(Constant.CODE_2000);
			bean.setMsg(Constant.MSG_2000);
			bean.setListCnt(entityList.size());
			bean.setList(entityList);
			
			return om.writeValueAsString(bean);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "";
	}
}

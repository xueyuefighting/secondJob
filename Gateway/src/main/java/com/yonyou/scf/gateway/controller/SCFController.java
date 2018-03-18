package com.yonyou.scf.gateway.controller;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.scf.common.schema1.domain.AgencyAdmin;
import com.yonyou.scf.gateway.service.SCFUdealService;
import com.yonyou.scf.tools.constant.DefaultConstants;
import com.yonyou.scf.tools.system.CodeException;
import com.yonyou.scf.tools.util.StringUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.sf.json.JSONObject;


@RestController
@RequestMapping("/SCFSERVICE")
@Api(value = "SCF对U接口", description = "v1.0 测试用")
public class SCFController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 @Autowired
	 private SCFUdealService scfUdealService;
	
	 @ApiOperation(value="短信接口", notes="v1.2 测试用")
	 @RequestMapping(value="/SCF/sendPhoneMessage",method = RequestMethod.POST)
	 public JSONObject sendPhoneMessage(@ApiParam("短信信息/JSON/BODY") @RequestBody Map<String,String> map){
		 JSONObject obj = new JSONObject();
		 if(!map.containsKey("PhoneNo") || StringUtil.isEmpty(map.get("PhoneNo"))){
			 obj.put("Status", DefaultConstants.ERR_0001_CODE);
			 obj.put("msg", "手机号不能为空！");
			 return obj;
		 }
		 
		 try {
			return scfUdealService.sendPhoneMessage(map.get("PhoneNo"));
		} catch (CodeException e) {
			obj.put("Status", DefaultConstants.ERR_0001_CODE);
			obj.put("msg", "发送失败，请检查手机号并重新发送！");
			return obj;
		}
	 }
	 @ApiOperation(value="修改账号和密码", notes="v1.2 测试用")
	 @RequestMapping(value="/SCF/modifyUserInfo",method = RequestMethod.POST)
	 public JSONObject modifyUserInfo(@ApiParam("管理员数据主键id") @RequestBody AgencyAdmin agencyAdmin){
		
		 return  scfUdealService.modifyUserInfo(agencyAdmin);
	 }
	 @ApiOperation(value="根据平台id查询平台名称", notes="v1.2 测试用")
	 @RequestMapping(value="/SCF/rePlatformNameById",method = RequestMethod.GET)
	 public JSONObject rePlatformNameById(@RequestParam("platformId") String platformId){
		 JSONObject obj = new JSONObject();
		 try {
			 obj.put("code", "2000");
			 String msg = scfUdealService.rePlatformNameById(platformId);
			 obj.put("msg", msg);
			return  obj;
		} catch (Exception e) {
			 obj.put("code", "0001");
			 obj.put("msg", e.getMessage());
			return  obj;
		}
	 }
	 @ApiOperation(value="获取当前登录人信息并记录当前登录信息", notes="v1.2 测试用")
	 @RequestMapping(value="/SCF/loginInfo",method = RequestMethod.GET)
	 public JSONObject loginInfo(HttpServletRequest request, HttpServletResponse response){
		 JSONObject obj = new JSONObject();
		 try {
			 obj =  scfUdealService.loginInfo(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 return obj;
		 
	 }
	 
}

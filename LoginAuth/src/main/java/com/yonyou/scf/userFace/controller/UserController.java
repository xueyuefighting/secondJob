package com.yonyou.scf.userFace.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.scf.common.mapper.auto.OperatorMapper;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.userFace.constant.Constant;
import com.yonyou.scf.userFace.service.MainService;
import com.yonyou.scf.userFace.utilEntity.LoginEntity;
import com.yonyou.scf.userFace.utilEntity.ResponseBean;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "前后端分离链条测试接口",description = "v2.0 测试用")
//@RequestMapping("/userLogin")
@CrossOrigin
public class UserController {
	
	@Autowired
	private MainService mainService;
	
	@ApiOperation(value="生成验证码图片",notes="V2.0测试用")
	@RequestMapping(value = "/genrateVerifyNo", method = RequestMethod.GET)
	public void genrateVerifyNo(@RequestParam("w")int w,@RequestParam("h")int h,@RequestParam("randomNum")String redisKey, HttpServletRequest request,HttpServletResponse resp) {
		resp.setHeader("Cache-Control", "no-cache");
		resp.setDateHeader("Expires", -1);
		resp.setContentType("image/jpg");
		try {
			OutputStream os = resp.getOutputStream();
			mainService.genrateVerifyNo(w, h,redisKey, os);
			if(os!=null) {
				os.close();
				resp.flushBuffer();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 返回redis的key 其中记录当前输入的用户名和密码（md5）
	 * 如果只存在一个业务角色， 输入正确的账户和密码之后 直接进入首页
	 * @param loginEntity
	 * @param request
	 * @return
	 */
	@ApiOperation(value="登录",notes="V2.0测试用")
	@RequestMapping(value = "/logIn", method = RequestMethod.POST)
	public String logIn(@RequestBody LoginEntity loginEntity,HttpServletRequest request) {
		return mainService.logIn(loginEntity,request);
	}
	/*
	 * 进入选择角色页面
	 * @param obj
	 * @param request
	 * @return
	 */
	@ApiOperation(value="进入选择角色页面",notes="V2.0测试用")
	@RequestMapping(value = "/getRoleKeys", method = RequestMethod.POST)
	public String getRoleKeys(@RequestBody JSONObject obj,HttpServletRequest request) {
		return mainService.getRoleKeys(obj);
	}
	/*
	 * 选择角色 成功之后 返回以后交互的用的token
	 * 直接进入首页
	 * @param loginEntity
	 * @param request
	 * @return
	 * String key = obj.getString("key");String roleId = obj.getString("roleId");
	 */
	@ApiOperation(value="选择角色",notes="V2.0测试用")
	@RequestMapping(value = "/selectRole", method = RequestMethod.POST)
	public String selectRole(@RequestBody JSONObject obj,HttpServletRequest request) {
		return mainService.selectRole(obj,request);
	}
	/*
	 * 回显选择角色的列表
	 * 切换角色成功后直接进入首页
	 * @param loginEntity
	 * @param request
	 * @return
	 * String key = obj.getString("key");String roleId = obj.getString("roleId");
	 */
	@ApiOperation(value="角色列表，切换角色",notes="V2.0测试用")
	@RequestMapping(value = "/roleList", method = RequestMethod.POST)
	public String roleList(@RequestBody String key,HttpServletRequest request) {
		return mainService.roleList(key,request);
	}
	@ApiOperation(value="获取拥有的业务角色数量，用于控制页面的‘切换角色’功能",notes="V2.0测试用")
	@RequestMapping(value = "/judgeRolesCnt", method = RequestMethod.GET)
	public String judgeRolesCnt(@RequestParam("key") String key) {
		return mainService.judgeRolesCnt(key);
	}
	
	@ApiOperation(value="登出",notes="V2.0测试用")
	@RequestMapping(value = "/logOut", method = RequestMethod.POST)
	public String logOut(@RequestBody JSONObject obj ,HttpServletRequest request) {
		
		if(org.springframework.util.StringUtils.isEmpty(obj) || !obj.containsKey("key")) {
			return JSON.toJSONString(new ResultBean(Constant.CODE_1000,Constant.MSG_1000)); 
		}
		
		return mainService.logOut(obj.getString("key"),request);
	}
	@ApiOperation(value="获取当前登录人的基本信息",notes="V2.0测试用")
	@RequestMapping(value = "/personInfo", method = RequestMethod.POST)
	public ResultBean personInfo(@RequestBody JSONObject obj ,HttpServletRequest request) {
		
		if(org.springframework.util.StringUtils.isEmpty(obj) || !obj.containsKey("key")) {
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000); 
		}
		
		return mainService.personInfo(obj.getString("key"),request);
	}
	@ApiOperation(value="获取token实体类",notes="V2.0测试用")
	@RequestMapping(value = "/getToken", method = RequestMethod.POST)
	public ResultBean getToken(@RequestBody JSONObject obj ,HttpServletRequest request) {
		
		if(org.springframework.util.StringUtils.isEmpty(obj) || !obj.containsKey("key")) {
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000); 
		}
		
		return mainService.getToken(obj.getString("key"),request);
	}
	
	@ApiOperation(value="登录失败次数清零",notes="V2.0测试用")
	@RequestMapping(value = "/resetLoginStatus", method = RequestMethod.POST)
	public ResultBean resetLoginStatus() {
		return mainService.resetLoginStatus();
	}
	
	/*
	 * 首页用户信息栏，展示信息
	 * @param obj 只有一个参数  token 的key
	 * @return
	 */
	@ApiOperation(value="首页用户信息栏，展示信息",notes="V2.0测试用")
	@RequestMapping(value = "/indexUserInfo", method = RequestMethod.POST)
	public ResultBean indexUserInfo(@RequestBody JSONObject obj) {
		try {
			return mainService.indexUserInfo(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000, e.getMessage());
		}
	}
	
}

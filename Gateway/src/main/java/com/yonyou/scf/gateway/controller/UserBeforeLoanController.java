package com.yonyou.scf.gateway.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.scf.common.schema1.vo.UserBeforeLoanVOE;
import com.yonyou.scf.common.tx.api.ResultBean;
import com.yonyou.scf.common.tx.gateway.AuthenticationVOE;
import com.yonyou.scf.gateway.service.UserBeforeLoanService;
import com.yonyou.scf.tools.constant.DefaultConstants;
import com.yonyou.scf.tools.system.CodeException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import net.sf.json.JSONObject;



@RestController
@RequestMapping("/SERVICE")
@Api(value = "用户贷前准备",description = "v1.0 测试用")


public class UserBeforeLoanController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserBeforeLoanService userBeforeLoanService;
	
	
	/*
	 * U订货贷前准备接口
	 * @param ubl
	 * @param result
	 * @return
	 */
	@ApiOperation(value="登录用户身份信息验证，调专页专用",notes="V1.0测试用")
	@RequestMapping(value="/EMP/userVerifyInfo",method=RequestMethod.POST)
	public ResultBean userVerifyInfo(@ApiParam("用户贷前准备/JSON/BODY") @RequestBody @Valid UserBeforeLoanVOE userBefroeLoan,//TxRequest txRequest
    		BindingResult result){
		
		if(result.hasErrors()){//实体类验证注解没有添加，待补全
			logger.error("贷前准备实体类校验失败...class resource is UserBeforeLoanController.ULinkBeforeLoanReady");
			System.out.println(result.getFieldError().getDefaultMessage());
			return new ResultBean(DefaultConstants.ERR_0001_CODE, DefaultConstants.ERR_0001_MSG);
		}
		ResultBean rb = null;
		try {
			rb = userBeforeLoanService.userVerifyInfo(userBefroeLoan);
		}catch(CodeException ide){
			rb = new ResultBean();
			rb.setCode(DefaultConstants.ERR_0001_CODE);
			rb.setMessage("无效用户");
			return rb;
		} catch (Exception e) {
			rb = new ResultBean();
			rb.setCode(DefaultConstants.ERR_0001_CODE);
			rb.setMessage(DefaultConstants.ERR_0001_MSG);
			e.printStackTrace();
		}//JsonUtil.toBean(txRequest.getJsonMessage(), UserBeforeLoan.class)
		return 	rb;	
			
	}
	/*
	 * U订货贷前准备接口
	 * @param ubl
	 * @param result
	 * @return
	 */
	@ApiOperation(value="贷前准备身份信息验证阶段",notes="V1.0测试用")
	@RequestMapping(value="/EMP/AuthenticationProcess",method=RequestMethod.POST)
	public ResultBean ULinkBeforeLoanReady(@ApiParam("用户贷前准备/JSON/BODY") @RequestBody @Valid UserBeforeLoanVOE userBefroeLoan,//TxRequest txRequest
			BindingResult result){
		
		if(result.hasErrors()){//实体类验证注解没有添加，待补全
			logger.error("贷前准备实体类校验失败...class resource is UserBeforeLoanController.ULinkBeforeLoanReady");
			System.out.println(result.getFieldError().getDefaultMessage());
			return new ResultBean(DefaultConstants.ERR_0001_CODE, DefaultConstants.ERR_0001_MSG);
		}
		ResultBean rb = null;
		try {
			rb = userBeforeLoanService.readyForApplication(userBefroeLoan);
		}catch(CodeException ide){
			rb = new ResultBean();
			rb.setCode(DefaultConstants.ERR_0001_CODE);
			rb.setMessage("无效用户");
			return rb;
		} catch (Exception e) {
			rb = new ResultBean();
			rb.setCode(DefaultConstants.ERR_0001_CODE);
			rb.setMessage(DefaultConstants.ERR_0001_MSG);
			e.printStackTrace();
		}//JsonUtil.toBean(txRequest.getJsonMessage(), UserBeforeLoan.class)
		return 	rb;	
		
	}
	
	@ApiOperation(value="手机验证码通过并跳转页面，update接口",notes="V1.0测试用")
	@RequestMapping(value="/EMP/updateAuthentication",method=RequestMethod.POST)
	public ResultBean updateAuthentication(@ApiParam("贷前准备身份信息验证，update接口/JSON/BODY") @RequestBody @Valid AuthenticationVOE authenticationVOE,//TxRequest txRequest
			BindingResult result){
		
		if(result.hasErrors()){//实体类验证注解没有添加，待补全
			logger.error("贷前准备身份信息验证实体类校验失败...class resource is UserBeforeLoanController.ULinkBeforeLoanReady");
			return new ResultBean(DefaultConstants.ERR_0001_CODE, DefaultConstants.ERR_0001_MSG);
		}
		ResultBean rb = null;
		try {
			rb = userBeforeLoanService.updateAuthentication(authenticationVOE);
		}catch(CodeException ide){
			rb = new ResultBean();
			rb.setCode(DefaultConstants.ERR_0001_CODE);
			rb.setMessage("无效用户");
			return rb;
		}catch (Exception e) {
			logger.error("贷前准备身份信息验证实体类校验失败",e);
			return new ResultBean(DefaultConstants.ERR_0001_CODE, DefaultConstants.ERR_0001_MSG);
		}//JsonUtil.toBean(txRequest.getJsonMessage(), UserBeforeLoan.class)
		return 	rb;	
		
	}
	
	@ApiOperation(value="校验证书信息",notes="V1.0测试用")
	@RequestMapping(value="/EMP/QUALIFICATION/checkQuality",method=RequestMethod.POST)
	public ResultBean checkQuality(@ApiParam("证书相关信息 /JSON/BODY")@RequestBody JSONObject obj){
		ResultBean rb = new ResultBean();
		try {
			return userBeforeLoanService.checkQuality(obj);
		} catch (Exception e) {
			rb.setCode("0001");
			rb.setMessage("系统内部获取参数有误，请刷新页面。");
			return rb;
		}
		
	}
	
	
	
	@ApiOperation(value="根据资方获取合同信息",notes="V1.0测试用")
	@RequestMapping(value="/EMP/USERBEFORELOAN/capitalDetails",method=RequestMethod.POST)
	public ResultBean capitalDetails(@ApiParam("用户贷前准备/JSON/BODY") @RequestBody JSONObject jsonObject){
		ResultBean array = new ResultBean();
			try {
				array = userBeforeLoanService.capitalDetails(jsonObject);
			} catch (Exception e) {
				e.printStackTrace();
				array.setCode("0001");
				array.setMessage("参数有误或系统异常，请尝试刷新页面");
			}
		return array;
	}
	
	@ApiOperation(value="获取明文信息",notes="V1.0测试用")
	@RequestMapping(value="/EMP/USERBEFORELOAN/signInfo",method=RequestMethod.POST)
	public ResultBean userAct1(@ApiParam("获取明文信息-u盾/JSON/BODY") @RequestBody JSONObject obj){

		ResultBean rb = new ResultBean();
		try {
			rb.setCode("2000");
			rb.setMessage("操作信息成功");
			rb.setDataListCnt(1);
			rb.setDataList(Arrays.asList(new String[]{userBeforeLoanService.signInfo(obj).toString()}));
		} catch (Exception e) {
			e.printStackTrace();
			rb.setCode("0001");
			rb.setMessage(e.getMessage());
		}
		
		return  rb;

	}
	@ApiOperation(value="获取明文信息",notes="V1.0测试用")
	@RequestMapping(value="/EMP/USERBEFORELOAN/signInfoByPact",method=RequestMethod.POST)
	public ResultBean signInfoByPact(@ApiParam("获取明文信息-合同/JSON/BODY") @RequestBody JSONObject obj){
		
		ResultBean rb = new ResultBean();
		try {
			rb.setCode("2000");
			rb.setMessage("操作信息成功");
			rb.setDataListCnt(1);
			rb.setDataList(Arrays.asList(new String[]{userBeforeLoanService.signInfoByPact(obj).toString()}));
		} catch (Exception e) {
			e.printStackTrace();
			rb.setCode("0001");
			rb.setMessage(e.getMessage());
		}
		
		return  rb;
		
	}
	@ApiOperation(value="下载u盾使用授权书",notes="V1.0测试用")
	@RequestMapping(value="/EMP/USERBEFORELOAN/downLoadQualification",method=RequestMethod.GET)
	public ResultBean downLoadQualification(@RequestParam("idName")String idName,//ftp中的文件名字
			@RequestParam(name="filePath",required=false)String filePath,
			@RequestParam(name="showUserFileName")String showUserFileName,//下载时候，可用户看的文件名字
			HttpServletRequest req, HttpServletResponse response){
		
		ResultBean rb = new ResultBean();
		try {
			rb.setCode("2000");
			rb.setMessage("下载成功");
			userBeforeLoanService.downLoadQualification(idName,filePath,showUserFileName,response);
		} catch (Exception e) {
			e.printStackTrace();
			rb.setCode("0001");
			rb.setMessage(e.getMessage());
		}
		
		return  rb;
		
	}
	@ApiOperation(value="绑定u盾，实际是存数据",notes="V1.0测试用")
	@RequestMapping(value="/EMP/USERBEFORELOAN/addLccbUsbKey",method=RequestMethod.POST)
	public ResultBean addLccbUsbKey(@ApiParam("用绑定u盾/JSON/BODY") @RequestBody JSONObject obj){
		
		ResultBean rb = new ResultBean();
		try {
			rb.setCode("2000");
			rb.setMessage("签署成功");
			JSONObject resultObj = userBeforeLoanService.addLccbUsbKey(obj);
			rb.setDataListCnt(1);
			rb.setDataList(Arrays.asList(new String[]{resultObj.toString()}));
		} catch (Exception e) {
			e.printStackTrace();
			rb.setCode("0001");
			rb.setMessage(e.getMessage());
		}
		
		return  rb;
		
	}
	
	@ApiOperation(value="签署合同",notes="V1.0测试用")
	@RequestMapping(value="/EMP/USERBEFORELOAN/signPact",method=RequestMethod.POST)
	public ResultBean signPact(@ApiParam("签署合同/JSON/BODY") @RequestBody JSONObject obj){
		
		ResultBean rb = new ResultBean();
		try {
			JSONObject resultObj = userBeforeLoanService.signPact(obj);
			if("ok".equals(resultObj.getString("Status"))){
				rb.setCode("2000");
				rb.setMessage("签署成功");
				rb.setDataListCnt(1);
				rb.setDataList(Arrays.asList(new String[]{resultObj.toString()}));
			}else{
				rb.setCode("0001");
				rb.setMessage(resultObj.getString("Msg"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return  rb;
		
	}
	
}

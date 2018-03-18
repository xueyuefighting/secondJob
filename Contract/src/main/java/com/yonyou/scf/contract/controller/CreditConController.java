package com.yonyou.scf.contract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.scf.common.input.FDDFinanceConListBAS;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.contract.constant.Constant;
import com.yonyou.scf.contract.gatewayBean.ResponseBean;
import com.yonyou.scf.contract.service.CreditConService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "授信合同配置",description = "v2.0 测试用")
//@RequestMapping("/creditCon")
@CrossOrigin
public class CreditConController {
	@Autowired
	private CreditConService creditConService;
	
	@ApiOperation(value="授信合同配置，合同模版查询列表",notes="V2.0测试用")
	@RequestMapping(value = "/conTemplateList", method = RequestMethod.POST)
	public ResultBean conTemplateList(@RequestBody JSONObject obj){
		
		try {
			return creditConService.conTemplateList(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	@ApiOperation(value="回显-贷前签署合同-法大大（包含授信信息-旭哥提供（只给授信id））",notes="V2.0测试用")
	@RequestMapping(value = "/beforeLoanConList", method = RequestMethod.GET)
	public ResultBean beforeLoanConList(@RequestParam("token") String token, @RequestParam("creditId") String creditId){
		
		try {
			return creditConService.beforeLoanConList(token,creditId);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	@ApiOperation(value="回显-贷前待办签署页面-法大大",notes="V2.0测试用")//包含融资申请信息-哥提供
	@RequestMapping(value = "/creditDetail", method = RequestMethod.POST)
	public ResultBean creditDetail(@RequestBody JSONObject obj){
		try {
			return creditConService.creditDetail(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	@ApiOperation(value="回显-融资申请待办签署页面-法大大",notes="V2.0测试用")//包含融资申请信息-哥提供
	@RequestMapping(value = "/financeDetail", method = RequestMethod.POST)
	public ResultBean financeDetail(@RequestBody JSONObject obj){
		try {
			return creditConService.financeDetail(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	@ApiOperation(value="回显-融资申请签署合同-法大大（（融资申请id）--签署过的合同(业务场景：详情展示、仅合同查看阶段)）",notes="V2.0测试用")//包含融资申请信息-哥提供
	@RequestMapping(value = "/FDDFinanceConListAS", method = RequestMethod.POST)
	public ResultBean financeConListAfterSigned(@RequestBody JSONObject obj){
		try {
			return creditConService.financeConListAfterSigned(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	@ApiOperation(value="回显-融资申请签署合同-法大大（（融资申请id）--待签和已签署的合同（业务场景：申请融资下一步、申请融资下一步根据融资申请id刷新当前页面、待办签署页面））",notes="V2.0测试用")//包含融资申请信息-哥提供
	@RequestMapping(value = "/FDDFinanceConListBAS", method = RequestMethod.POST)
	public ResultBean financeConListBeforeAllSigned(@RequestBody FDDFinanceConListBAS fDDFinanceConListBAS){
		
		try {
			return creditConService.financeConListBeforeAllSigned(fDDFinanceConListBAS);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	@ApiOperation(value="授信配置合同保存",notes="V2.0测试用")
	@RequestMapping(value = "/saveCreditOption", method = RequestMethod.POST)
	public ResultBean saveCreditOption(@RequestBody JSONObject obj){
		
		try {
			return creditConService.saveCreditOption(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	@ApiOperation(value="授信配置合同-查询（必须入参：token和授信id）",notes="V2.0测试用")
	@RequestMapping(value = "/selectCreditOption", method = RequestMethod.POST)
	public ResultBean selectCreditOption(@RequestBody JSONObject obj){
		
		try {
			return creditConService.selectCreditOption(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
}

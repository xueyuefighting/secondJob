package com.yonyou.scf.contract.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.scf.common.input.Finance1025Request;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.contract.annotation.FileErrorImgAnno;
import com.yonyou.scf.contract.constant.Constant;
import com.yonyou.scf.contract.gatewayBean.ResponseBean;
import com.yonyou.scf.contract.service.FDDFileService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "法大大-前后端分离链条测试接口",description = "v2.0 测试用")
//@RequestMapping("/fddConstract")
@CrossOrigin
public class FDDController {
	
	@Autowired
	private FDDFileService fDDFileService;
	
	@ApiOperation(value="浏览贷前合同文件-法大大",notes="V2.0测试用")
	@RequestMapping(value = "/viewNewPDFCredit", method = RequestMethod.GET)
	@FileErrorImgAnno
	public void viewNewPDFCredit(@RequestParam(name="id") String id,@RequestParam(name="token") String token,HttpServletResponse response) throws Exception {
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/png");
		fDDFileService.viewNewPDFCredit(id,token, response);
	}
	@ApiOperation(value="下载贷前文件-法大大",notes="V2.0测试用")
	@RequestMapping(value = "/downNewPDFCredit", method = RequestMethod.GET)
	public void downNewPDFCredit(@RequestParam(name="id") String id,@RequestParam(name="token") String token,
								HttpServletResponse response) {
		response.setContentType("multipart/form-data"); 
		response.setContentType("application/force-download");
		try {
			fDDFileService.downNewPDFCredit(id,token, response);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
	@ApiOperation(value="浏览签署后---的融资申请合同文件-法大大",notes="V2.0测试用")
	@RequestMapping(value = "/viewAfterCon", method = RequestMethod.GET)
	@FileErrorImgAnno
	public void viewAfterCon(@RequestParam(name="token") String token,
							@RequestParam(name="financeId") String financeId,
							@RequestParam(name="fileId") String fileId,
							HttpServletResponse response) throws Exception {
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/png");
		fDDFileService.viewAfterCon(token,financeId,fileId, response);
	}
	@ApiOperation(value="下载签署后---融资申请合同文件页面-法大大",notes="V2.0测试用")
	@RequestMapping(value = "/downAfterCon", method = RequestMethod.GET)
	public void downAfterCon(@RequestParam(name="token") String token,
							@RequestParam(name="financeId") String financeId,
							@RequestParam(name="fileId") String fileId,
							HttpServletResponse response) {
		response.setContentType("multipart/form-data"); 
		response.setContentType("application/force-download");
		try {
			fDDFileService.downAfterCon(token,financeId,fileId, response);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
	/*
	 * 法大大-贷前合同-签署
	 * @param serialNum 签署流水号
	 * @param token
	 * @return
	 */
	@ApiOperation(value="法大大-贷前合同-签署",notes="V2.0测试用")
	@RequestMapping(value = "/creditConSign", method = RequestMethod.POST)
	public ResultBean creditConSign(@RequestBody JSONObject obj) {
		//根据合同签署表 业务唯一键 transactionId  修改签署状态为 “已签署”
		try {
			return fDDFileService.creditConSign(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000, e.getMessage());
		}
			
	}
	/*
	 * 法大大-融资申请合同确认页面-签署
	 * @param serialNum 签署流水号
	 * @param token
	 * @return 签署页面的链接
	 */
	@ApiOperation(value="法大大-融资申请合同确认页面-签署",notes="V2.0测试用")
	@RequestMapping(value = "/financeConSignConfirm", method = RequestMethod.POST)
	public ResultBean financeConSignConfirm(@RequestBody JSONObject obj) {
		try {
			return fDDFileService.financeConSignConfirm(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000, e.getMessage());
		}
	}
	@ApiOperation(value="下载融资申请合同文件-签署过的-法大大((目前使用))",notes="V2.0测试用")
	@RequestMapping(value = "/downNewPDFFinance", method = RequestMethod.GET)
	public void downNewPDFFinanceAS(@RequestParam("value") String value,
			HttpServletResponse response) {
		response.setContentType("multipart/form-data"); 
		response.setContentType("application/force-download");
		try {
//			fDDFileService.downNewPDFFinanceAS(obj, response);
			fDDFileService.downFormFinance(value, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@ApiOperation(value="签署之前，填写值之后的文件查看-法大大((目前使用))",notes="V2.0测试用")
	@RequestMapping(value = "/financeConViewConfirm", method = RequestMethod.GET)
	@FileErrorImgAnno
	public void viewNewPDFFinanceConfirm(@RequestParam("value") String value,
			HttpServletResponse response) throws Exception {
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		response.setContentType("image/png");
		fDDFileService.viewFormFinance(value, response);
	}
	/*
	 * 后台调后台
	 * JSONObject对象中，如果不存在fileIdMap 或者fileIdMap的值为空，那么直接返回2000-没有需要签署的合同
	 * @param obj
	 * @param response
	 * @return
	 */
	@ApiOperation(value="融资申请确认页面，保存-法大大",notes="V2.0测试用")
	@RequestMapping(value = "/savePDFFinanceConfirm", method = RequestMethod.POST)
	public ResultBean savePDFFinanceConfirm(@RequestBody JSONObject obj,
			HttpServletResponse response) {
		try {
			return fDDFileService.savePDFFinanceConfirm(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000, e.getMessage());
		}
	}
	/*
	 * 法大大-融资申请合同-签署
	 * @param serialNum 签署流水号
	 * @param token
	 * @return
	 */
	@ApiOperation(value="法大大-融资申请合同-签署",notes="V2.0测试用")
	@RequestMapping(value = "/financeConSign", method = RequestMethod.POST)
	public ResultBean financeConSign(@RequestBody JSONObject obj) {
		try {
			return fDDFileService.financeConSign(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000, e.getMessage());
		}
	}
	@ApiOperation(value="法大大-贷前合同-签署后提交",notes="V2.0测试用")
	@RequestMapping(value = "/submitCredit", method = RequestMethod.POST)
	public ResultBean submitCredit(@RequestBody JSONObject obj) {
		try {
			return fDDFileService.submitCredit(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000, e.getMessage());
		}
	}
	@ApiOperation(value="法大大-融资申请合同-签署后提交",notes="V2.0测试用")
	@RequestMapping(value = "/submitFinance", method = RequestMethod.POST)
	public ResultBean submitFinance(@RequestBody JSONObject obj) {
		try {
			return fDDFileService.submitFinance(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000, e.getMessage());
		}
	}
	/*
	 * 法大大-签署后回调接口-融资申请合同
	 * @param serialNum 签署流水号
	 * @return
	 */
	@ApiOperation(value=" 法大大-签署后回调接口-融资申请",notes="V2.0测试用")
	@RequestMapping(value = "/FDDCallBackFinance", method = RequestMethod.GET)
	public ResultBean FDDCallBackFinance(@RequestParam("serialNum") String serialNum, @RequestParam("signTime") String signTime) {
		try {
			return fDDFileService.FDDCallBackFinance(serialNum, signTime);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000, e.getMessage());
		}
	}
}

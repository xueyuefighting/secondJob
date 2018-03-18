package com.yonyou.scf.contract.controller;

import java.util.Arrays;
import java.util.List;

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
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.contract.constant.Constant;
import com.yonyou.scf.contract.constant.IpFactory;
import com.yonyou.scf.contract.gatewayBean.ResponseBean;
import com.yonyou.scf.contract.service.ContractService;
import com.yonyou.scf.contract.service.FileService;
import com.yonyou.scf.contract.utilEntity.FileResponseEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * 合同模版操作类
 * @author zhangjlm
 *
 */
@RestController
@Api(value = "合同模版操作类",description = "v2.0 测试用")
//@RequestMapping("/contractController")
@CrossOrigin
public class ContractController {
	@Autowired
	private ContractService contractService;
	
	@ApiOperation(value="合同模版类型的查询",notes="V2.0测试用")
	@RequestMapping(value = "/contractTypeList", method = RequestMethod.POST)
	public ResultBean contractTypeList(@RequestBody JSONObject obj,HttpServletRequest request) {
		try {
			return contractService.contractTypeList(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	@ApiOperation(value="合同模版列表",notes="V2.0测试用")
	@RequestMapping(value = "/contractList", method = RequestMethod.POST)
	public ResultBean contractList(@RequestBody JSONObject obj,HttpServletRequest request) {
		try {
			return contractService.selectContractList(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	@ApiOperation(value="上传或更改合同附件",notes="V2.0测试用")
	@RequestMapping(value = "/saveOrUpdateFileEntity", method = RequestMethod.POST)
	public ResultBean saveOrUpdateFileEntity(@RequestBody JSONObject obj,HttpServletRequest request) {
		try {
			return contractService.saveOrUpdateFileEntity(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	@ApiOperation(value="保存或更新合同模版",notes="V2.0测试用")
	@RequestMapping(value = "/saveOrUpdateConTempl", method = RequestMethod.POST)
	public ResultBean saveOrUpdateConTempl(@RequestBody JSONObject obj,HttpServletRequest request) {
		try {
			return contractService.saveOrUpdateConTempl(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	@ApiOperation(value="根据授信id查询所有合同（根据file表的主键id去重）",notes="V2.0测试用")
	@RequestMapping(value = "/selectConsByCreditId", method = RequestMethod.POST)
	public ResultBean selectConsByCreditId(@RequestBody JSONObject obj,HttpServletRequest request) {
		try {
			return contractService.selectConsByCreditId(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
	@ApiOperation(value="根据资方获取核心企业id-name",notes="V2.0测试用")
	@RequestMapping(value = "/selectHX", method = RequestMethod.POST)
	public ResultBean selectHX(@RequestBody JSONObject obj) {
		try {
			return contractService.selectHX(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResultBean(Constant.CODE_1000,Constant.MSG_1000);
		}
	}
}

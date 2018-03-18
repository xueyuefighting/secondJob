package com.yonyou.scf.gateway.controller;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.scf.common.tx.api.ResultBean;
import com.yonyou.scf.common.tx.api.TxRequest;
import com.yonyou.scf.common.tx.gateway.Scf1205Response;
import com.yonyou.scf.common.tx.gateway.Scf1215Response;
import com.yonyou.scf.gateway.service.FinancingApplicationService;
import com.yonyou.scf.gateway.service.SCFUdealService;
import com.yonyou.scf.gateway.service.UserBeforeLoanService;
import com.yonyou.scf.tools.constant.DefaultConstants;
import com.yonyou.scf.tools.lang.json.JsonUtil;
import com.yonyou.scf.tools.system.CodeException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value = "网关接口测试",description = "v1.0 测试用")
public class GatewayConcoller {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private SCFUdealService scfUdealService;
	@Autowired
	private UserBeforeLoanService userBeforeLoanService;
	@Autowired
	private FinancingApplicationService financingApplicationService;

	/*
	 * 批次开通融资意向用户
	 * 
	 * @param fiGroup
	 * 
	 * @return
	 */
	@ApiOperation(value="批量开通",notes="V1.0测试用")
	@RequestMapping(value = "/SCF1103", method = RequestMethod.POST)
	public ResultBean insertSCF1103(@ApiParam("人员信息/JSON/BODY") @RequestBody TxRequest tx) {
		
		logger.info("SCF1103 request:"+tx.toString());
																							
		ResultBean rb = new ResultBean();
		try {
			// 开始业务操作
			int resultInt = scfUdealService.insertFITs(tx);
			rb.setCode(DefaultConstants.SUCCESS_RESPONSE_CODE);
			rb.setMessage(DefaultConstants.SUCCESS_RESPONSE_MESSAGE);
			rb.setDataListCnt(resultInt);
		} catch (Exception e) {
			// logger.error("实体类校验失败...class resource is SCFController.insertFITs");
			rb.setCode(DefaultConstants.ERR_0001_CODE);
			rb.setMessage(DefaultConstants.ERR_0001_MSG);
			System.out.println(e.getMessage());
		}


		logger.info("SCF1103 response:"+rb.toString());
		return rb;
	}

	/*
	 * 融资交易查询
	 * 
	 * @return
	 */
	@ApiOperation(value = "融资申请交易查询接口", notes = "V1.0测试用")
	@RequestMapping(value = "/SCF1205", method = RequestMethod.POST)
	public ResultBean querySCF1205(@ApiParam("融资申请交易查询/JSON/BODY") @RequestBody TxRequest tx) {
		logger.info("SCF1205 request:"+tx.toString());
		
		Scf1205Response resultBean = new Scf1205Response();
		
		ResultBean rb = new ResultBean();
		
		try {
			resultBean = financingApplicationService.querySCF1205(tx);
		} catch (CodeException e) {
			System.out.println(e.getMessage());

			rb.setCode(e.getCode());
			rb.setMessage(e.getMessage());
			rb.setDataList(null);
			rb.setDataListCnt(0);
			return rb;
		}
		
		ArrayList<String> list = resultBean.getDataList()
											.parallelStream()
											.map(x->JsonUtil.toJSONString(x))
											.collect(Collectors.toCollection(ArrayList::new));
		
		rb.setCode(resultBean.getCode());
		rb.setMessage(resultBean.getMessage());
		rb.setDataListCnt(list.size());
		rb.setDataList(list);

		logger.info("SCF1205 response:"+rb.toString());
		return rb;

	}
	/*
	 * 应收账款融资交易查询
	 * 
	 * @return
	 */
	@ApiOperation(value = "应收账款融资申请交易查询接口", notes = "V1.0测试用")
	@RequestMapping(value = "/SCF1215", method = RequestMethod.POST)
	public ResultBean querySCF1215(@ApiParam("融资申请交易查询/JSON/BODY") @RequestBody TxRequest tx) {
		logger.info("SCF1215 request:"+tx.toString());
		
		Scf1215Response resultBean = new Scf1215Response();
		
		ResultBean rb = new ResultBean();
		
		try {
			resultBean = financingApplicationService.querySCF1215(tx);
		} catch (CodeException e) {
			System.out.println(e.getMessage());
			
			rb.setCode(e.getCode());
			rb.setMessage(e.getMessage());
			rb.setDataList(null);
			rb.setDataListCnt(0);
			return rb;
		}
		
		ArrayList<String> list = resultBean.getDataList()
				.parallelStream()
				.map(x->JsonUtil.toJSONString(x))
				.collect(Collectors.toCollection(ArrayList::new));
		
		rb.setCode(resultBean.getCode());
		rb.setMessage(resultBean.getMessage());
		rb.setDataListCnt(list.size());
		rb.setDataList(list);
		
		logger.info("SCF1215 response:"+rb.toString());
		return rb;
		
	}

	/*
	 * /* U订货用户贷前准备状态查询接口
	 * 
	 * @return
	 */
	@ApiOperation(value = "贷前准备状态查询接口", notes = "V1.0测试用")
	@RequestMapping(value = "/SCF1115", method = RequestMethod.POST)
	public ResultBean querySCF1115(@ApiParam("用户贷前准备状态查询/JSON/BODY") @RequestBody TxRequest tx) {
		logger.info("SCF1115 request:"+tx.toString());
		
		ResultBean rb = new ResultBean();
		try {
			rb = userBeforeLoanService.getBefroeLoanStatus(tx);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		logger.info("SCF1115 response:"+rb.toString());
		return rb;

	}
}

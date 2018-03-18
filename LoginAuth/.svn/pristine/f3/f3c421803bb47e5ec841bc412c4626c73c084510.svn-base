package com.yonyou.scf.userFace.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.input.Statistic4FinancingAmountRequest;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.util.CreateID;
import com.yonyou.scf.userFace.service.Statistic4FinancingAmountService;

/**
 * 登录首页获取融资申请放款和还款的统计信息。 <br>
 * 
 * 包含以下内容： <br>
 * 业务角色        累计放款金额    累计还款金额    全部待还款金额    3天内到期的待还金额    7天内到期的待还金额 <br>
 * ------------------------------------------------------------------------------------------------------------ <br>
 * 平台运营        出借方维度      不显示          显示              显示                   显示                <br>
 * 借款方          不显示          不显示          显示              显示                   显示                <br>
 * 核心企业        显示            显示            不显示            不显示                 不显示              <br>
 * 出借方          不显示          不显示          显示              显示                   显示                <br>
 * 担保方          借款方维度      不显示          不显示            不显示                 不显示              <br>
 * 共借方          借款方维度      不显示          不显示            不显示                 不显示              <br>
 * 
 * @author shengsu
 *
 */
@RestController
public class Statistic4FinancingAmountController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Statistic4FinancingAmountService statistic4FinancingAmountService;

	@RequestMapping(value = "/Statistic4FinancingAmount", method = RequestMethod.POST)
	public ResultBean statistic4FinancingAmount(@RequestBody @Valid Statistic4FinancingAmountRequest request, BindingResult result) {
		ResultBean rb = new ResultBean();
		// 创建主键
		Long id = CreateID.createId();
		String logMsgDefault = "融资申请放款和还款的统计，流水号" + id + "，";
		logger.info(logMsgDefault + "请求报文：" + request.toString());

		try {
			// 入力Bean校验失败
			if (result.hasErrors()) {
				rb = new ResultBean(result);
				logger.info(logMsgDefault + "入参有误：" +  rb.getMessage());
				return rb;
			}

			rb = statistic4FinancingAmountService.Job01(request);

		} catch (RuntimeException re) {
			re.printStackTrace();
			logger.error(logMsgDefault + "异常信息：" + re.getMessage(), re);
			rb = new ResultBean(DefaultConst.ERR_2001_CODE, re.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(logMsgDefault + "异常信息：" + e.getMessage(), e);
			rb = new ResultBean(DefaultConst.ERR_2001_CODE, DefaultConst.ERR_2001_MSG);
		}

		logger.info(logMsgDefault + "返回报文：" + rb.toString());
		return rb;
	}

}
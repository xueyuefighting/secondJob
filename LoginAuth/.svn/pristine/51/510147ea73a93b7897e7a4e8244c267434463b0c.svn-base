package com.yonyou.scf.userFace.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.yonyou.scf.common.constant.UserConst;
import com.yonyou.scf.common.input.Statistic4FinancingAmountRequest;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.output.Statistic4FinancingAmountResponse;
import com.yonyou.scf.common.util.LongUtil;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.Timer;
import com.yonyou.scf.userFace.mapper.Statistic4FinancingAmountHandMapper;

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
@Service
@Transactional
public class Statistic4FinancingAmountService {

	@Autowired
	private Statistic4FinancingAmountHandMapper mapper;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public ResultBean Job01(Statistic4FinancingAmountRequest request) {
		ResultBean rb = new ResultBean();
		// 业务返回值
		Map<String, List<Statistic4FinancingAmountResponse>> resMap = new HashMap<String, List<Statistic4FinancingAmountResponse>>();
		List<Statistic4FinancingAmountResponse> resBeanList = new ArrayList<Statistic4FinancingAmountResponse>();

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("organizeId", request.getOrganizeId());
		params.put("organizeRoleNo", request.getOrganizeRoleNo());

		List<Map<String, Object>> alreadyList = mapper.getAlready(params);
		if (null != alreadyList && alreadyList.size() > 0) {
			Statistic4FinancingAmountResponse resBean = null;
			for (Map<String, Object> data : alreadyList) {
				if (null != data) {

					resBean = new Statistic4FinancingAmountResponse();
					resBean.setLendingAmountAlreadyTotal(LongUtil.toLong(data.get("lendingAmountAlreadyTotal")));
					resBean.setRepeymentAmountAlreadyTotal(LongUtil.toLong(data.get("repeymentAmountAlreadyTotal")));
					resBean.setRepaymentAmountOughtToTotal(LongUtil.toLong(data.get("repaymentAmonutOughtToTotal")));
					if (UserConst.user_role_type_4.equals(request.getOrganizeRoleNo()) || UserConst.user_role_type_5.equals(request.getOrganizeRoleNo())) {
						if(!StringUtils.isEmpty(data.get("agencyId"))) {
							resBean.setCapitalId(StringUtil.toString(data.get("agencyId")));
						}
					} else if (UserConst.user_role_type_6.equals(request.getOrganizeRoleNo())) {
						if(!StringUtils.isEmpty(data.get("capitalId"))) {
							resBean.setCapitalId(StringUtil.toString(data.get("capitalId")));
						}
					}

					resBeanList.add(resBean);
				}
			}
		}
		logger.info("当前登企业[" + request.getOrganizeId() + "]关联的放款统计信息：" + resBeanList.size() + "条");
		if (resBeanList.size() == 0) {
			resBeanList.add(new Statistic4FinancingAmountResponse());
		}
		resMap.put("lending", resBeanList);

		Statistic4FinancingAmountResponse resBean = new Statistic4FinancingAmountResponse();
		resBeanList = new ArrayList<Statistic4FinancingAmountResponse>();
		if (UserConst.user_role_type_2.equals(request.getOrganizeRoleNo()) || UserConst.user_role_type_4.equals(request.getOrganizeRoleNo())
				|| UserConst.user_role_type_6.equals(request.getOrganizeRoleNo())) {
			boolean flag = false;
			String today = Timer.getReadableDateFormat();
			params.put("today", today);

			// 查3天内到期
			String atfer3Days = Timer.addDateStr(today, 3, Timer.Role3);
			params.put("expiredDate", atfer3Days);
			String repaymentAmonutOughtToTotal = mapper.getExpired(params);
			if (StringUtil.isNotEmpty(repaymentAmonutOughtToTotal)) {
				flag = true;
				resBean.setRepaymentAmountExpiredAfter3Days(LongUtil.toLong(repaymentAmonutOughtToTotal));
			}

			// 查7天内到期
			String atfer7Days = Timer.addDateStr(today, 7, Timer.Role3);
			params.replace("expiredDate", atfer7Days);
			repaymentAmonutOughtToTotal = mapper.getExpired(params);
			if (StringUtil.isNotEmpty(repaymentAmonutOughtToTotal)) {
				flag = true;
				resBean.setRepaymentAmountExpiredAfter7Days(LongUtil.toLong(repaymentAmonutOughtToTotal));
			}

			// 查3天内到期
			String atfer30Days = Timer.addDateStr(today, 30, Timer.Role3);
			params.replace("expiredDate", atfer30Days);
			repaymentAmonutOughtToTotal = mapper.getExpired(params);
			if (StringUtil.isNotEmpty(repaymentAmonutOughtToTotal)) {
				flag = true;
				resBean.setRepaymentAmountExpiredAfter1Month(LongUtil.toLong(repaymentAmonutOughtToTotal));
			}
			if (flag) {
				resBeanList.add(resBean);
			}
		}
		logger.info("当前登企业[" + request.getOrganizeId() + "]关联的还款统计信息：" + resBeanList.size() + "条");
		if (null != resBeanList && resBeanList.size() == 0) {
			resBeanList.add(new Statistic4FinancingAmountResponse());
		}
		resMap.put("repayment", resBeanList);

		rb = new ResultBean(resMap);
		return rb;
	}

}
package com.yonyou.scf.gateway.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.scf.common.schema1.domain.FinancingApplication;
import com.yonyou.scf.common.schema1.domain.FinancingApplicationExample;
import com.yonyou.scf.common.schema1.domain.FinancingApplicationExample.Criteria;
import com.yonyou.scf.common.schema1.domain.RepayApplication;
import com.yonyou.scf.common.schema1.mapper.FinancingApplicationMapper;
import com.yonyou.scf.common.schema1.mapper.RepayApplicationMapper;

@Service
public class RepaymentService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	RepayApplicationMapper repayApplicationMapper;
	
	@Autowired
	FinancingApplicationMapper financingApplicationMapper;
	

	public Map<String,Object> queryPaymentStatus(String repayApplicationNo){
		 //查询还款交易表中数据
         RepayApplication repayApplication=null;//repayApplicationMapper.selectByRepayApplicationNo(repayApplicationNo);
         if(repayApplication==null){
        	 return null;
         }
         Map<String,Object> map=new HashMap<String,Object>();
		 map.put("CenterCompanyID", repayApplication.getCenterCompanyId());
		 map.put("FsID", repayApplication.getFsId());
		 map.put("RepayApplicationNo", repayApplication.getRepayApplicationNo());
         //根据融资交易流水号查询融资金额
         String financingApplicationNo=repayApplication.getFinancingApplicationNo();
	     if(financingApplicationNo==null){
	    	 return null;
	     }
		 FinancingApplicationExample example=new FinancingApplicationExample();
		 Criteria criteria=example.createCriteria();
		 criteria.andFinancingApplicationNoEqualTo(financingApplicationNo);
		 List<FinancingApplication> financingApplicationList=financingApplicationMapper.selectByExample(example);
		 FinancingApplication financingApplication=null;
		 if(financingApplicationList==null){
			return null;
		 }
		 financingApplication=financingApplicationList.get(0);
		map.put("FinanceAmount", financingApplication.getFinancingAmount());
		
		
		// 此处模拟 调用银行接口查询的数据
		map.put("Status","已还款");
		map.put("OverdueType", "正常");
		map.put("PeriodType", "正常按期还款");
		return map;
	}
}

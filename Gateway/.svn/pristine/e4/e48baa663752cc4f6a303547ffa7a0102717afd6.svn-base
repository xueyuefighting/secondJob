package com.yonyou.scf.gateway.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yonyou.scf.common.schema1.domain.FinancingApplication;
import com.yonyou.scf.common.schema1.domain.FinancingApplicationExample;
import com.yonyou.scf.common.schema1.domain.FinancingApplicationExample.Criteria;
import com.yonyou.scf.common.schema1.domain.Product;
import com.yonyou.scf.common.schema1.mapper.FinancingApplicationMapper;
import com.yonyou.scf.common.schema1.mapper.ProductMapper;
import com.yonyou.scf.common.tx.api.TxRequest;
import com.yonyou.scf.common.tx.gateway.Scf1205Request;
import com.yonyou.scf.common.tx.gateway.Scf1205Response;
import com.yonyou.scf.common.tx.gateway.Scf1205Response_DataList;
import com.yonyou.scf.common.tx.gateway.Scf1215Request;
import com.yonyou.scf.common.tx.gateway.Scf1215Response;
import com.yonyou.scf.common.tx.gateway.Scf1215Response_DataList;
import com.yonyou.scf.gateway.validate.ValidActor;
import com.yonyou.scf.tools.constant.DefaultConstants;
import com.yonyou.scf.tools.lang.json.JsonUtil;
import com.yonyou.scf.tools.system.CodeException;

@Service
public class FinancingApplicationService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	FinancingApplicationMapper financeApplicationMapper;
	
	/*
	 * 融资申请
	 * @param ubl
	 * @return
	 */
	public String finApplication(FinancingApplication finappl) {
		
		return null;
	
		
			
	}
	
	@Autowired
	ProductMapper productMapper;
		
	/**
	 * 融资交易查询
	 * @param financingApplicationNo
	 * @return
	 */
	public Map<String,Object> queryFinanceIntension(String financingApplicationNo){
		logger.info("nimamimiaa"+financeApplicationMapper.toString());
		//根据融资流水号查询融资交易信息
		FinancingApplicationExample example=new FinancingApplicationExample();
		Criteria criteria=example.createCriteria();
		criteria.andFinancingApplicationNoEqualTo(financingApplicationNo);
		List<FinancingApplication> financingApplicationList=financeApplicationMapper.selectByExample(example);
		if(financingApplicationList.size()==0){
			 return null;
		}
		FinancingApplication financingApplication=financingApplicationList.get(0);
		String productId=financingApplication.getProductId(); 
		Product product=productMapper.selectByPrimaryKey(productId);
		if(product==null){
			return null;
		}
		Map<String,Object> resultMap=new HashMap<String,Object>();
		resultMap.put("FundId",financingApplication.getFundId());
		resultMap.put("FsId",financingApplication.getFsId());
		resultMap.put("CenterCompanyId", financingApplication.getCenterCompanyId());
		resultMap.put("FinancingApplicationNo", financingApplication.getFinancingApplicationNo());
		resultMap.put("FinancingProductName", product.getProductName());
		resultMap.put("BillNo", financingApplication.getBillNo());
		resultMap.put("FinancingProductType", financingApplication.getFinanceProductionType());
		resultMap.put("FinanceProductionInterest",product.getProductRate());
		resultMap.put("OverdueInterest", product.getProductOverrate());
		resultMap.put("RepayWay",product.getProductRepaytype());
		resultMap.put("FinanceAmount", financingApplication.getFinancingAmount());
		resultMap.put("ApplicationBillStatus", financingApplication.getBillStatus());
		return resultMap;
	}

	public Scf1205Response querySCF1205(TxRequest tx) throws CodeException{
		
		Scf1205Response scf1205Response = new Scf1205Response();
		
		String jsonMessage = tx.getJsonMessage();
		Scf1205Request scf1205Request = JsonUtil.toBean(jsonMessage, Scf1205Request.class);
		if(scf1205Request==null){
			throw new CodeException(DefaultConstants.ERR_0001_CODE, DefaultConstants.ERR_0001_MSG);
		}
		
		try {
			new ValidActor<Scf1205Request>(scf1205Request).validate();
		} catch (CodeException e) {
			throw new CodeException(DefaultConstants.ERR_0001_CODE, DefaultConstants.ERR_0001_MSG);
		}
		
		List<Scf1205Response_DataList> respList =  financeApplicationMapper.querySCF1205(scf1205Request.getFinancingApplicationNo());
		
		//替换还款方式状态位
		List<Scf1205Response_DataList> newList = respList.stream().parallel().map(x->{
			x.setRepayWay(transferInt(x.getRepayWay()));
			return x;
		}).collect(Collectors.toCollection(ArrayList::new));
		
		scf1205Response.setCode(DefaultConstants.SUCCESS_RESPONSE_CODE);
		scf1205Response.setMessage(DefaultConstants.SUCCESS_RESPONSE_MESSAGE);
		scf1205Response.setDataList(newList);
		scf1205Response.setDataListCnt(newList.size());
		
		return scf1205Response;
	}
	public Scf1215Response querySCF1215(TxRequest tx) throws CodeException{
		
		Scf1215Response scf1215Response = new Scf1215Response();
		
		String jsonMessage = tx.getJsonMessage();
		Scf1215Request scf1215Request = JsonUtil.toBean(jsonMessage, Scf1215Request.class);
		if(scf1215Request==null){
			throw new CodeException(DefaultConstants.ERR_0001_CODE, DefaultConstants.ERR_0001_MSG);
		}
		
		try {
			new ValidActor<Scf1215Request>(scf1215Request).validate();
		} catch (CodeException e) {
			throw new CodeException(DefaultConstants.ERR_0001_CODE, DefaultConstants.ERR_0001_MSG);
		}
		
		List<Scf1215Response_DataList> respList =  financeApplicationMapper.querySCF1215(scf1215Request.getFinancingApplicationNo());
		
		//替换还款方式状态位
		List<Scf1215Response_DataList> newList = respList.stream().parallel().map(x->{
			x.setRepayWay(transferInt(x.getRepayWay()));
			return x;
		}).collect(Collectors.toCollection(ArrayList::new));
		
		scf1215Response.setCode(DefaultConstants.SUCCESS_RESPONSE_CODE);
		scf1215Response.setMessage(DefaultConstants.SUCCESS_RESPONSE_MESSAGE);
		scf1215Response.setDataList(newList);
		scf1215Response.setDataListCnt(newList.size());
		
		return scf1215Response;
	}
	
	/*
	 * 还款类型：
	 *       类型名  				资方返回code(String)		  gatewayCode(Integer) 
	 * 按月/季付息，到期还本			01							20
	 * 等额本息						02							50
	 * 等额本金						03							60
	 * 按月/季付息，分期还本			04							10
	 * 按日计息、随借随还				05							40
	 * 到期一次性还本付息				06							30
	 * @return
	 */
	public static int transferInt(int code) {
		switch(code) {
		case 1:
			return 20;
		case 2:
			return 50;
		case 3:
			return 60;
		case 4:
			return 10;
		case 5:
			return 40;
		case 6:
			return 30;
			default:
				return 1000;
		}
	}
	
}

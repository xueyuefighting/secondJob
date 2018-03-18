package com.yonyou.scf.gateway.service;
//package com.yonyou.scf.service;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.util.Assert;
//
//import com.yonyou.scf.bean.UDealBean;
//import com.yonyou.scf.mapper.UDealMapper;
//import com.yonyou.scf.util.NetworkUtil;
//
///**
// * @author zhangjinliang
// * 2017年3月7日 下午5:47:11
// * 
// */
//@Service
//public class UDealService {
//	
//	@Autowired
//	private UDealMapper uDealMapper;
//	
//	public int insert(UDealBean bean){
//		
//		UDealBean udeal = new UDealBean();
//		
//		//三个编号确定唯一性
//		udeal.setPlatformId(bean.getPlatformId());
//		udeal.setCenterCompanyNo(bean.getCenterCompanyNo());
//		udeal.setgAId(bean.getgAId());
//		udeal.setHandleTime(null);
//		
//		List<UDealBean> entityList = uDealMapper.queryUDealBean(udeal);
//		
//		//判断请求来自移动端还是pc端  如果是pc则为10  否 20
//		if(NetworkUtil.isMobileOrPc())
//			bean.setTerminalSource(10);
//		else
//			bean.setTerminalSource(20);
//		
//		Date d = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		
//		String dd = sdf.format(d);
//		
//		bean.setHandleTime(sdf.format(d));
//		//查询是否已经存在预注册记录 如果有  更新 没有则新增
//		if(entityList!=null && entityList.size()>0){
//			return uDealMapper.update(bean,entityList.get(0).getId());
//		}else{
//			return uDealMapper.insert(bean);
//		}
//		
//	}
//	
//	public List<UDealBean> select(UDealBean udeal){
//		
//		List<UDealBean> list = uDealMapper.queryUDealBean(udeal);
//		
//		return list;
//		
//	}
//	public int initTotalPageCount(int pageCount){
//		int count = uDealMapper.initTotalPageCount();
//		
//		return (int) Math.ceil(1.0*count/pageCount);
//		
//	}
//	
//	public void addBatch(List<UDealBean> list){
//		uDealMapper.addBatch(list);
//	}
//	
//}

package com.yonyou.scf.gateway.interf;

import com.yonyou.scf.common.schema1.domain.Finance;
import com.yonyou.scf.common.schema1.domain.PlatformInfo;
import com.yonyou.scf.common.schema1.domain.Product;
import com.yonyou.scf.tools.system.CodeException;

public interface INoticeMsgByAgency {
	
	
	void noticeMsgByAgencyFor1108Or1118(String merchantUserId, Product product, String platformId) throws Exception,CodeException ;
	
	void sendSCF1108(String merchantUserId, Product product,PlatformInfo platformInfo)throws CodeException;
	
	void sendSCF1118(String merchantUserId, Product product, PlatformInfo platformInfo) throws CodeException;
	void noticeMsgByAgencyFor1208Or1218(Finance finance, PlatformInfo platformInfo, int status, String mode)  throws Exception, CodeException;
//	void sendSCF1208(Finance finance, PlatformInfo platformInfo, int status) throws CodeException;
//	void sendSCF1218(Finance finance, PlatformInfo platformInfo, int status) throws CodeException;
}

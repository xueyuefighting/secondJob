package com.yonyou.scf.gateway.controller;


import java.util.UUID;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.scf.common.helper.MessengerHelper;
import com.yonyou.scf.common.schema1.domain.UserBeforeLoan;
import com.yonyou.scf.common.schema1.domain.UserBeforeLoanExample;
import com.yonyou.scf.common.schema1.mapper.UserBeforeLoanMapper;
import com.yonyou.scf.common.tx.api.ResultBean;
import com.yonyou.scf.common.tx.notice.Scf1118NoticeRequest;
import com.yonyou.scf.tools.constant.DefaultConstants;
import com.yonyou.scf.tools.system.CodeException;
import com.yonyou.scf.tools.util.GUID;
import com.yonyou.scf.tools.util.TimeUtil;

import net.sf.json.JSONObject;


@RestController
@CrossOrigin
public class DebugController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7501126818735319366L;
	@Autowired
	private UserBeforeLoanMapper userBeforeLoanMapper;
	
	/*
	 * 插入贷前准备数据
	 * @return
	 */
	@RequestMapping(value="/SCF1111",method=RequestMethod.POST)
	public ResultBean insertUserLoan(@RequestBody JSONObject obj){//HttpServletRequest request,HttpServletResponse resp
		try {
			String merchantUserId = "";
			if(obj.containsKey("MerchantUserID")){
				merchantUserId = obj.getString("MerchantUserID");
			}
			int userRole = 20;
			if(obj.containsKey("UserRole")){
				userRole = obj.getInt("UserRole");
			}
			int terminalSource = 20;
			if(obj.containsKey("TerminalSource")){
				terminalSource = obj.getInt("TerminalSource");
			}
			String fundId = "";
			if(obj.containsKey("FundID")){
				fundId = obj.getString("FundID");
			}
			String platformId = "";
			if(obj.containsKey("PlatformId")){
				platformId = obj.getString("PlatformId");
			}
			String interfaceNo = "";
			if(obj.containsKey("InterfaceNo")){
				interfaceNo = obj.getString("InterfaceNo");
			}
			
			UserBeforeLoanExample example = new UserBeforeLoanExample();
			example.createCriteria()
			.andPlatformIdEqualTo(platformId)
			.andInterfaceNoEqualTo(interfaceNo)
			.andFundIdEqualTo(fundId)
			.andMerchantUserIdEqualTo(merchantUserId)
			.andUserRoleEqualTo(userRole);
			
			userBeforeLoanMapper.deleteByExample(example);
			
			String systemId = "";
			try {
				systemId = GUID.genTxNo(32);
			} catch (CodeException e) {
				systemId = UUID.randomUUID().toString().replace("-", "");
			}
			String currentTime = TimeUtil.getTimeMillisecondStamp();
			
			UserBeforeLoan ubl = new UserBeforeLoan();
			ubl.setSystemid(systemId);
			ubl.setCreateTime(currentTime);
			ubl.setFundId(fundId);
			ubl.setMerchantUserId(merchantUserId);
			ubl.setInterfaceNo(interfaceNo);
			ubl.setModifyTime(currentTime);
			ubl.setPlatformId(platformId);
			ubl.setStatus(90);
			ubl.setTerminalSource(terminalSource);
			ubl.setUserRole(userRole);
			
			userBeforeLoanMapper.insert(ubl);
			
			String url = "http://127.0.0.1:51007/Simulator/Notice";
			
			Scf1118NoticeRequest scf1118 = new Scf1118NoticeRequest();
			scf1118.setFundId(fundId);
			scf1118.setProductId("123456789");
			scf1118.setProductName("测试产品名字");
			scf1118.setBeforeLoanStatus(40);
			scf1118.setCenterCompanyId("123456789");
			scf1118.setFinanceProductionType(10);
			scf1118.setFsId(merchantUserId);
			
			ResultBean rb = MessengerHelper.doSend(platformId, DefaultConstants.API_SCF1118, 2, url, scf1118);
			System.out.println("发送通知返回值:"+rb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		ResultBean resultBean = new ResultBean();
		resultBean.setCode("2000");
		resultBean.setMessage("操作成功");
		return resultBean;
		
//		 String data = JsonUtil.toJSONString(resultBean);
//	        OutputStream outputStream = null;
//			try {
//				outputStream = resp.getOutputStream();
//				resp.setHeader("content-type", "text/html;charset=UTF-8");//通过设置响应头控制浏览器以UTF-8的编码显示数据，如果不加这句话，那么浏览器显示的将是乱码
//				byte[] dataByteArr = data.getBytes("UTF-8");//将字符转换成字节数组，指定以UTF-8编码进行转换
//				outputStream.write(dataByteArr);//使用OutputStream流向客户端输出字节数组
//			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}finally{
//				if(outputStream!=null){
//					try {
//						outputStream.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			}
	}
}

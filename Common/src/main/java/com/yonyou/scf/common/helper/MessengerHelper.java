package com.yonyou.scf.common.helper;

import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.constant.MessengerErrorMsgConstants;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.system.CodeException;
import com.yonyou.scf.common.tx.api.TxResponse;
import com.yonyou.scf.common.tx.messenger.Tx1000Request;
import com.yonyou.scf.common.util.CreateID;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.json.JsonUtil;
import com.yonyou.scf.common.util.net.HttpClientUtil;

public class MessengerHelper {

	public static Boolean doSend(String platformId, String interfaceNo, int connectionMode, String url, Object bean) throws CodeException {

		ResultBean rb = new ResultBean();

		try {
			String message = JsonUtil.toJSONString(bean);
			String signature = SignatureHelper.doSignToSig(bean);
			
//			 TxRequest txReq = new TxRequest();
//			 txReq.setPlatformId(platformId);
//			 txReq.setUrlParam(url);
//			 txReq.setJsonMessage(message);
//			 txReq.setJsonSignature(signature);
//			 txReq.setInterfaceNo(interfaceNo);
//			 txReq.setVersion(String.valueOf(connectionMode));

			Tx1000Request tx1000req = new Tx1000Request();
			tx1000req.setConnectionMode(String.valueOf(connectionMode));
			tx1000req.setInterfaceNo(interfaceNo);
			tx1000req.setJsonMessage(message);
			tx1000req.setJsonSignature(signature);
			tx1000req.setPlatformId(platformId);
			tx1000req.setTxNo(CreateID.getRandomCharAndNumber(32, false));
			tx1000req.setUrl(url);
			
			System.out.println("MessengerHelper:"+tx1000req.toString());

			// 发消息
			String responseText = HttpClientUtil.post(URLConst.URL_MESSAGE + "/Send", tx1000req);
			System.out.println("MessengerHelper:responseText:"+responseText);
			TxResponse txRes = new TxResponse(responseText);
			// TODO：此处的处理有待商榷
			// 返回消息预处理，在签名验签失败时，也保留原始错误信息
			if (null != txRes) {
				rb = txRes.getJsonMessage();
				System.out.println("MessengerHelper:responseText:rb:"+rb.toString());
			}
			if (StringUtil.isNotEmpty(txRes.getJsonSignature()) && !"null".equalsIgnoreCase(txRes.getJsonSignature())) {
				//响应报文验签
				SignatureHelper.doVerify(txRes,platformId);
			}else {
				//此时基本可判断为Messenger模块自身错误，不存在签名信息，可否直接返回rb呢？
				if (DefaultConst.SUCCESS_RESPONSE_CODE.equals(rb.getCode())) {
					throw new CodeException(DefaultConst.ERR_2001_CODE, DefaultConst.ERR_2001_MSG);
				}
			}
			if (!DefaultConst.SUCCESS_RESPONSE_CODE.equals(rb.getCode())) {
				throw new CodeException(MessengerErrorMsgConstants.ERR_2001_CODE, "消息发送失败");
			}
			

		} catch (CodeException ce) {
			ce.printStackTrace();
			throw ce;
		} catch (Exception e) {
			System.out.println("ERROR : " + e.toString());
			e.printStackTrace();
			throw new CodeException(MessengerErrorMsgConstants.ERR_2001_CODE, MessengerErrorMsgConstants.ERR_2001_MSG);
		}

		return true;
	}
}

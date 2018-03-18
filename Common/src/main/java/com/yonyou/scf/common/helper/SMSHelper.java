package com.yonyou.scf.common.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.constant.FrontEndProcessConstant;
import com.yonyou.scf.common.constant.MessengerErrorMsgConstants;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.system.CodeException;
import com.yonyou.scf.common.tx.api.TxRequest;
import com.yonyou.scf.common.tx.send.SMS2Send;
import com.yonyou.scf.common.tx.send.SMSSend;
import com.yonyou.scf.common.util.CreateID;
import com.yonyou.scf.common.util.StringUtil;
import com.yonyou.scf.common.util.net.ResUtil;

public class SMSHelper {

	private static final Logger logger = LoggerFactory.getLogger(SMSHelper.class);

	/**
	 * 常规发短信，自有短信运营商：易云
	 * 
	 * @param platformId
	 * @param mobile
	 * @param text 完整的短信文字内容
	 * @param txNo 可空
	 * @return
	 * @throws CodeException
	 */
	public static Boolean doSend(String platformId, String mobile, String text, String txNo) throws CodeException {

		ResultBean rb = new ResultBean();

		try {

			SMSSend sms = new SMSSend();
			sms.setMobile(mobile);
			sms.setText(text);
			if(StringUtil.isEmpty(txNo)) {
				txNo = CreateID.getRandomNumber(16);
			}
			sms.setTxNo(txNo);

			// 签名 + 组装
			TxRequest txReq = SignatureHelper.doSignToTxRequest(sms);
			txReq.setPlatformId(platformId);
			txReq.setApiId(URLConst.URL_SMS + "/Send");//59200/SMS/Send
			txReq.setBrowser("ie");
			logger.info("SMSHelper:request:" + txReq.toString());

			rb = ResUtil.send2ActiveFEP(txReq);
			logger.info("SMSHelper:response:" + rb.toString());

			if (!DefaultConst.SUCCESS_RESPONSE_CODE.equals(rb.getCode())) {
				logger.error(rb.getCode() + ":" + rb.getMessage());
				throw new CodeException(DefaultConst.ERR_2001_CODE, "短信发送失败");
			}

		} catch (CodeException ce) {
			throw ce;
		} catch (Exception e) {
			System.out.println("ERROR : " + e.toString());
			e.printStackTrace();
			throw new CodeException(MessengerErrorMsgConstants.ERR_2001_CODE, MessengerErrorMsgConstants.ERR_2001_MSG);
		}

		return true;
	}

	/**
	 * 青金所环境专用发短信，短信运营商：未知
	 * 判断标准：SystemConst.QJS_UAT = URLConst.ACTIVE_SYS 或 SystemConst.QJS_REAL = URLConst.ACTIVE_SYS
	 * 
	 * @param platformId
	 * @param templateId 来自SMSConst
	 * @param mobile
	 * @param args String[]：登录名，密码
	 * @param txNo 可空
	 * @return
	 * @throws CodeException
	 */
	public static Boolean doSend2(String platformId, String templateId, String mobile, String[] args, String txNo) throws CodeException {

		ResultBean rb = new ResultBean();

		try {

			SMS2Send sms2 = new SMS2Send();
			sms2.setPlatformId(platformId);
			sms2.setMobile(mobile);
			sms2.setTemplateId(templateId);
			sms2.setArgs(args);
			if(StringUtil.isEmpty(txNo)) {
				txNo = CreateID.getRandomNumber(16);
			}
			sms2.setTxNo(txNo);

			// 签名 + 组装
			TxRequest txReq = SignatureHelper.doSignToTxRequest(sms2);
			txReq.setPlatformId(platformId);
			txReq.setApiId(URLConst.URL_SMS + "/Send2");//59200/SMS/Send2
			txReq.setBrowser("ie");
			logger.info("SMS2Helper:request:" + txReq.toString());

			rb = ResUtil.send2ActiveFEP(txReq);
			logger.info("SMS2Helper:response:" + rb.toString());

			if (!DefaultConst.SUCCESS_RESPONSE_CODE.equals(rb.getCode())) {
				logger.error(rb.getCode() + ":" + rb.getMessage());
				throw new CodeException(DefaultConst.ERR_2001_CODE, "短信发送失败");
			}

		} catch (CodeException ce) {
			throw ce;
		} catch (Exception e) {
			System.out.println("ERROR : " + e.toString());
			e.printStackTrace();
			throw new CodeException(MessengerErrorMsgConstants.ERR_2001_CODE, MessengerErrorMsgConstants.ERR_2001_MSG);
		}

		return true;
	}
}

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
import com.yonyou.scf.common.tx.send.MailSend;
import com.yonyou.scf.common.util.CreateID;
import com.yonyou.scf.common.util.net.ResUtil;

/**
 * 
 * 对接Mail模块的发送接口，进行测试。
 *
 */
public class MailHelper {

	private static final Logger logger = LoggerFactory.getLogger(MailHelper.class);

	public static Boolean doSend(String platformId, String mailAddr, String subject, String text, String txNo) throws CodeException {

		ResultBean rb = new ResultBean();

		try {

			// 业务数据
			MailSend me = new MailSend();
			me.setTxNo(CreateID.getRandomCharAndNumber(32, false));
			me.setMailTo(mailAddr);
			me.setSubject(subject);
			me.setText(text);

			// TODO:签名 + 组装
			TxRequest txReq = SignatureHelper.doSignToTxRequest(me);
			txReq.setPlatformId(platformId);
//			txReq.setUrlParam(FrontEndProcessConstant.URL_SEND);
			//txReq.setInterfaceNo(APIConstant.API_SCF1103);
			txReq.setApiId(URLConst.URL_MAIL+ "/Send");//59100/Mail/Send
			txReq.setBrowser("ie");
			logger.info("MailHelper:request:" + txReq.toString());

			rb = ResUtil.send2ActiveFEP(txReq);
			logger.info("MailHelper:response:" + rb.toString());

			if (!DefaultConst.SUCCESS_RESPONSE_CODE.equals(rb.getCode())) {
				logger.error(rb.getCode() + ":" + rb.getMessage());
				throw new CodeException(DefaultConst.ERR_2001_CODE, "邮件发送失败");
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

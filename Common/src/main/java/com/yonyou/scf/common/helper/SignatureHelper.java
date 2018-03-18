package com.yonyou.scf.common.helper;

import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.constant.SignatureErrorMsgConstants;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.system.CodeException;
import com.yonyou.scf.common.tx.api.TxRequest;
import com.yonyou.scf.common.tx.api.TxResponse;
import com.yonyou.scf.common.tx.signature.Tx1000Request;
import com.yonyou.scf.common.tx.signature.Tx1000Response;
import com.yonyou.scf.common.tx.signature.Tx2000Request;
import com.yonyou.scf.common.tx.signature.Tx2000Response;
import com.yonyou.scf.common.util.Timer;
import com.yonyou.scf.common.util.json.JsonUtil;
import com.yonyou.scf.common.util.net.HttpClientUtil;

public class SignatureHelper {

	/**
	 * 将业务Bean，转为JsonUtil.toJSONString(Bean)后，进行签名，返回Hex密文。
	 * 默认使用我司私钥进行签名，签名算法也是固定的RSA-SHA256。
	 * 此方法建议用于需要签名的场合，如业务处理完毕，需要向客户端发消息之前。
	 * 
	 * @param Object bean
	 * @return String
	 * @throws CodeException
	 */
	public static String doSignToSig(Object bean) throws CodeException {

		String message = "";
		String signature = "";
		try {
			message = JsonUtil.toJSONString(bean);

			Tx1000Request tx1000req = new Tx1000Request();
			tx1000req.setInterfaceNo("Tx1000");
			tx1000req.setMessage(message);
			tx1000req.setPlatformId(DefaultConst.SCF_PLATFORM_ID);// 产融平台自身
			tx1000req.setUrlParam("Sign");
			tx1000req.setVersion("");

			String responseText = "";

			responseText = HttpClientUtil.post(URLConst.URL_SIGNATURE + "/Sign", tx1000req);

			Tx1000Response tx1000Res = JsonUtil.toBean(responseText, Tx1000Response.class);
			if (!SignatureErrorMsgConstants.OK_CODE.equalsIgnoreCase(tx1000Res.getResponseCode())) {
				throw new CodeException(tx1000Res.getResponseCode(), tx1000Res.getResponseMessage());
			}
			signature = tx1000Res.getSignature();

		} catch (CodeException ce) {
			ce.printStackTrace();
			throw ce;
		} catch (Exception e) {
			System.out.println("ERROR : " + e.toString());
			e.printStackTrace();
			throw new CodeException(SignatureErrorMsgConstants.ERR_2001_CODE, SignatureErrorMsgConstants.ERR_2001_MSG);
		}

		return signature;
	}

	/**
	 * 用于响应平台发起的同步报文请求的签名方法。
	 * 此方法用于在给客户端返回响应报文前的签名，参数和返回值是严格匹配于API的。
	 * 
	 * @param ResultBean bean
	 * @return TxResponse
	 */
	public static TxResponse doSignToTxResponse(ResultBean bean) {
		TxResponse txRes = new TxResponse();

		try {
			// TODO
			txRes.setJsonSignature(doSignToSig(bean));
			txRes.setJsonMessage(bean);
		} catch (CodeException ce) {
			ce.printStackTrace();
			System.out.println("签名失败 : " + ce.getCode() + ":" + ce.getMessage() + "，" + Timer.getReadableDateTimeFormat());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("签名失败 : " + e.getMessage() + "，" + Timer.getReadableDateTimeFormat());
		}

		return txRes;

	}
	
	/**
	 * 用于系统内部，向统一代理前置机发送报文时的签名。
	 * 明文为JsonUtil.toJSONString(Bean)，默认使用我司私钥进行签名，签名算法也是固定的RSA-SHA256。
	 * 
	 * @param bean
	 * @return
	 * @throws CodeException
	 */
	public static TxRequest doSignToTxRequest(Object bean) throws CodeException {
		return new TxRequest(JsonUtil.toJSONString(bean), doSignToSig(bean));
	}

	/**
	 * 根据平台的请求报文进行验签。
	 * 此方法用于前置机接收到客户端请求后的验签处理，参数严格匹配于API。
	 * 
	 * @param TxRequest
	 * @return true 
	 * @throws CodeException
	 */
	public static boolean doVerify(TxRequest txReq) throws CodeException {

		try {
			Tx2000Request tx2000req = new Tx2000Request();
			tx2000req.setInterfaceNo("Tx2000");
			tx2000req.setMessage(txReq.getJsonMessage());
			tx2000req.setPlatformId(txReq.getPlatformId());
			tx2000req.setSignature(txReq.getJsonSignature());
			tx2000req.setUrlParam("Verify");
			tx2000req.setVersion("");

			String responseText = "";

			responseText = HttpClientUtil.post(URLConst.URL_SIGNATURE + "/Verify", tx2000req);

			Tx2000Response tx2000Res = JsonUtil.toBean(responseText, Tx2000Response.class);
			if (!SignatureErrorMsgConstants.OK_CODE.equalsIgnoreCase(tx2000Res.getResponseCode())) {
				throw new CodeException(tx2000Res.getResponseCode(), tx2000Res.getResponseMessage());
			}

		} catch (CodeException ce) {
			ce.printStackTrace();
			System.out.println("验签失败");
			throw ce;
		} catch (Exception e) {
			e.printStackTrace();
			throw new CodeException(SignatureErrorMsgConstants.ERR_2001_CODE, SignatureErrorMsgConstants.ERR_2001_MSG);
		}

		return true;
	}

	/**
	 * 根据平台的响应报文进行验签。
	 * 默认使用我司私钥进行签名，签名算法也是固定的RSA-SHA256。
	 * 此方法用于我司发起主动通知，客户端收到后应给予响应，该响应报文应进行验签，参数严格匹配于API。
	 * 
	 * @param TxResponse
	 * @param PlatformId
	 * @return true 
	 * @throws CodeException
	 */
	public static boolean doVerify(TxResponse txRes, String platformId) throws CodeException {

		try {
			Tx2000Request tx2000req = new Tx2000Request();
			tx2000req.setInterfaceNo("Tx2000");
			tx2000req.setMessage(JsonUtil.toJSONString(txRes.getJsonMessage()));
			tx2000req.setPlatformId(platformId);
			tx2000req.setSignature(txRes.getJsonSignature());
			tx2000req.setUrlParam("Verify");
			tx2000req.setVersion("");

			String responseText = "";

			responseText = HttpClientUtil.post(URLConst.URL_SIGNATURE + "/Verify", tx2000req);

			Tx2000Response tx2000Res = JsonUtil.toBean(responseText, Tx2000Response.class);
			if (!SignatureErrorMsgConstants.OK_CODE.equalsIgnoreCase(tx2000Res.getResponseCode())) {
				throw new CodeException(tx2000Res.getResponseCode(), tx2000Res.getResponseMessage());
			}

		} catch (CodeException ce) {
			ce.printStackTrace();
			System.out.println("验签失败");
			throw ce;
		} catch (Exception e) {
			e.printStackTrace();
			throw new CodeException(SignatureErrorMsgConstants.ERR_2001_CODE, SignatureErrorMsgConstants.ERR_2001_MSG);
		}

		return true;
	}
}

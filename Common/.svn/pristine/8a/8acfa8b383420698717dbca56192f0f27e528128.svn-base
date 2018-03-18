package com.yonyou.scf.common.util.net;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yonyou.scf.common.constant.DefaultConst;
import com.yonyou.scf.common.constant.URLConst;
import com.yonyou.scf.common.helper.SignatureHelper;
import com.yonyou.scf.common.output.ResultBean;
import com.yonyou.scf.common.system.CodeException;
import com.yonyou.scf.common.system.ScfEnvironment;
import com.yonyou.scf.common.tx.api.TxRequest;
import com.yonyou.scf.common.tx.api.TxResponse;
import com.yonyou.scf.common.util.StringUtil;

public class ResUtil {

	private final static Logger logger = LoggerFactory.getLogger(ResUtil.class);

	public static ResultBean send2ActiveFEP(TxRequest txReq) throws CodeException {
		logger.info("本次请求的目标系统标识码为：" + ScfEnvironment.ACTIVE_FEP + "，消息内容" + txReq.toString());
		ResultBean rb = new ResultBean();

		try {
			// TODO:要区分默认的方法
			TxResponse txRes = TxMessenger.send2FEP2(txReq, ScfEnvironment.ACTIVE_FEP);

			logger.info("TxResponse : " + txRes);
			if (null == txRes || StringUtil.isEmpty(txRes.getJsonSignature()) || null == txRes.getJsonMessage()) {
				throw new CodeException("2001", "返回解析异常");
			}
			// 验签，失败时抛出异常
			SignatureHelper.doVerify(txRes, URLConst.ACTIVE_FEP_PLATFORMID);

			// 解析
			rb = txRes.getJsonMessage();
			logger.info("ResultBean : " + rb);
		} catch (CodeException ce) {
			logger.error("通讯失败：" + ce.getCode() + "-" + ce.getMessage(), ce);
			rb.setCode(ce.getCode());
			rb.setMessage(ce.getMessage());
			throw new CodeException(rb.getCode(), rb.getMessage());
		} catch (Exception e) {
			logger.error("通讯失败：" + e.getMessage(), e);
			rb.setCode(DefaultConst.ERR_2001_CODE);
			rb.setMessage(e.getMessage());
			throw new CodeException(rb.getCode(), rb.getMessage());
		}
		return rb;
	}

	public static ResultBean send2SelectFEP4Notice(TxRequest txReq, String system_ini_key) throws CodeException {
		logger.info("本次请求的目标系统标识码为：" + system_ini_key + "，消息内容" + txReq.toString());
		ResultBean rb = new ResultBean();

		try {
			TxResponse txRes = TxMessenger.send2FEP2(txReq, system_ini_key);

			logger.info("TxResponse : " + txRes);
			if (null == txRes || StringUtil.isEmpty(txRes.getJsonSignature()) || null == txRes.getJsonMessage()) {
				throw new CodeException("2001", "返回解析异常");
			}
			// 验签，失败时抛出异常
			SignatureHelper.doVerify(txRes, URLConst.ACTIVE_FEP_PLATFORMID);

			// 解析
			rb = txRes.getJsonMessage();
			logger.info("ResultBean : " + rb);
		} catch (CodeException ce) {
			logger.error("通讯失败：" + ce.getCode() + "-" + ce.getMessage(), ce);
			rb.setCode(ce.getCode());
			rb.setMessage(ce.getMessage());
			throw new CodeException(rb.getCode(), rb.getMessage());
		} catch (Exception e) {
			logger.error("通讯失败：" + e.getMessage(), e);
			rb.setCode(DefaultConst.ERR_2001_CODE);
			rb.setMessage(e.getMessage());
			throw new CodeException(rb.getCode(), rb.getMessage());
		}
		return rb;
	}
}

package Controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import com.yonyou.scf.common.helper.SMSHelper;
import com.yonyou.scf.common.tx.mail.SMSEntry;
import com.yonyou.scf.tools.net.HttpClientUtil;
import com.yonyou.scf.tools.system.CodeException;

public class Decimeal {
	public static String sms_url = "http://192.128.16.242:52007/Mail/SMS";//; "https://test2.yonyouscf.com/Mail"
	public static void main(String[] args) {
		SMSEntry sms = new SMSEntry();
		sms.setMobile("18515041170");
		sms.setText("看看收到了么");
		sms.setTxNo("1231231");
//		String a = null;
//		System.out.println(new DecimalFormat("0.00").format(new BigDecimal(0l).divide(new BigDecimal(100))));
//		try {
//			SMSHelper.doSend("", "18515041170", "【用友产融】发送短信验证！【看看发送成功了么】", "");
			try {
				String responseText = HttpClientUtil.post(sms_url + "/SMS", sms);
				System.out.println(responseText.toString());
			} catch (IOException e) {
				e.printStackTrace();
			}
//		} catch (CodeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}

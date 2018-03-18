var CryptoAgent = "";
			//加载页面
$(document).ready(function(){
	try {
		var eDiv = document.createElement("div");
		if (navigator.appName.indexOf("Internet") >= 0 || navigator.appVersion.indexOf("Trident") >= 0) {
			if (window.navigator.cpuClass == "x86") {
				eDiv.innerHTML = "<object id=\"CryptoAgent\" codebase=\"CryptoKit.Ultimate.x86.cab\" classid=\"clsid:4C588282-7792-4E16-93CB-9744402E4E98\" ></object>";
			}
			else {
				eDiv.innerHTML = "<object id=\"CryptoAgent\" codebase=\"CryptoKit.Ultimate.x64.cab\" classid=\"clsid:B2F2D4D4-D808-43B3-B355-B671C0DE15D4\" ></object>";
			}
		}
		else {
			eDiv.innerHTML = "<embed id=\"CryptoAgent\" type=\"application/npCryptoKit.Ultimate.x86\" style=\"height: 0px; width: 0px\">";
		}
		document.body.appendChild(eDiv);
	}
	catch (e) {
		Common.hideLoading();
		 scf.confirm(e, scf.confirm.typeEnum.warning);
		return;
	}
	CryptoAgent = document.getElementById("CryptoAgent");
});
// Select certificate
function SelectCertificateOnClick() {
	try {                  
	        document.getElementById("SelectCertResult").value = "";
	
	        bSelectCertResult = CryptoAgent.SelectCertificate("", "", "");    
	        // Opera浏览器，NPAPI函数执行结果为false时，不能触发异常，需要自己判断返回值。
	        if (!bSelectCertResult) 
	        {
	        	Common.hideLoading();
	            var errorDesc = CryptoAgent.GetLastErrorDesc();
	            scf.confirm(errorDesc, scf.confirm.typeEnum.warning);
	            return;
	        }
	        
	        var InfoContent = CryptoAgent.GetSignCertInfo("SerialNumber");
	        if (!InfoContent) {
                var errorDesc = CryptoAgent.GetLastErrorDesc();
                Common.hideLoading();
                scf.confirm(errorDesc, scf.confirm.typeEnum.warning);
                return;
            }
	        //赋值给bind.js的 全局变量usbKeyCn
	        usbKeyCn = InfoContent;
	        //调用bind.js 方法获取签名内容
	        forSignatureContent(); 
     }                  
	catch (e) {
		Common.hideLoading();
		 scf.confirm("请插入U盾", scf.confirm.typeEnum.warning);
	}
}
//验证USBK是否插入
function valLccbUsbkeyisTrue() {
    try {                  
            var bSelectCertResult = "";
            bSelectCertResult = CryptoAgent.SelectCertificate("", "", "");  
            // Opera浏览器，NPAPI函数执行结果为false时，不能触发异常，需要自己判断返回值。
            if (!bSelectCertResult) 
            {
            	Common.hideLoading();
                var errorDesc = CryptoAgent.GetLastErrorDesc();
                scf.confirm("请插入U盾", scf.confirm.typeEnum.warning);
                return false;
            }
          
            InfoContent = CryptoAgent.GetSignCertInfo("SerialNumber");
            // Opera浏览器，NPAPI函数执行结果为false时，不能触发异常，需要自己判断返回值。
            if (!InfoContent) {
            	Common.hideLoading();
                var errorDesc = CryptoAgent.GetLastErrorDesc();
                scf.confirm("请插入U盾", scf.confirm.typeEnum.warning);
                return false;
            }
            //lccbSn序列号存放位置
            document.getElementById("SelectCertResult").value = bSelectCertResult;
//           document.getElementById("ocxvalhidden3").value = InfoContent;
         }                  
    catch (e) {
    	Common.hideLoading();
       var errorDesc = CryptoAgent.GetLastErrorDesc();
       scf.confirm("请插入U盾", scf.confirm.typeEnum.warning);
        return  false;
    }
    return true;
}
			
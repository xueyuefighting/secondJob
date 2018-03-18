



var globalRandom = "";
var currentPhoneNoAndRandom = "";
var currentPhoneNo = "";
var $server_IP =  Common.SERVER_IP;//192.168.16.197
var tx_phone_code = "";//手机验证码
var ReturnURL = "";
var AgencyType = "";

(function ($) {
    "use strict";
    var mainApp = {

        main_fun: function () {
           
            /*====================================
              LOAD APPROPRIATE MENU BAR
           ======================================*/
            $(window).bind("load resize", function () {
                if ($(this).width() < 768) {
                    $('div.sidebar-collapse').addClass('collapse')
                } else {
                    $('div.sidebar-collapse').removeClass('collapse')
                }
            });

        },
        
        initialization: function () {
            mainApp.main_fun();

        }

    }
    // Initializing ///

    $(document).ready(function () {
        mainApp.main_fun();
        initData();//初始化数据
    });

}(jQuery));


function initData(){
	
	//切换账户相关字
    CommonAction.changeTip();
	//生成6位随机数
	 var randomId =  generateMixed(6);
	 var time = getCurrentTime();//.format("yyyyMMddHHmmssSSS");
	 globalRandom = time+randomId;
	 //从url中获取参数
	 var PlatformId = Common.getQueryString("PlatformId");
	 var InterfaceNo = Common.getQueryString("InterfaceNo");
	 var MerchantUserId = Common.getQueryString("MerchantUserId");
	 var UserRole = Common.getQueryString("UserRole");
	 var TerminalSource = Common.getQueryString("TerminalSource");
	 var FundId = Common.getQueryString("FundId");
	 ReturnURL = Common.getQueryString("ReturnURL");
	 var DirectStatus = Common.getQueryString("DirectStatus");//身份验证成功，直接跳往u盾合同页面
	 //展示返回商户端连接
	 if(!ReturnURL || ReturnURL==""){
		 $(".fh").remove();
	 }else{
		 if(ReturnURL.indexOf("http")<0){
			 ReturnURL = "http://"+ReturnURL;
		 }
		 
		 $(".fh").children('.buttons').attr('href',ReturnURL);
	 }
	 
	 //构造ajax请求参数
	 var obj = {};
	 obj.PlatformId = PlatformId;
	 obj.InterfaceNo = InterfaceNo;
	 obj.MerchantUserId = MerchantUserId;
	 obj.UserRole = UserRole;
	 obj.FundId = FundId;
	 obj.DirectStatus = DirectStatus;
	 obj.TerminalSource = TerminalSource;
	 var url = $server_IP+"/SERVICE/EMP/AuthenticationProcess";
	 var requestData = JSON.stringify(obj);
	 Common.showLoading();
	 $.ajax({
			type:"POST",
			url:url,
			dataType:"JSON",
			contentType:"application/json",
			data:requestData,
			success:function(data){
				Common.hideLoading();
				if(data){
					//成功
					if(data.Code=="2000"){
						var $result = data.DataList[0];
						var jsonStr = JSON.parse($result);
							//核心企业
							if(UserRole==10){
								companyData(jsonStr);
							}else if(UserRole==20){
								persionalData(jsonStr);
							}else{
								scf.confirm("用户角色有误,请核实后重新登陆", scf.confirm.typeEnum.error);
						}
						
					}else if(data.Code=="9000"){//身份验证完成，跳转到下一个页面
						var directUrl = "binding.html?DirectStatus=direct";///resources/html/u_scf/
						directUrl+="&PlatformId="+PlatformId;
						directUrl+="&InterfaceNo="+InterfaceNo;
						directUrl+="&MerchantUserId="+MerchantUserId;
						directUrl+="&UserRole="+UserRole;
						directUrl+="&FundId="+FundId;
						directUrl+="&ReturnURL="+ReturnURL;
						window.location.href=directUrl;
					}else{
						Common.hideLoading();
						alert(data.Message);
						window.location.href="https://www.yonyouscf.com";
					}
				}else{
					Common.hideLoading();
					alert("系统有误，请刷新页面后尝试");
					window.location.href="https://www.yonyouscf.com";
						}
				},error:function(){
					Common.hideLoading();
					alert("系统有误，请刷新页面后尝试");
					window.location.href="https://www.yonyouscf.com";
				}
			});
}

/*
 * 核心企业回显数据
 * @param jsonStr
 */
function companyData(jsonStr){
	var companyPerphone = jsonStr.companyPhone;//联系电话
//	bindConfirmClick(jsonStr);
	
	var companyName = jsonStr.CompanyName;//融资方企业名字
	var companyCode = jsonStr.CompanyCode;//融资企业代码
	var companyPerphoneSen = jsonStr.companyPhoneSen;//脱敏电话
	var companyAdminId = jsonStr.companyAdminId;//核心企业管理员主键id
	
	//缓存
	sessionStorage.setItem(globalRandom+companyPerphone, "ok")
	sessionStorage.setItem(globalRandom+companyName, "ok")
	sessionStorage.setItem(globalRandom+companyCode, "ok")
	sessionStorage.setItem(globalRandom+companyAdminId, "ok")
	
//	$("#xinyong").val(companyCode);
	currentPhoneNo = companyPerphone;
	$("span.telPhone").text(companyPerphoneSen);
	
//	$(".qcheng").text(companyName);
	
}
function persionalData(jsonStr){
	var AgencyPerphone = jsonStr.AdminPhone;//联系电话
	var AgencyPerphoneSen = jsonStr.AdminPhoneSen;//脱敏联系电话
//	bindConfirmClick(jsonStr);
	
	var AgencyName = jsonStr.AgencyName;//融资方企业名字
	var AgencyCode = jsonStr.AgencyCode;//融资企业代码
	var AgencyLegalcertno = jsonStr.AgencyLegalcertno;//融资证件
	AgencyType = jsonStr.AgencyType;//01 自然人， 02企业
	
	//缓存
	sessionStorage.setItem(globalRandom+AgencyName, "ok")
	sessionStorage.setItem(globalRandom+AgencyPerphone, "ok")
	sessionStorage.setItem(globalRandom+AgencyCode, "ok")
	sessionStorage.setItem(globalRandom+AgencyLegalcertno, "ok")
//	$(".xinyong").val(AgencyCode);
//	if(AgencyLegalcertno && AgencyLegalcertno!=""){
//		$(".xinyong").val(AgencyLegalcertno);
//	}
	currentPhoneNo = AgencyPerphone;
	$("span.telPhone").text(AgencyPerphoneSen);
	
//	$(".qcheng").text(AgencyName);
	if(AgencyType=="02"){
		$("ul.companyUl").show();
		$("ul.persionalUl").remove();
	}else{
		$("ul.companyUl").remove();
	}
}

/**
 * 修改用户名密码 确认按钮事件
 * @param jsonStr
 */
function bindConfirmClick(jsonStr){
	$("#confirmUserInfo").bind("click", function(){
		
		var userName = $("#zhangh").val();
		var password = $("#password").val();
		var password_bak = $("#passwords").val();
		
		if(userName=="" || password=="" || password_bak==""){
			scf.confirm("账号密码不能为空", scf.confirm.typeEnum.warning);
			return;
		}
		
		if(password!=password_bak){
			scf.confirm("两次输入的密码必须相同", scf.confirm.typeEnum.warning);
			return;
		}
		
		var resultObj = {};
		resultObj.adminUsername = userName;
		resultObj.adminPassword = password;
		
		$.ajax({
			type:"POST",
			url:$server_IP+"/SCFSERVICE/SCF/modifyUserInfo",
			dataType:"JSON",
			contentType:"application/json",
			data:JSON.stringify(resultObj),
			success:function(userInfoIdResult){
				Common.hideLoading();
				if(userInfoIdResult){
					scf.confirm(userInfoIdResult.msg, scf.confirm.typeEnum.success);
				}else{
					scf.confirm("系统有误，请刷新页面后尝试", scf.confirm.typeEnum.error);
				}
			},error:function(){
				Common.hideLoading();
				scf.confirm("系统有误，请刷新页面后尝试", scf.confirm.typeEnum.error);
			}
		});
	});
}

function getCurrentTime(){
	var date = new Date();
	return ""+date.getFullYear()+
	date.getMonth()+1+
	date.getDate()+
	date.getHours()+
	date.getMinutes()+
	date.getMilliseconds();
}

function generateMixed(n) {
    var res = "";
    for(var i = 0; i < n ; i ++) {
        var id = Math.ceil(Math.random()*35);
        res += id;
    }
    return res;
}

//发短信//短信倒计时
var countdown=120; 
function settime() { 
    if (countdown == 0) { 
         //$('.Obtains').removeAttribute("disabled");
        $('.Obtains').removeAttr("disabled");  
        $('.Obtains').removeClass('actives'); 
        $('.Obtains').css('cursor','pointer');
        $('.Obtains').val("获取验证码"); 
        countdown = 120; 
        return;
    } else { 
       	//$('.Obtains').setAttribute("disabled", true);
       $('.Obtains').attr("disabled",true);
       $('.Obtains').addClass('actives');
       $('.Obtains').css('cursor','default');
       $('.Obtains').val("重新发送(" + countdown + ")"); 
        countdown--; 
    } 
setTimeout(function() { 
    settime() }
    ,1000) 
}


function sendPhoneMsg(){

	if(currentPhoneNo==""){
		scf.confirm("当前操作有误，请刷新页面或者重新登录", scf.confirm.typeEnum.error);
		return;
	}
	var $obj = {};
	$obj.PhoneNo = currentPhoneNo;
	var url =  $server_IP+"/SCFSERVICE/SCF/sendPhoneMessage";
	var requestData = JSON.stringify($obj);
	 Common.showLoading();
	$.ajax({
		type:"POST",
		url:url,
		dataType:"JSON",
		contentType:"application/json",
		data:requestData,
		success:function(data){
			Common.hideLoading();
			if(data){
				if(data.Status=="2000"){

					tx_phone_code = data.tx_phone_code
					scf.confirm("操作成功，请将短信数字验证码填入前面的框内,验证码有效时间2分钟", scf.confirm.typeEnum.success);
					settime();
				}else{
					scf.confirm(data.msg, scf.confirm.typeEnum.error);
				}
			}else{
				scf.confirm("发送短信系统有误，请输入正确的手机号后重试", scf.confirm.typeEnum.error);
					}
			},error:function(){
				Common.hideLoading();
				scf.confirm("系统有误，请刷新页面后尝试", scf.confirm.typeEnum.error);
			}
		});

	}






function isEmpty(value){
  			if(value==null||value==""||typeof(value)=="undefined"){
  				return true;
  			}
  			return false;
  		}

function checkForm(){
	if(isEmpty($("#zhangh").val())){
			scf.confirm("用户名不能为空", scf.confirm.typeEnum.warning);
			return false;
		}
		if(isEmpty($("#password").val())){
			scf.confirm("密码不能为空", scf.confirm.typeEnum.warning);
			return false;
		}
		if(isEmpty($("#passwords").val())){
			scf.confirm("请确认密码", scf.confirm.typeEnum.warning);
			return false;
		}
		if($("#passwords").val() != $("#password").val()){
			scf.confirm("两次密码必须一样", scf.confirm.typeEnum.warning);
			return false;
		}
		if(isEmpty($(".zsxing").val())){
			scf.confirm("真实姓名不能为空", scf.confirm.typeEnum.warning);
			return false;
		}
		if(isEmpty($("#cards").val())){
			scf.confirm("身份证号码不能为空", scf.confirm.typeEnum.warning);
			return false;
		}
		if(isEmpty($(".qyming").val())){
			scf.confirm("企业名称不能为空", scf.confirm.typeEnum.warning);
			return false;
		}
		if(isEmpty($("#xinyong").val())){
			scf.confirm("社会信用代码不能为空", scf.confirm.typeEnum.warning);
			return false;
		}
		if(isEmpty($("#yanz").val())){
			scf.confirm("验证码不能为空", scf.confirm.typeEnum.warning);
			return false;
		}
}

function confirmEvent(){
	if($("#passwords").val() != $("#password").val()){
		$('.passConfirm').show();
	}else{
		$('.passConfirm').hide();
	}
}

//下一步
function loanNextStep(){
		/*	if(!HtmlHandle.userEventValid()){
				scf.confirm("用户名格式不正确", scf.confirm.typeEnum.warning);
				return false;
			}
			if(!HtmlHandle.passEventValid()==false){
				scf.confirm("密码格式不正确", scf.confirm.typeEnum.warning);
				return false;
			}
			if(!HtmlHandle.isCardNoValid()==false){
				scf.confirm("身份证号格式不正确", scf.confirm.typeEnum.warning);
				return false;
			}
			
			if(checkForm()){
				return;
			}*/		
			
	if($("#ming").length>0 && $("#xinyong").length>0){
		var $ming = $("#ming").val();//融资方名称
		var $xinyong = $("#xinyong").val();//社会代码
		if(!sessionStorage.hasOwnProperty(globalRandom+$ming)//key不存在
				|| !sessionStorage.hasOwnProperty(globalRandom+$xinyong)//key不存在
				|| $ming=="" //不存在
					|| 	$xinyong==""
						||	!("ok"==sessionStorage.getItem(globalRandom+$ming))
						|| !("ok"==sessionStorage.getItem(globalRandom+$xinyong))){//不存在
			scf.confirm("请填写正确的信息", scf.confirm.typeEnum.warning);
			return;
		}
	}
	
	//点击下一步，更新验证信息表的状态为20
//	var $code = $("#yanz").val();
//	if($code==""){
//		scf.confirm("请填写正确的验证码", scf.confirm.typeEnum.warning);
//		return;
//	}
	
	var url =  $server_IP+"/SERVICE/EMP/updateAuthentication";
	//从url中获取参数
	var PlatformId = Common.getQueryString("PlatformId");
	var InterfaceNo = Common.getQueryString("InterfaceNo");
	var MerchantUserId = Common.getQueryString("MerchantUserId");
	var UserRole = Common.getQueryString("UserRole");
	var FundId = Common.getQueryString("FundId");
	 
	var data = {};
	
	data.PlatformId = PlatformId;
	data.InterfaceNo = InterfaceNo;
	data.MerchantUserId = MerchantUserId;
	data.UserRole = UserRole;
	data.FundId = FundId;
	var childrenObj = {};
	childrenObj.signNoKey = tx_phone_code;
//	childrenObj.signNo = $code;
	data.PhoneSignNo = childrenObj;//用对象存手机验证码key-no
	//用户名和密码验证
	var userName = $("#zhangh").val();
	var password = $("#password").val();
	var password_bak = $("#passwords").val();
	
	if(userName=="" || password=="" || password_bak==""){
		scf.confirm("账号密码不能为空", scf.confirm.typeEnum.warning);
		return;
	}
	
	if(password!=password_bak){
		scf.confirm("两次输入的密码必须相同", scf.confirm.typeEnum.warning);
		return;
	}
	var resultObj = {};
	resultObj.adminUsername = userName;
	resultObj.adminPassword = password;
	if(UserRole==20){
		data.AgencyAdmin = resultObj;
	}else if(UserRole==10){
		data.CompanyAdmin = resultObj;
	}else{
		scf.confirm("参数有误", scf.confirm.typeEnum.warning);
		return;
	}
	Common.showLoading();
	$.ajax({
		type:"POST",
		url:url,
		dataType:"JSON",
		contentType:"application/json",
		data:JSON.stringify(data),
		success:function(data_re){
			Common.hideLoading();
			if(data_re){
				if(data_re.Code=="2000"){
					window.open(encodeURI("binding.html?PlatformId="+PlatformId+"&InterfaceNo="+InterfaceNo+//Common.ProjectName+"/resources/u_scf
							"&MerchantUserId="+MerchantUserId+"&UserRole="+UserRole+"&FundId="+FundId+"&AgencyType="+AgencyType)
							,"_self","location=no");
				}else if(data_re.Code=="1201"){//验证码有误
					scf.confirm("验证码有误，请重新输入", scf.confirm.typeEnum.warning);
				}else{
					scf.confirm("系统内部有误，请联系管理员", scf.confirm.typeEnum.error);
				}
			}else{
				scf.confirm("系统有误，请刷新页面后尝试", scf.confirm.typeEnum.error);
			}
		},error:function(){
			Common.hideLoading();
			scf.confirm("系统有误，请刷新页面后尝试", scf.confirm.typeEnum.error);
		}
	});
	
}





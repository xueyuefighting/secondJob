


var globalRandom = "";
var currentPhoneNoAndRandom = "";
var currentPhoneNo = "";
var $server_IP = Common.SERVER_IP;//192.168.16.197
var tx_phone_code = "";//手机验证码

//从url中获取参数
var PlatformId = "";
var InterfaceNo = "";
var MerchantUserId = "";
var UserRole = "";
var FundId = "";
var ReturnURL = "";
var DirectStatus = "";
var AgencyType = "";//仅当 当前登录用户为融资方时 才有可能存在值 01为自然人 02企业

//usb的CN号
var usbKeyCn = "";

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
        intiContrlElements();//控制页面元素
    });

}(jQuery));

function intiContrlElements(){
	AgencyType =  Common.getQueryString("AgencyType");
	if(AgencyType=="01"){
		$("#viewUkeyName").text("");
		$(".qualification").remove();
	}
}

function initData(){
	
	//切换账户相关字
    CommonAction.changeTip();
	//生成6位随机数
	 var randomId =  generateMixed(6);
	 var time = getCurrentTime();//.format("yyyyMMddHHmmssSSS");
	 globalRandom = time+randomId;
	 //从url中获取参数
	 PlatformId = Common.getQueryString("PlatformId");
	 InterfaceNo = Common.getQueryString("InterfaceNo");
	 MerchantUserId = Common.getQueryString("MerchantUserId");
	 UserRole = Common.getQueryString("UserRole");
	 FundId = Common.getQueryString("FundId");
	 ReturnURL = Common.getQueryString("ReturnURL");
	 DirectStatus = Common.getQueryString("DirectStatus");//身份验证成功，直接跳往u盾合同页面
	 
	 //展示返回商户端连接
	 if(!ReturnURL || ReturnURL==""){
		 $(".fh").remove();
	 }else{
		 $(".fh").children('.btns').attr('href',ReturnURL);
	 }
	 
	 //构造ajax请求参数
	 var obj = {};
	 obj.PlatformId = PlatformId;
	 obj.InterfaceNo = InterfaceNo;
	 obj.MerchantUserId = MerchantUserId;
	 obj.UserRole = UserRole;
	 obj.FundId = FundId;
	 obj.DirectStatus = DirectStatus;
	 var url = $server_IP+"/SERVICE/EMP/AuthenticationProcess";
	 var requestData = JSON.stringify(obj);
	 $.ajax({
			type:"POST",
			url:url,
			dataType:"JSON",
			contentType:"application/json",
			data:requestData,
			beforeSend:function(){
				 Common.showLoading();
			},
			complete:function(){
				Common.hideLoading();
			},
			success:function(data){
				if(data){
					//成功
					if(data.Code=="2000" || data.Code=="9000"){
						var $blank = $(".blank");
						var capitals = "";
						$.each(data.DataList,function(i,v){
							var readonlyState = "";
							if(i==0){
								readonlyState = "checked=checked";
								onclickToCheckCapital(v);
							}
							 //capitals += "<li><input "+readonlyState+" type='radio' onclick=\"onclickToCheckCapital('"+v+"');\" name='Fruit' value='"+v+"' ><span name='capitalId'>"+v+"</span></li>"
							capitals += "<li><input "+readonlyState+" type='radio' onclick=\"onclickToCheckCapital('"+v+"');\" name='Fruit' value='"+v+"' ><img src='../../images/"+v+".png'/></li>"
						});
						$blank.append(capitals);
					}else{
						alert(data.Message);
						window.location.href="https://scf.yonyou.com";
					}
				}else{
					alert("系统有误，请刷新页面后尝试");
					window.location.href="https://www.yonyouscf.com";
						}
				},error:function(){
					alert("系统有误，请刷新页面后尝试");
					window.location.href="https://www.yonyouscf.com";
				}
			});
}

function onblank(){
	var blakhao=$('span[name=capitalId]').val();
	var blakhao = $('.blank input[name="Fruit"]:checked').val();
	onclickToCheckCapital(blakhao);


}

function onclickToCheckCapital(capitalId){
	var obj = {};
	obj.CapitalId = capitalId;
	obj.MerchantUserId = MerchantUserId;
	 obj.UserRole = UserRole;//10--当前登录人为核心企业  查看的是融资方的  20 则当前登录人为融资方  查看核心企业分类的
	$.ajax({
		type:"POST",
		url:$server_IP+"/SERVICE/EMP/USERBEFORELOAN/capitalDetails",
		dataType:"JSON",
		contentType:"application/json",
		data:JSON.stringify(obj),
		beforeSend:function(){
			 Common.showLoading();
		},
		complete:function(){
			Common.hideLoading();
		},
		success:function(data){
			//初始化模块
            $("#UShield").hide();
            $("#contract").hide();
            $("#nothing").hide();
            $("#success").hide();
            $("#finish").hide();
            $('.tank').hide();
			$('.binds').hide();
			if(data.Code=="1002"){//展示绑定u盾
				$("#UShield").show();
			}else if(data.Code=="1004"){//展示合同页面
               /* var flg = false;
                $.each(JSON.parse(data.DataList[0]), function (i, item) {
                    if (item.state == "00") {
                        flg = true;
                        return flg;
                    }
                });*/
               // if(flg){
                    //获取合同Div
                    getContractDiv(capitalId,data,UserRole);
                    //显示合同DIV
                    $("#contract").show();
               // }else{
                    //显示合同签属已完成DIV
                //    $("#success").show();
               // }
            }else if((data.Code=="1008" || data.Code=="1003" || data.Code=="0003" ) && UserRole==10){//目前暂无需要签署的合同或合同正在等待资方验签
                $("#nothing").show();
            }else if(data.Code=="1003"){//待前准备已完成
                $("#finish").show();
			}else if(data.Code=="0003"){
				window.scf.confirm(data.Message, scf.confirm.typeEnum.info);//线下银行，可以直接申请融资
			}else{//参数有误
				window.scf.confirm(data.Message, scf.confirm.typeEnum.warning);
			}

		},error:function(){
			window.scf.confirm("系统有误，请刷新页面后尝试", scf.confirm.typeEnum.error);
		}
		
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

/*
 * 返回u盾系列号
 * @returns {String}
 * 如果页面有value_hidden_usbk 的class属性，就会增加<input name='snNo' type='hidden' value='"+cn+"'/>
 */
function obtainUsbCn(){
	var InfoTypeID = "SerialNumber";
    var InfoContent = "";
	//取证书
	/*try {                  
        document.getElementById("SelectCertResult").value = "";

        var subjectDNFilter = "";
        var issuerDNFilter = "";
        var serialNumFilter = "";
        var bSelectCertResult = "";
        bSelectCertResult = CryptoAgent.SelectCertificate(subjectDNFilter, issuerDNFilter, serialNumFilter);                        
        // Opera浏览器，NPAPI函数执行结果为false时，不能触发异常，需要自己判断返回值。
        if (!bSelectCertResult) 
        {
            var errorDesc = CryptoAgent.GetLastErrorDesc();
            scf.confirm(errorDesc, scf.confirm.typeEnum.warning);
        }
        document.getElementById("SelectCertResult").value = bSelectCertResult;
     }                  

	catch (e) {
		Common.hideLoading();
	    var errorDesc = CryptoAgent.GetLastErrorDesc();
	    scf.confirm(errorDesc, scf.confirm.typeEnum.warning);
	    return;
	}*/
	var cn = "";
	//取CN
	try {
        InfoContent = CryptoAgent.GetSignCertInfo(InfoTypeID);
        // Opera浏览器，NPAPI函数执行结果为false时，不能触发异常，需要自己判断返回值。
        if (!InfoContent) {
            var errorDesc = CryptoAgent.GetLastErrorDesc();
            window.scf.confirm(errorDesc, window.scf.confirm.typeEnum.warning);
        }
        cn = InfoContent;
    } catch (e) {
    	Common.hideLoading();
        var errorDesc = CryptoAgent.GetLastErrorDesc();
        window.scf.confirm(errorDesc, window.scf.confirm.typeEnum.warning);
        return;
    }
    $("body").append("<input name='snNo' type='hidden' value='"+cn+"'/>");
    return cn;
}

/*
 *选择证书 
 */
function selectUkey(){
	//检查u盾是否存在
	var existsUsbk = valLccbUsbkeyisTrue();
	
	if(!existsUsbk){
		return;
	}
	
	Common.showLoading();
	
    var obj = {};
    obj.MerchantUserId = MerchantUserId;
	 obj.UserRole = UserRole;
	 
	 var SnNo = obtainUsbCn();
	 
	 if(!SnNo || SnNo==""){
	    	return;
	    }
	 obj.SnNo = SnNo;
	 
	 /**
	  * 加入遮罩提示
	  */
	 
    //获取签名信息做签名
	 var bool = obtainCurrentUserInfoUkey(obj);
    if(bool!="" && bool){
    	$(".DQF").remove();
    	$(".qualification").append("<span class='DQF' onclick='downLoadQualification(this);' title='点击即可下载授权书' style='color: blue;cursor: pointer;' name='"+bool+"'>《U盾使用授权书》</span>");
    	Common.hideLoading();
    	scf.confirm("加载U盾证书成功", scf.confirm.typeEnum.success);
    }else{
    	   Common.hideLoading();
    	   scf.confirm("加载u盾证书失败，请刷新页面重试", scf.confirm.typeEnum.warning);
    }
}


/***
 * 签署
 * @param id
 */
function signPact(PactNum,creditid,pacttype) {
	Common.showLoading();
	
	//检查u盾是否存在
	var existsUsbk = valLccbUsbkeyisTrue();
	
	if(!existsUsbk){
		return;
	}
    var obj = {};
    obj.PactNum = PactNum;
    obj.MerchantUserId = MerchantUserId;
    obj.UserRole = UserRole;
    
    //取u盾序列号
    var SnNo = obtainUsbCn();
    if(!SnNo || SnNo==""){
    	return;
    }
    obj.SnNo = SnNo;
    console.log(SnNo);
    obj.creditid = creditid;
    obj.pacttype = pacttype;
    
    obtainCurrentUserInfoPact(obj);//
    
    obj.Text0 = $("input[name=resource]").val();
    obj.Text1 = $("input[name=sendMsg]").val();
    obj.Text2 = $("input[name=signature]").val();
    var requestData = JSON.stringify(obj);
    $.ajax({
        type:"POST",
        url:$server_IP+"/SERVICE/EMP/USERBEFORELOAN/signPact",
        dataType:"JSON",
        contentType:"application/json",
        data:requestData,
        success:function(data){
        	Common.hideLoading();
        	if(data.Code=="2000"){
        		var dataList = JSON.parse(data.DataList[0]);
        		scf.confirm("签署成功", scf.confirm.typeEnum.success);
        		//修改签署信息
        		$("#"+PactNum).prev().html(dataList.Time + "已签署");
        		//移出签署按钮
        		$("#"+PactNum).remove();
        		if(getSing()){
        			$("#success").show();
        		}
        	}else{
        		scf.confirm(data.Message, scf.confirm.typeEnum.warning);
        	}
        },error:function(){
        	Common.hideLoading();
        	scf.confirm("系统有误，请刷新页面后尝试", scf.confirm.typeEnum.error);
        }
    });
}

/*
 * 合同--获取当前人信息
 * @returns {String}
 */
function obtainCurrentUserInfoPact(obj){
	Common.showLoading();
	$.ajax({
	  type:"POST",
	  url:$server_IP+"/SERVICE/EMP/USERBEFORELOAN/signInfoByPact",
	  dataType:"JSON",
	  async: false,
	  contentType:"application/json",
	  data:JSON.stringify(obj),
	  success:function(data){
		Common.hideLoading();
		if(data && data.Code=="2000"){//获取明文成功
			var dataList = JSON.parse(data.DataList[0]);
			var $dataList = dataList;
			if($dataList.resource && $dataList.resource!=""){//存在并且不为""
				
				var resource = $dataList.resource+"";//原文
				$("body").append("<input type='hidden' name='resource' value='"+resource+"'/>");
				try{
					//拼接报文和密文
					if(checkForSign(resource,"签署合同","")){
					}
			}catch(e){
				scf.confirm(e.message, scf.confirm.typeEnum.warning);
				return;
			}
			}
		}else{//各种错误
			scf.confirm(data.Message, scf.confirm.typeEnum.warning);
		}
		//返回值：{idName=20170513235715636635976903786601, resource=20170513235715|zqn|9601612000708002|d41d8cd98f00b204e9800998ecf8427e}
		//有idName就显示 授权书连接，让用户点击下载
		//点击下载，取ftp文件下载到本地 D:/yonyou/ukey/
		//绑定u盾，要记得将oms主键回传
		//签署合同功能类似
	},error:function(){
		Common.hideLoading();
		scf.confirm("系统有误，请刷新页面后尝试", scf.confirm.typeEnum.error);
		return;
	}
});

}

/*
 * 获取当前登录人的信息
 * @param obj
 * @param noticeScret
 * @returns {String}
 */
function obtainCurrentUserInfoUkey(obj){
	var flag_all;
//	Common.showLoading();
	$.ajax({
	  type:"POST",
	  url:$server_IP+"/SERVICE/EMP/USERBEFORELOAN/signInfo",
	  dataType:"JSON",
	  async: false,
	  contentType:"application/json",
	  data:JSON.stringify(obj),
	  success:function(data){
		console.log(data);
		if(data && data.Code=="2000"){//获取明文成功
			var dataList = JSON.parse(data.DataList[0]);
			var $dataList = dataList;
			if($dataList.idName && $dataList.idName!=""){//存在并且不为""
				
				var resource = $dataList.resource+"";//原文
				$("body").append("<input type='hidden' name='resource' value='"+resource+"'/>");
				
				//直接再一次请求，校验证书信息
				try{
					if(checkForSign(resource,"U盾使用授权书",$dataList.idName)){
						flag_all =  $dataList.idName;
					}
			}catch(e){
				Common.hideLoading();
				scf.confirm(e.message, scf.confirm.typeEnum.warning);
				return;
			}
			}
		}
		//返回值：{idName=20170513235715636635976903786601, resource=20170513235715|zqn|9601612000708002|d41d8cd98f00b204e9800998ecf8427e}
		//有idName就显示 授权书连接，让用户点击下载
		//点击下载，取ftp文件下载到本地 D:/yonyou/ukey/
		//绑定u盾，要记得将oms主键回传
		//签署合同功能类似
	},error:function(){
		Common.hideLoading();
		scf.confirm("系统有误，请刷新页面后尝试", scf.confirm.typeEnum.error);
		return;
	}
});

	return flag_all;
}

function checkForSign(resource,target,idName){
	 /*
	  * source 签名原文
	  */
	var source = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
		"<T>" +
		"<D><M><k>操作人名称：</k><v>"+resource.split("|")[1]+"</v></M><M><k>业务描述：</k><v>"+target+"</v></M></D>" +
		"<E><M><k>加密数据：</k><v>"+target+"</v></M></E>" +
		"</T>";
	
	
	$("body").append("<input type='hidden' name='sendMsg' value='"+source+"'/>");//报文
	var signature = CryptoAgent.SignMsgPKCS7(resource, "SHA-1", true);//密文
	if (!signature) {
		var errorDesc = CryptoAgent.GetLastErrorDesc();
		scf.confirm(errorDesc, scf.confirm.typeEnum.warning);
		return;
	}
	 $("body").append("<input type='hidden' name='signature' value='"+signature+"'/>");
	 /**
	  * 切换遮罩提示
	  */
	 var obj = {};
	 obj.Text0 = $("input[name=resource]").val();
	 obj.Text2 = $("input[name=signature]").val();
	 obj.SnNo = $("input[name=snNo]").val();
	 obj.IdName = idName;
	 
	 var bool = false;
	 
	 //进行证书信息校验, 如果校验失败，要删除ftp文件系统上生产对应文件。
	 //（只能先生成再删除。原因：生成明文需要指定文件的md5，目前需求是生成模板，所以在返回明文的时候，文件已经存在在ftp系统中。
	 //不能将临时文件放在本地，绑定的时候再上传ftp系统，因为会出现很多冗余。日后，如果将需求改为，让用户下载模板，自己手动上传，可以修改）
	 $.ajax({
		 type:"POST",
		  url:$server_IP+"/SERVICE/EMP/QUALIFICATION/checkQuality",
		  dataType:"JSON",
		  async: false,
		  contentType:"application/json",
		  data:JSON.stringify(obj),
		  success:function(data){
			  Common.hideLoading();
			  if(data && data.Code=="2000"){
				  /**
					  * 验证成功，关闭遮罩
					  */
				 // scf.confirm("证书校验成功", scf.confirm.typeEnum.success);
				  bool =  true;
			  }else{
				  scf.confirm(data.Message, scf.confirm.typeEnum.warning);
				  $("input[name=signature]").remove();
				  $("input[name=sendMsg]").remove();
				  $("input[name=resource]").remove();
				  $("input[name=snNo]").remove();
				  $("input.DQF").remove();
			  }
		  },error:function(){
			  Common.hideLoading();
			  $("input[name=signature]").remove();
			  $("input[name=sendMsg]").remove();
			  $("input[name=resource]").remove();
			  $("input[name=snNo]").remove();
			  $("input.DQF").remove();
			  scf.confirm("证书验证有误，请检查u盾并重试", scf.confirm.typeEnum.warning);
		  }
	 });
	 return bool;
}


/*
 * 下载u盾授权书，不用传入filePath即可，因为后台代码最开始，下载专门是为下载u盾授权书准备，后也兼容下载合同
 * @param obj
 */
function downLoadQualification(obj){
	var $obj = $(obj);
	var value = $obj.attr("name");
	window.location.href = $server_IP+"/SERVICE/EMP/USERBEFORELOAN/downLoadQualification?idName="+value+"&showUserFileName=U盾使用授权书";
}

/*
 * 从ftp上下载文件
 * @param name
 * @param filePath
 * @param showUserFileName 用户下载时看到的文件名字
 */
function downLoadFileFromFTP(name,filePath,showUserFileName){
	window.location.href = $server_IP+"/SERVICE/EMP/USERBEFORELOAN/downLoadQualification?idName="+value+"&filePath="+filePath+"&showUserFileName="+showUserFileName;
}

//开始绑定
function bingUkey(){
	//检查u盾是否存在
	var existsUsbk = valLccbUsbkeyisTrue();
	
	if(!existsUsbk){
		return;
	}
	
	var signature = $("input[name=signature]").val();
	if(!$("input[name=signature]") || $("input[name=signature]").length==0 ||  $.trim(signature)==""){
		scf.confirm("请选择证书", scf.confirm.typeEnum.warning);
		return;
	}
	//var capitalId = $("input[name=Fruit][type=radio]:checked").next().text();
	var capitalId = $('.blank input[name="Fruit"]:checked').val();;//需要一个真实的资方id  等小易的隐藏域
	var obj = {};
	obj.SnNo =  $("input[name=snNo]").val();
	obj.MerchantUserId = MerchantUserId;
	obj.Text0 = $("input[name=resource]").val();
	obj.Text2 = signature;
	obj.UserRole = UserRole;
	obj.CapitalId = capitalId;
	obj.PlatformId = PlatformId;
	obj.InterfaceNo = InterfaceNo;
	Common.showLoading();
	 $.ajax({
			type:"POST",
			url:$server_IP+"/SERVICE/EMP/USERBEFORELOAN/addLccbUsbKey",
			dataType:"JSON",
			contentType:"application/json",
			data:JSON.stringify(obj),
			success:function(data){
				Common.hideLoading();
				if(data.Code=="2000"){
					$('.tank').show();
					$('.binds').show();
					/*
					 *执行刷新当前tab页
					 */
					onclickToCheckCapital(capitalId);
					
				}else{
					scf.confirm(data.Message, scf.confirm.typeEnum.warning);
				}
			},error:function(){
				Common.hideLoading();
				scf.confirm("系统有误，请刷新页面后尝试", scf.confirm.typeEnum.error);
				return;
			}
	 });
}


$('.xians').click(function(){
    $('.yin').toggle(1000)
});

function getContractDiv(id,data,UserRole) {
    var capitals = "";
    if($("#"+id).val() != undefined){
        $("#"+id).show();
    }else {
    	$("#contract").empty();
        capitals += "<div id='" + id + "'>";
        $.each(JSON.parse(data.DataList[0]), function (i, item) {
        	var downLoadPactUrl = $server_IP+"/SERVICE/EMP/USERBEFORELOAN/downLoadQualification?idName="+item.pacttype+"&filePath="+item.creditid+"&showUserFileName="+item.pactname;
        	
        	var rzcp;
        	
            if (rzcp != item.capitalname + "-" + item.productname + "-" + item.dbstylename) {
                if (capitals != "") {
                    capitals += "</ul>";
                }

                capitals += "<ul class='wentou'>";
                capitals += "   <li class='rongp'>融资产品:<span>" + item.capitalname + "-" + item.productname + "-" + item.dbstylename + "</span></li>";
                capitals += "   <li class='shouxin'>授信额度:<span style='color:#ff4800;font-size:16px;line-height:16px;'>" + Common.yuanFormatMoney(item.creditamountall) + "</span>元</li>";
                capitals += "</ul>";
                capitals += "<ul class='wencon'>";
                capitals += "    <li class='mingxi'>";
                capitals += "        <ul class='zonghe'>";
	            if(UserRole==10){
	            	capitals += "        <li>融资方名称:<span>" + item.agencyname + "</span></li>";	
	            }else{
	             	capitals += "        <li>核心企业:<span>" + item.companyname + "</span></li>";	
	            }
               
                capitals += "            <li>年化利率:<span>" + item.productrate + "%</span></li>";
                capitals += "            <li>单笔借款期限:<span>" + item.creditsign + "个月</span></li>";
                capitals += "            <li>出 借 人:<span>" + item.capitalname + "</span></li>";
                capitals += "            <li>授信起始日:<span>" + item.creditstartdate + "</span></li>";
                capitals += "            <li>授信到期日:<span>" + item.creditdate + "</span></li>";
                capitals += "            <li>担保方式:<span>" + item.dbstylename + "</span></li>";
                capitals += "            <li>借款比例:<span>" + item.creditloanrate + "%</span></li>";
                capitals += "        </ul>";
                capitals += "    </li>";
                rzcp = item.capitalname + "-" + item.productname + "-" + item.dbstylename;
            } 
            if(item.creditstatus=="03"){//验签成功
            	//验签成功  展示本人签署时间和水印
            	
            	capitals += "    <li><span class='bian'>合同编号:</span><span  class='bian1'>" + item.pactnum + "</span><span class='bian2'></span></li>";
            	capitals += "    <li><span class='wenben'>合同文本:</span><a  class='wenben1' href='" + downLoadPactUrl + "'>《" + item.pactname + "》.pdf  查看</a><span class='wenben2'>" + item.pactdt + "已签署</span><a class='wenben3' href='' style='display:none'></a></li>";  
            }else if(item.creditstatus=="05"){//撤销授信
            	//撤销授信，当前授信作废 只有水印
            	
            	if(item.pactname && item.pactname!=""){
            		capitals += "    <li><span class='bian'>合同编号:</span><span  class='bian1'>" + item.pactnum + "</span><span class='bian2'></span></li>";
            		capitals += "    <li><span class='wenben'>合同文本:</span><a  class='wenben1' href='" + downLoadPactUrl + "'>《" + item.pactname + "》.pdf  查看</a><span class='wenben2'>授信已被撤销</span><a class='wenben3' href='' style='display:none'></a></li>";  //<span class='wenben2'>" + item.pactdt + "</span>
            	}
            }else  if (item.state == "00") {
            	capitals += "    <li><span class='bian'>合同编号:</span><span  class='bian1'>" + item.pactnum + "</span><span class='bian2'></span></li>";
            	capitals += "    <li><span class='wenben'>合同文本:</span><a  class='wenben1' href='" + downLoadPactUrl + "'>《" + item.pactname + "》.pdf  查看</a><span class='wenben2'></span><span class='wenben3'  id='"+item.pactnum+"' onclick=\"signPact('"+item.pactnum+"','"+item.creditid+"','"+item.pacttype+"');\">签署</span></li>";
            } else {
            	capitals += "    <li><span class='bian'>合同编号:</span><span  class='bian1'>" + item.pactnum + "</span><span class='bian2'></span></li>";
            	capitals += "    <li><span class='wenben'>合同文本:</span><a  class='wenben1' href='" + downLoadPactUrl + "'>《" + item.pactname + "》.pdf  查看</a><span class='wenben2'>" + item.pactdt + "已签署</span><a class='wenben3' href='' style='display:none'></a></li>";  
            }
            
            capitals += "</div>";
        
        });
    }
    $("#contract").append(capitals);
}

/***
 * 获取签署状态:需要签署false/不需要签署true
 * @returns {boolean}
 */
function  getSing() {
    $(".wenben3").each(function(i,v){
        if($(v).val() == "签署"){
            return false;
        }
    });
    return true;
}








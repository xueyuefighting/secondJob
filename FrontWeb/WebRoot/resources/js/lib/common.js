	var Common = {
	    //后台服务ip
	    SERVER_IP: "http://192.168.16.242:53001/Gateway",///Gateway
	    ProjectName:"3007-FrontWeb",
	    getQueryString: function (name) {
	        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	        var r = window.location.search.substr(1).match(reg);
	        if (r != null) return unescape(r[2]);
	        return null;
	    },
	    changeLogo: function () {//更改logo
	        var platformId = Common.getQueryString("PlatformId");
	        $("#serverLogoImg").attr("src", "../../images/" + platformId + ".png");
	    },
	    showLoading: function() {
	        var loading = "";
	        loading += "<div class=\"mask\"></div>";
	       //loading += "<div class=\"effects\"><img src=\"../../images/loading.gif\" /></div>";
	        loading +="<div class='load-container load4'>";
	        loading +="<div class='loader'>Loading...</div>";
			loading +="</div>"
	        $('body').append(loading);
	    },
	    hideLoading: function() {
	    	$('.mask').remove();
	    	$('.load-container').remove();
	    },
	   
	    fenFormatMoney: function(value){
	    	value=value*0.01;//分到元
	    	value+='';//转成字符串
	    	var reg=value.indexOf('.') >-1 ? /(\d{1,3})(?=(?:\d{3})+\.)/g : /(\d{1,3})(?=(?:\d{3})+$)/g;//千分符的正则
	    	value=value.replace(reg, '$1,');//千分位格式化
	    	return value;
	    },
	    
	    yuanFormatMoney: function(value){
	    	value = value*100;
	    	var val =""+ Common.fenFormatMoney(value);
	    	val = val.indexOf('.')<0?val+'.00':val;
	    	return val;
	    },
	    restoreFormatMoney: function(value){//将格式化好的金额1111.00 还原111100
	    	value+='';
	    	value = Common.replaceAll(value,'.');
	    	value = Common.replaceAll(value,',');
	    	return value;
	    },
	    replaceAll:function(value,symbol){
	    	value+='';
	    	while(value.indexOf(symbol)>-1){
	    		value = value.replace(symbol,'');
	    	}
	    	return value;
	    },
	    //打开新窗口
	    openNewWindow:function(url){
	    	window.open(url,"_blank");
	    },
	    isEmpty:function(value){//验证不能为空输入框
	  			if(value==null||value==""||typeof(value)=="undefined"){
	  				return true;
	  			}
	  			return false;
	  	},
	  	userEvent:function(value){//用户名的正则
	        /**
	         * 输入验证:4~18个字符，可使用字母、数字、下划线
	         * @param value
	         * @returns {boolean}
	         */
	        // var uesrs=$('#zhangh').val();
	        var reg=/^[0-9a-zA-Z\u4e00-\u9fa5_]{4,18}$/;
	         
	        return reg.test(value);
	    } ,
	     passEvent:function(value){//
	     	        /**
	         * 输入验证:密码的正则
	         * @param value
	         * @returns {boolean}
	         */
	           // var passwords=$('#password').val();
	            //var reg1 = /[!@#$%^&*()_?<>{}]{1}/;
	            //var reg2 = /([a-zA-Z0-9!@#$%^&*()_?<>{}]){8,20}/;
	            //var reg2 = /^(?=.*\d)(?=.*[a-zA-Z])(?=.*[~!@#$%^&*])[\da-zA-Z~!@#$%^&*]{8,20}$/
	            var reg2 =/^((?=.*[0-9])(?=.*[a-zA-Z])|(?=.*[0-9])(?=.*[^\s0-9a-zA-Z])|(?=.*[a-zA-Z])(?=.*[^\s0-9a-zA-Z]))[^\s]{8,20}$/;
	            //var reg4 = /[0-9]+/;
	            if(reg2.test(value)){
	                
	                return true;
	            }else{
	            	return false;
	            }

	     },
	     isCardNo:function(value){
	         /*
	         * 输入验证:身份证号码为15位或者18位，15位时全为数字，18位前17位为数字，最后一位是校验位，可能为数字或字符X  
	         * @param value
	         * @returns {boolean}
	         */  
	       var reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;  
	       var card=$('#cards').val();
			if(reg.test(value)){  
			   return true;  
			}else{
				   return false;
			}
	    } 



	}

	var CommonAction = {
			 loginInfo:function(){//登录人信息 并记录当前登录信息
		    	 var UserRole = Common.getQueryString("UserRole");
		    	 var MerchantUserID = Common.getQueryString("MerchantUserID");
		    	 var str = "<span class='loginTimeKey'>上次登录时间：</span>" ;
		    	 $.ajax({
		 			type:"GET",
		 			url:Common.SERVER_IP+"/SCFSERVICE/SCF/loginInfo?UserRole="+UserRole+"&MerchantUserId="+MerchantUserID,
		 			dataType:"JSON",
		 			contentType:"application/json",
		 			success:function(data){
						if(data && data!=""){
		 					str+="<span class='loginTimeValue'>"+data.lastTime+"</span>";
		 					$(".loginTime").empty().append(str);
		 				}
		 			},error:function(){
	//	 				scf.confirm("获取当前登录人信息有误，请刷新页面后尝试", scf.confirm.typeEnum.error);
		 				}
		    	 });
					
		    },
		    changeTip: function () {
		        var platformId = Common.getQueryString("PlatformId");

		        $.ajax({
		            type: "GET",
		            url: Common.SERVER_IP + "/SCFSERVICE/SCF/rePlatformNameById?platformId=" + platformId,
		            dataType: "text",
		            contentType: "application/json",
		            success: function (data) {
		            		var dat = JSON.parse(data);
		            		if(dat.code=="2000"){
		            			$("#belowPlatform").text("(非" + dat.msg + ")");
		            		}else{
		            			alert("平台编码有误，请确认");
		            			window.location.href="https://www.yonyouscf.com";
		            		}
		            }, error: function () {
		            		window.scf.confirm("请求出错", window.scf.confirm.typeEnum.error);
		            }
		        });

		    }
	}
	
	var HtmlHandle = {
			userEventValid:function(){
				$(".userEventValid").each(function(){
					var $this = $(this);
					$this.bind("blur",function(){
						if(!Common.userEvent($this.val())){
							return false;
						}
					});
				});
			},
			passEventValid:function(){
				$(".passEventValid").each(function(){
					var $this = $(this);
					$this.bind("blur",function(){
						if(!Common.passEvent($this.val())){
							return false;
						}
					});
				});
			},
			isCardNoValid:function(){
				$(".isCardNoValid").each(function(){
					var $this = $(this);
					$this.bind("blur",function(){
						if(!Common.isCardNo($this.val())){
							return false;
						}
					});
				});
			},
			valid:function(){
				$(".userEventValid").each(function(){
					var $this = $(this);
					$this.bind("blur",function(){
						if(!Common.userEvent($this.val())){
							$this.parent().find(".validMsg").show();
						}else{
							$this.parent().find(".validMsg").hide();
						}
					});
				});
				$(".passEventValid").each(function(){
					var $this = $(this);
					$this.bind("blur",function(){
						if(!Common.passEvent($this.val())){
							$this.parent().find(".validMsg").show();
						}else{
							$this.parent().find(".validMsg").hide();
						}
					});
				});
				$(".isCardNoValid").each(function(){
					var $this = $(this);
					$this.bind("blur",function(){
						if(!Common.isCardNo($this.val())){
							$this.parent().find(".validMsg").show();
						}else{
							$this.parent().find(".validMsg").hide();
						}
					});
				});
			}
	}
	
	$(function () {
	    //切换logo
	    //Common.changeLogo();
	    //登录信息
	   // CommonAction.loginInfo();
	    //页面输入框验证 但不是阻止点击下一步的控制
	    HtmlHandle.valid();
	})
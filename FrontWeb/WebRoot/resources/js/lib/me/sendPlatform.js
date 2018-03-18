$(document).ready(function(){
	init();//初始化
});

function init(){
	initData();//初始化数据
	initButton();//初始化按钮
}

function initData(){
	getUrlParam();//获取地址栏参数 放入页面隐藏域
}

function initButton(){
	$("#submit").bind("click",submitForm);
}

function submitForm(){
	
	//获取实体类key-value 旨在保存
	var $obj = {};
	$.each($("input"),function(i,v){
		var name = $(v).attr("name");
		var value = $(v).val() 
		$obj[name]=value;
	});
	
	$.ajax({
		type:"POST",
		url:"http://127.0.0.1:8090/SERVICE/EMP/insert",
		dataType:"JSON",
		contentType:"application/json",
		data:JSON.stringify($obj),
		success:function(data){
			$("#confirm-result").dialog({
					modal:true,
					draggable:false,
					 buttons: {
					        "返回": function() {
					          $( this ).dialog( "close" );
					          history.back(); 
					        },
					        "跳转":function(){
					        	$( this ).dialog( "close" );
					        	window.open("../platForm/platList.html","_self");
					        }
					      }
			});
		},error:function(){
			alert("系统有误");
		}
	});
	
}

/**
 * 获取地址栏中的参数
 */
function getUrlParam(){
	
	var platformId = sessionStorage.platformId;
	var centerCompanyNo = sessionStorage.centerCompanyNo;
	var centerCompanyName =sessionStorage.centerCompanyName;
	var gAId = sessionStorage.gAId;
	
	$("input[name=platformId]").val(platformId);
	$("input[name=centerCompanyNo]").val(centerCompanyNo);
	$("input[name=centerCompanyName]").val(centerCompanyName);
	$("input[name=gAId]").val(gAId);
	
	sessionStorage.removeItem("platformId");
	sessionStorage.removeItem("centerCompanyNo");
	sessionStorage.removeItem("centerCompanyName");
	sessionStorage.removeItem("gAId");
	
}
function getUrlParameterByName(name){
	 var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
     
	 var ur = decodeURI(window.location.search);
	 
	 var r = ur.substr(1).match(reg);
     
     if (r != null) return unescape(r[2]); 

     return null;
}
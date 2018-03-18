$(document).ready(function(){
	if(sessionStorage.zhang){
		sessionStorage.zhang=1+sessionStorage.zhang;
	}else{
		sessionStorage.zhang=1;
	}
	//初始化
	init();
});

function init(){
	initData();//初始化数据
	initButton();//初始化按钮
}

function initData(){
	
}

function initButton(){
	//transfor button
	transfor();
	comeBack();
	userLoanSubmit();
}

function userLoanSubmit(){
	$("#userLoanSubmit").bind("click",function(){
		var userRole = $("input.bindUserLoanForm[name=UserRole]").val();
		var url = "resources/html/u_scf/identity.html?";
		if(userRole==20){
			url = "resources/html/u_scf/personalVerify.html?";
		}
		$.each($("input.bindUserLoanForm"),function(i,v){
			var $this = $(v);
			var $name = $this.attr("name");
			var $value = $this.val();
			url+=$name+"="+$value+"&";
		});
		window.open(encodeURI(url)
				,"_self","location=no");
	});
}

function userBeforeLoan(){
	$("#div_one").hide();
	$("#div_two").show(700);
}
function comeBack(){
	$("#comeBack").bind("click",function() {
		$("#div_two").hide();
		$("#div_one").show();
	})
}
function transfor(){
	$("#transfor").bind("click", function(){
		$("input").attr("readonly","readonly");
		$(this).unbind("click").removeAttr("id").text("正在转接...");
		var platformId = $("input[name=platformId]").val();
		var centerCompanyNo = $("input[name=centerCompanyNo]").val();
		var centerCompanyName = $("input[name=centerCompanyName]").val();
		var gAId = $("input[name=gAId]").val();
		
		//构建对应实体类json
		var $obj = {};
		$obj.platformId = platformId;
		$obj.centerCompanyNo = centerCompanyNo;
		$obj.centerCompanyName = centerCompanyName;
		$obj.gAId = gAId;

		$.ajax({
			type:"POST",
			url:"http://127.0.0.1:8090/SERVICE/EMP/select",
			dataType:"JSON",
			contentType:"application/json",
			data:JSON.stringify($obj),
			success:function(data){
				if(data){
					alert(data);
//					sessionStorage.platformId = platformId;
//					sessionStorage.centerCompanyNo = centerCompanyNo;
//					sessionStorage.centerCompanyName = centerCompanyName;
//					sessionStorage.gAId = gAId;
//					window.open(encodeURI("resources/platForm/sendPlatForm.html")
//							,"_self","location=no");
				}
			},error:function(){
				alert("系统有误");
			}
		});
	});
}



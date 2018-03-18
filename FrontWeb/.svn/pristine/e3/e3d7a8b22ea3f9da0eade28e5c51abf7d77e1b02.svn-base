
var pageNo = 1;//页数 默认第一页开始
var pageCount = 10;//每页条数 
var totalCount;//总页数 
$(document).ready(function(){
	init();
	initTotalPageCount();//初始化当前列表页面 总页数
});

function init(){
	initData();//初始化数据
	initButton();//初始化按钮
}
function initData(){
	backList();//回显列表
}


function initButton(){
	$("#queryData").bind("click",queryData);//查询方法绑定
	$("#resetting").bind("click",resetting);//重置方法绑定
	$("#_pageFirst").bind("click",_pageFirst);//首页
	$("#_pageUp").bind("click",_pageUp);//上一页
	$("#_pageDown").bind("click",_pageDown);//下一页
	$("#_pageEnd").bind("click",_pageEnd);//末页
}

/*
 *页数操作 
 */
function _pageFirst(){
	if(pageNo==1){//已经是第一页
		$("#confirm-tips").text("已经是第一页！");
		openDialog();
		return false;
	}
	pageNo = 1;
	queryData();
}
function _pageUp(){
	
	if(pageNo==1){//已经是第一页
		$("#confirm-tips").text("已经是第一页！");
		openDialog();
		return false;
	}
	
	pageNo=pageNo-1;
	queryData();
}
function _pageDown(){
	if(pageNo==totalCount){//已经是最后一页
		$("#confirm-tips").text("已经是最后一页！");
		openDialog();
		return false;
	}
	
	pageNo = pageNo+1;
	
	queryData();
}
function _pageEnd(){
	if(pageNo==totalCount){//已经是最后一页
		$("#confirm-tips").text("已经是最后一页！");
		openDialog();
		return false;
	}
	pageNo = totalCount;
	queryData();
}

function openDialog(){
	$("#confirm-result").dialog({
		modal:true,
		draggable:false,
		show: {
	        effect: "blind",
	        duration: 1000
	      },
		hide: {
	        effect: "explode",
	        duration: 1000
	      },
		open:function(){
			$("#confirm-result").dialog("close");
		}
});
	 $('div .ui-dialog-titlebar-close').hide();  
}

function queryData(){
	var $obj = {};
	
	//查询项开始
	var platformId = $("input[name=platformId]").val();
	var centerCompanyName = $("input[name=centerCompanyName]").val();
	
	
	if(platformId!=""){
		$obj.platformId = platformId;
	}
	
	if(centerCompanyName!=""){
		$obj.centerCompanyName = centerCompanyName;
	}
	//查询项结束
	
	setCurrentPage();//页数设置
	
	backList($obj);
}

function resetting(){
	$("input.queryFeild").val("");
}

function backList($obj){
	if(!$obj){
		$obj = {};
	}
	
	//分页注入
	$obj.pageNo = pageNo;
	$obj.pageCount = pageCount;
	
	$.ajax({
		type:"post",
		url:"http://127.0.0.1:8090/SERVICE/EMP/select",
		dataType:"JSON",
		contentType:"application/json",
		data:JSON.stringify($obj),
		success:function(data){
			if(data){
				$("#firstChild").nextAll().remove();
				showData(data);
			}
		},error:function(){
			alert("系统有误");
		}
	});
}

/**
 * 设置当前页数
 */
function setCurrentPage(){
	//当前第几页
	$("#currentPage").text(pageNo);
	
}

/**
 * 初始化总页数
 */
function initTotalPageCount(){
	setCurrentPage();
	//共多少页
	$.ajax({
		type:"get",
		url:"http://127.0.0.1:8090/SERVICE/EMP/initTotalPageCount",//?pageCount="+pageCount
		dataType:"JSON",
		contentType:"application/x-www-form-urlencoded",
		data:{pageCount:pageCount},
		success:function(data){
			if(data){
				totalCount = data
				$("#totalPG").text(totalCount);
			}
		},error:function(){
			alert("系统有误");
		}
	});
}

function showData(data){
	var $tr = "";
	var color = "";
	$.each(data,function(i,v){
		if(i==0 || i%2==0){
			color = "rgba(24, 24, 29, 0.21)";
		}
			$tr += "<tr style='text-align: center;background-color: "+color+";'>";
			$tr+="<td>"+(i+1)+"</td>";
			var timestamp = v["handleTime"];
			$tr+="<td>"+v["handleTime"]+"</td>";
			$tr+="<td>"+v["platformId"]+"</td>";
			$tr+="<td>"+v["centerCompanyName"]+"</td>";
			$tr+="<td>"+v["gACompanyName"]+"</td>";
			$tr+="<td>"+v["gAConcaterName"]+"</td>";
			$tr+="<td>"+v["gAConcaterTel"]+"</td>";
			$tr+="<td>"+v["gAConcaterEmail"]+"</td>";
			$tr+="</tr>";
			color = "";
	});
	$("#html-table").append($tr);
}
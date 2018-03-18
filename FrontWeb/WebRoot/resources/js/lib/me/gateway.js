$(document).ready(function(){
	var str = getQueryString("txRequest");
	var $json = JSON.parse(str);
//	alert($json.);
});
function getQueryString(name) {
	 var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	 var r = window.location.search.substr(1).match(reg);
	 if (r != null) return unescape(r[2]);
	 return null;
}
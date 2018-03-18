package com.yonyou.scf.contract.filter;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.yonyou.scf.common.util.security.XSSConstantTool;


/**
 * 自定义拦截器
 */

public class SecurityFilter implements HandlerInterceptor {
	
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
    	
    	boolean processStatus = false;
    	
    	request.setCharacterEncoding("UTF-8");
    	
    	//content-type 验证合法性
    	XSSConstantTool xst = new XSSConstantTool(request);
    	String contentt = request.getContentType();
    	processStatus = xst.contentTypeFilter(contentt);
    	
    	//前端ajax跨域请求 处理
    	response.setContentType("application/json;charset=UTF-8");
    	response.setHeader("Access-Control-Allow-Origin", "*");  //字段是必须的。它的值要么是请求时Origin字段的值，要么是一个*，表示接受任意域名的请求
    	response.setHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");  //预检请求头信息
    	response.setHeader("Access-Control-Allow-Methods","PUT, POST, GET, OPTIONS, DELETE");  //允许什么样的请求 简单与非简单
    	response.setHeader("Access-Control-Allow-Credentials", "true"); //是否允许Cookie可以包含在请求中，一起发给服务器

    	
//    	System.out.println(">>>MyInterceptor>>>>>>>在请求处理之前进行调用（Controller方法调用之前）");
        return processStatus;// 只有返回true才会继续向下执行，返回false取消当前请求
    }

	@Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {

//        System.out.println(">>>MyInterceptor>>>>>>>请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

//        System.out.println(">>>MyInterceptor>>>>>>>在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）");
    }}
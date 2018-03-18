package com.yonyou.scf.contract.annotation;

import org.slf4j.Logger;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Optional;
import java.util.stream.Stream;

import javax.servlet.http.HttpServletResponse;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.ResourceUtils;

import lombok.Cleanup;

@Component
@Service
@Configuration
@Aspect
public class FileErrorImgService {
	
	private static final Logger logger = LoggerFactory.getLogger(FileErrorImgService.class);
	
	@AfterThrowing(pointcut="@annotation(com.yonyou.scf.contract.annotation.FileErrorImgAnno)", throwing="e")
	public void ErrorImgWhenThrows(JoinPoint joinPoint, Throwable e) {
		logger.info("拦截到‘浏览文件’时候抛出的异常，拦截后需要返回一个指定的错误图片");
		logger.info("拦截方法开始处理...");
		logger.info("拦截类及方法"+joinPoint.getTarget().getClass().getName()+"."+joinPoint.getSignature().getName()+"()");
		
		//获取到HttpServletResponse 对象
		Object[] objs = joinPoint.getArgs();
		
		logger.info("获取到拦截方法的参数长度为objs："+objs.length);
		
		Optional<HttpServletResponse> optional = Stream.of(objs).filter(x->{
			return x instanceof HttpServletResponse;
		}).map(x->(HttpServletResponse)x).findFirst();
		
		if(optional.isPresent()) {
			logger.info("截取到HttpServletRespons类型对象");
			
			HttpServletResponse httpServletResponse = optional.get();
			
			httpServletResponse.setHeader("Pragma", "No-cache");
			httpServletResponse.setHeader("Cache-Control", "no-cache");
			httpServletResponse.setDateHeader("Expires", 0);
			httpServletResponse.setContentType("image/png");
			
			logger.info("开始获取错误信息的图片");
			
			try {
				@Cleanup InputStream is =  new FileInputStream(new File("src/main/java/imgError.png"));
				
				OutputStream os = httpServletResponse.getOutputStream();
				
				FileCopyUtils.copy(is, os);
				os.flush();
				os.close();
				logger.info("成功返回---结束");
				return;
			} catch (FileNotFoundException e1) {
				logger.error("取不到错误信息的图片--结束");
			} catch (IOException e1) {
				logger.error("取不到错误信息的图片--结束");
				e1.printStackTrace();
			}
			
		}else {
			logger.info("没有截取到HttpServletRespons类型对象，直接通过");
		}
		
	}
}

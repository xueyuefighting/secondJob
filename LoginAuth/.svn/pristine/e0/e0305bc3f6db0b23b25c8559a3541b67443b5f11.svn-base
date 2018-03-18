package com.yonyou.scf.userFace.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MainIntercepter extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截  
    	//xss攻击防护
        registry.addInterceptor(new SecurityFilter()).addPathPatterns("/**");
        
//        registry.addInterceptor(new XSSFileter()).addPathPatterns("/*"); //

        super.addInterceptors(registry);

    }
}
package com.yonyou.scf.contract.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {
	@Bean
    public Docket buildDocket() {
    	List<ResponseMessage> errorMsgConfig = new ArrayList<ResponseMessage>();
    	errorMsgConfig.add(new ResponseMessageBuilder()
			.code(500)
			.message("服务器内部错误")
			.responseModel(new ModelRef("Error"))
			.build());
    	errorMsgConfig.add(new ResponseMessageBuilder()
			.code(403)
			.message("资源不可用")
			.build());    	
    	
        return new Docket(DocumentationType.SWAGGER_2)
        		.useDefaultResponseMessages(false)
				.globalResponseMessage(RequestMethod.GET,
						errorMsgConfig)
                .apiInfo(buildApiInf())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yonyou.scf.contract.controller"))//要扫描的API(Controller)基础包
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo buildApiInf() {
        return new ApiInfoBuilder()
                .title("API文档")
                .contact("供应链金融")
                .version("1.0")
				 .build();
    }
}

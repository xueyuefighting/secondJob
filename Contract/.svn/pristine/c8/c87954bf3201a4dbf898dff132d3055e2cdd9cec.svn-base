package com.yonyou.scf.contract.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.context.support.StandardServletEnvironment;

import com.yonyou.scf.common.system.ScfEnvironment;
import com.yonyou.scf.common.util.ShowPropFile;

/**
 * 
 * <pre>
 * Modify Information:
 * Author       Date        Description
 * ============ =========== ============================
 * shengsu      2017-03-16  Create this file
 * 
 * </pre>
 * 
 */
@Configuration
@Order(value = 9)
public class InitUrl {

	@Autowired
	private StandardServletEnvironment sse;

	@Bean
	public boolean Init() throws Exception {

		ScfEnvironment.init4ActiveFEP();

		ShowPropFile.showAll(sse);

		return true;
	}

}

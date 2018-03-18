package com.yonyou.scf.user.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.context.support.StandardServletEnvironment;

import com.yonyou.scf.common.constant.URLConst;
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

	@Value("${url.simulator}")
	private String url_simulator;
	@Value("${url.frontendprocess}")
	private String url_frontendprocess;
	@Value("${url.website}")
	private String url_website;
	@Value("${url.notice}")
	private String url_notice;
	@Value("${url.loginauth}")
	private String url_loginauth;
	@Value("${url.signature}")
	private String url_signature;
	@Value("${url.gateway}")
	private String url_gateway;
	@Value("${url.oauth}")
	private String url_oauth;
	@Value("${url.product}")
	private String url_product;
	@Value("${url.credit}")
	private String url_credit;
	@Value("${url.bill}")
	private String url_bill;
	@Value("${url.customer}")
	private String url_customer;
	@Value("${url.role}")
	private String url_role;
	@Value("${url.certification}")
	private String url_certification;
	@Value("${url.financing}")
	private String url_financing;
	@Value("${url.lending}")
	private String url_lending;
	@Value("${url.repayment}")
	private String url_repayment;
	@Value("${url.accounts}")
	private String url_accounts;
	@Value("${url.contract}")
	private String url_contract;
	@Value("${url.interests}")
	private String url_interests;
	@Value("${url.servicecharge}")
	private String url_servicecharge;
	@Value("${url.workflow}")
	private String url_workflow;
	@Value("${url.parameters}")
	private String url_parameters;
	@Value("${url.msgtemplate}")
	private String url_msgtemplate;
	@Value("${url.mail}")
	private String url_mail;
	@Value("${url.sms}")
	private String url_sms;
	@Value("${url.message}")
	private String url_message;
	@Value("${url.wechat}")
	private String url_wechat;
	@Value("${url.fadada}")
	private String url_fadada;
	@Value("${url.bank472}")
	private String url_bank472;

	@Bean
	public boolean Init() {

		URLConst.URL_SIMULATOR = url_simulator;
		URLConst.URL_FRONTENDPROCESS = url_frontendprocess;
		URLConst.URL_WEBSITE = url_website;
		URLConst.URL_NOTICE = url_notice;
		URLConst.URL_LOGINAUTH = url_loginauth;
		URLConst.URL_SIGNATURE = url_signature;
		URLConst.URL_GATEWAY = url_gateway;
		URLConst.URL_OAUTH = url_oauth;
		URLConst.URL_PRODUCT = url_product;
		URLConst.URL_CREDIT = url_credit;
		URLConst.URL_BILL = url_bill;
		URLConst.URL_CUSTOMER = url_customer;
		URLConst.URL_ROLE = url_role;
		URLConst.URL_CERTIFICATION = url_certification;
		URLConst.URL_FINANCING = url_financing;
		URLConst.URL_LENDING = url_lending;
		URLConst.URL_REPAYMENT = url_repayment;
		URLConst.URL_ACCOUNTS = url_accounts;
		URLConst.URL_CONTRACT = url_contract;
		URLConst.URL_INTERESTS = url_interests;
		URLConst.URL_SERVICECHARGE = url_servicecharge;
		URLConst.URL_WORKFLOW = url_workflow;
		URLConst.URL_PARAMETERS = url_parameters;
		URLConst.URL_MSGTEMPLATE = url_msgtemplate;
		URLConst.URL_MAIL = url_mail;
		URLConst.URL_SMS = url_sms;
		URLConst.URL_MESSAGE = url_message;
		URLConst.URL_WECHAT = url_wechat;
		URLConst.URL_FADADA = url_fadada;
		URLConst.URL_BANK472 = url_bank472;

		ShowPropFile.showAll(sse);

		return true;
	}

}

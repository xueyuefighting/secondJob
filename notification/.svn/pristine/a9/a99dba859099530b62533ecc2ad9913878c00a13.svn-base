package com.yonyou.config;


import org.apache.log4j.Logger;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * @author zhangjinliang
 * 2017年4月11日 下午8:11:47
 * 
 */
@Configuration
@PropertySource("classpath:application.properties")
public class PrimaryDataSourceConfiguration implements TransactionManagementConfigurer{
	
	private Logger logger = Logger.getLogger(PrimaryDataSourceConfiguration.class);
	
	/*
	 * 获取application.properties属性及值
	 */
    @Value("${spring.primary.datasource.url}")
    private String dbUrl;
    @Value("${spring.primary.datasource.username}")
    private String dbUser;
    @Value("${spring.primary.datasource.password}")
    private String dbPassword;
    @Value("${spring.primary.datasource.driverClassName}")
    private String driverClassName;
    @Value("${spring.primary.datasource.max-active}")
    private int max_active;
    @Value("${spring.primary.datasource.max-idle}")
    private int max_idle;
    @Value("${spring.primary.datasource.min-idle}")
    private int min_idle;
    @Value("${spring.primary.datasource.initial-size}")
    private int initial_size;
		
    @Bean(name="primaryDataSource")  //, destroyMethod = "close", initMethod="init"
    @Primary
    public DataSource dataSource() {
    	DataSource dataSource = new DataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUser);
        dataSource.setPassword(dbPassword);
        dataSource.setMaxActive(max_active);
        dataSource.setMaxIdle(max_active);
        dataSource.setMinIdle(min_idle);
        dataSource.setInitialSize(initial_size);
        logger.info("primaryDataSource创建成功");
        return dataSource;
    } 
    @Bean(name="primaryJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier(value="primaryDataSource")DataSource dataSource){
    	
    	JdbcTemplate primaryJT = new JdbcTemplate();
    	
    	primaryJT.setDataSource(dataSource);
    	
    	return primaryJT;
    }
    
	@Bean(name="primaryTransactionManager")
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		DataSourceTransactionManager dataSourceTransactionalManager = new DataSourceTransactionManager(dataSource());
		//只读事物
		dataSourceTransactionalManager.setEnforceReadOnly(true);
		return dataSourceTransactionalManager;
	}

}

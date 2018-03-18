package com.yonyou.config;

import org.apache.log4j.Logger;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@PropertySource("classpath:application.properties")
public class SecondaryDataSourceConfiguration {
	
   private Logger logger = Logger.getLogger(SecondaryDataSourceConfiguration.class);
	
    @Value("${spring.secondary.datasource.url}")
    private String dbUrl;
    @Value("${spring.secondary.datasource.username}")
    private String dbUser;
    @Value("${spring.secondary.datasource.password}")
    private String dbPassword;
    @Value("${spring.secondary.datasource.driverClassName}")
    private String driverClassName;
    @Value("${spring.secondary.datasource.max-active}")
    private int max_active;
    @Value("${spring.secondary.datasource.max-idle}")
    private int max_idle;
    @Value("${spring.secondary.datasource.min-idle}")
    private int min_idle;
    @Value("${spring.secondary.datasource.initial-size}")
    private int initial_size;
	
	
    @Bean(name="secondaryDataSource")  
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
        logger.info("secondaryDataSource创建成功");
        return dataSource;
    } 
    
/*    @Bean(name="secondarySqlSessionFactoryBean")
    public SqlSessionFactory sqlSessionFactoryBean(@Qualifier(value="secondaryDataSource")DataSource dataSource) {
    	SqlSessionFactory ssf = null;
    	SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    	bean.setDataSource(dataSource);
    	try {
    		ssf = bean.getObject();
    		logger.info("创建跑批发送消息的Sqlsession2成功....resourceClass is NotificationDataSourceConfiguration");
		} catch (Exception e) {
			logger.error("创建跑批发送消息的Sqlsession2失败....resourceClass is NotificationDataSourceConfiguration");
			e.printStackTrace();
		}
    	return ssf;
    }
    
    @Bean(name="secondarySqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("secondarySqlSessionFactoryBean") SqlSessionFactory sqlSessionFactory) {
    	SqlSessionTemplate st =  new SqlSessionTemplate(sqlSessionFactory);
    	logger.info("创建跑批发送消息的SqlSessionTemplate2成功....resourceClass is secondaryDataSourceConfiguration"+st);
        return st;
    }*/
    
    @Bean(name="secondaryJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier(value="secondaryDataSource")DataSource dataSource){
    	JdbcTemplate secondaryJT = new JdbcTemplate();	
    	secondaryJT.setDataSource(dataSource);	
    	return secondaryJT;
    }
    
	@Bean(name="secondaryTransactionManager")
	public PlatformTransactionManager annotationDrivenTransactionManager() {	
		DataSourceTransactionManager dataSourceTransactionalManager = new DataSourceTransactionManager(dataSource());
		//只读事物
		dataSourceTransactionalManager.setEnforceReadOnly(true);
		return dataSourceTransactionalManager;
	}


}

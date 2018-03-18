package com.yonyou.scf.gateway.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = PrimaryDataSourceConfig.INTERFACEPACKAGE, sqlSessionFactoryRef = "primarySqlSessionFactory")
public class PrimaryDataSourceConfig{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	static final String INTERFACEPACKAGE = "com.yonyou.scf.common.schema1.mapper";
	static final String XMLPACKAGE = "com.yonyou.scf.common.schema1.mapper.*.xml";
	
	/*
	 * 获取application.properties属性及值
	 */
    @Value("${user.primary.datasource.url}")
    private String dbUrl;
    @Value("${user.primary.datasource.username}")
    private String dbUser;
    @Value("${user.primary.datasource.password}")
    private String dbPassword;
    @Value("${user.primary.datasource.driverClassName}")
    private String driverClassName;
    @Value("${user.primary.datasource.max-active}")
    private int max_active;
    @Value("${user.primary.datasource.min-idle}")
    private int min_idle;
    @Value("${user.primary.datasource.initial-size}")
    private int initial_size;
    
    /**
     * 创建dataSource 返回bean  注入到spring容器中。
     * @return
     */
    @Bean(name = "primaryDataSource")
    @Primary
    public DruidDataSource primaryDataSource() {
    	
    	//使用的是tomcat内置数据源。如果要使用其他数据源，比如阿里等  要单独创建XXXDataSource()。
    	DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUser);
        dataSource.setPassword(dbPassword);
        dataSource.setMaxActive(max_active);
//        dataSource.setMaxIdle(max_active);
        dataSource.setMinIdle(min_idle);
        dataSource.setInitialSize(initial_size);
        logger.info("PrimaryDataSourceConfig.primaryDataSource.init()");
        logger.info("dbUrl:"+dbUrl);
        logger.info("dbUser:"+dbUser);
        logger.info("dbPassword:"+dbPassword);
        return dataSource;
    }
    
    /**
     * 创建事物
     * @param primaryTransactionManager
     * @return
     */
    @Bean(name = "primaryTransactionManager")
    @Primary
    //@Qualifier获取bean 使用范围可以为参数
    public DataSourceTransactionManager primaryTransactionManager(@Qualifier("primaryDataSource") DruidDataSource primaryDataSource) {
    	logger.info("PrimaryDataSourceConfig.primaryTransactionManager.init()");
    	return new DataSourceTransactionManager(primaryDataSource);
    }
    @Bean(name="primaryJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier(value="primaryDataSource")DruidDataSource dataSource){
    	
    	JdbcTemplate jdbcTemplate = new JdbcTemplate();
    	
    	jdbcTemplate.setDataSource(dataSource);
    	
    	return jdbcTemplate;
    }
    
    /**
     * 构建primarySqlSessionFactory
     * @param primaryDataSource
     * @return
     * @throws Exception
     */
    @Bean(name = "primarySqlSessionFactory")
    @Primary
    public SqlSessionFactory primarySqlSessionFactory(@Qualifier("primaryDataSource") DruidDataSource primaryDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        
//        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        /*
         *  扫描该包下的接口和mapper.xml
         */
//        configuration.addMappers(PrimaryDataSourceConfig.XMLPACKAGE);
//        sessionFactory.setConfiguration(configuration);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources("classpath:/"+XMLPACKAGE));
        sessionFactory.setDataSource(primaryDataSource);
        logger.info("PrimaryDataSourceConfig.primarySqlSessionFactory.init()");
        return sessionFactory.getObject();
    }

}

package com.yonyou.scf.gateway.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * 多数据源的另一种配置方式，暂时弃用
 * @author zhangjinliang
 * 2017年4月6日 下午5:34:36
 *
 */
//@SpringBootApplication//组合注解  自行百度 太复杂 记不住
//@EnableTransactionManagement// 开启注解事务管理，等同于xml配置文件中的 <tx:annotation-driven />
//basePackages：扫描mapper接口但是不会扫描mapper.xml；
//@MapperScan(basePackages = OtherDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "secSqlSessionFactory")
//这里没有用到EnvironmentAware 相关技术，EnvironmentAware是获取系统各种变量，包括环境变量比如jdk等，系统是pc还是widows还可以获取配置文件
public class OtherDataSourceConfig implements EnvironmentAware {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
		//制定扫描mapper接口包
		static final String PACKAGE = "com.yonyou.scf.secondMapper";
	 	//获取数据连接参数
		@Value("${spring.secondary.url}")
	    private String dbUrl;
	    @Value("${spring.secondary.username}")
	    private String dbUser;
	    @Value("${spring.secondary.password}")
	    private String dbPassword;
	    @Value("${spring.secondary.driverClassName}")
	    private String driverClassName;
	    @Value("${spring.secondary.max-active}")
	    private int max_active;
	    @Value("${spring.secondary.max-idle}")
	    private int max_idle;
	    @Value("${spring.secondary.min-idle}")
	    private int min_idle;
	    @Value("${spring.secondary.initial-size}")
	    private int initial_size;
	@Override
	public void setEnvironment(Environment environment) {
	}
	
	//构建数据源
	@Bean(name="secDataSource")
	public DataSource secDataSourceTest() {
		/*
		 *由于springboot默认用内置的tomcat  连接池也是tomcat的
		 *所以用 DataSource来构造数据源
		 *可以替换为其他数据源比如阿里的 c3p0的  etc.
		 */
		DataSource dataSource = new DataSource();
		dataSource.setUrl(dbUrl);
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUsername(dbUser);
		dataSource.setPassword(dbPassword);
		dataSource.setMaxActive(max_active);
        dataSource.setMaxIdle(max_active);
        dataSource.setMaxIdle(min_idle);
        dataSource.setInitialSize(initial_size);
        logger.info("OtherDataSourceConfig.secDataSourceTest.init()");
        logger.info("dbUrl:"+dbUrl);
        logger.info("dbUser:"+dbUser);
        logger.info("dbPassword:"+dbPassword);
		return dataSource;
	}
	//构建SqlSessionFactory
	@Bean(name = "secSqlSessionFactory")
	public SqlSessionFactory getSecSqlSessionFactory(@Qualifier("secDataSource") DataSource secondaryDataSource)
			throws Exception {//会抛出两个异常，需要处理的可以自行捕获 用到I/O了  肯定就是IOEXCEPTION 还有一个 自己尝试吧
			SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
			bean.setDataSource(secondaryDataSource);
//		//分页插件  
			//*****由于springboot 已经为我们准备好了非常方便的分页拦截装置，所以 这步弃用
//		PageHelper pageHelper = new PageHelper();
//		Properties properties = new Properties();
//		properties.setProperty("reasonable", "true");
//		properties.setProperty("supportMethodsArguments", "true");
//		properties.setProperty("returnPageInfo", "check");
//		properties.setProperty("params", "count=countSql");
//		pageHelper.setProperties(properties);
//		bean.setPlugins(new Interceptor[]{pageHelper});
			
		/*
		 * 	resourceResolver可以获取*.properties和其他配置文件的内容  来向SqlSessionFactoryBean注入
		 * 下面一步  就是 spring-mybatis.xml文件 所要做的所有操作configlocations   mapperLocations etc.
		 * 详细请看SqlSessionFactoryBean源码
		 */
		PathMatchingResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
		//加载扫描mapper.xml
		bean.setMapperLocations(resourceResolver.getResources("com/yonyou/scf/secondMapper/*.xml"));
		return bean.getObject();
	}
	/*
	 * 事物管理
	 */
	@Bean(name = "secTransactionManager")
    public DataSourceTransactionManager getTransactionManager(@Qualifier("secDataSource") DataSource secondaryDataSource) {
    	return new DataSourceTransactionManager(secondaryDataSource);
    }
}

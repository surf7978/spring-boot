package com.company.app.config;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import net.sf.log4jdbc.Log4jdbcProxyDataSource;
import net.sf.log4jdbc.SpyLogDelegator;
import net.sf.log4jdbc.tools.Log4JdbcCustomFormatter;
import net.sf.log4jdbc.tools.LoggingType;

@Configuration
@EnableTransactionManagement
public class DBConfiguration {
	  
	//데이터소스 등록
	@Bean(destroyMethod="close")
	public BasicDataSource dataSourceSpied() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("hr");
		dataSource.setPassword("hr");
		dataSource.setDefaultAutoCommit(false);
		return dataSource;
	}
	
	@Bean(name="dataSource")
	public Log4jdbcProxyDataSource dataSource() {
		Log4jdbcProxyDataSource ds = new Log4jdbcProxyDataSource(dataSourceSpied());
		Log4JdbcCustomFormatter fm = new Log4JdbcCustomFormatter();
		fm.setLoggingType(LoggingType.MULTI_LINE);
		fm.setSqlPrefix("SQL:::");
		//fm.setMargin(n);(5);
		ds.setLogFormatter(fm);
		return ds ;
	}

	// 트랜잭션 매니저 등록	 
    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
}

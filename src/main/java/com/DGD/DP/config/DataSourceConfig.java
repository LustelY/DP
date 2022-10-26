package com.DGD.DP.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import com.DGD.DP.portfolio.dao.PortfolioDao;
import com.DGD.DP.portfolio.service.PortfolioServiceImpl;

@Configuration
public class DataSourceConfig {

	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		DataSource ds = new DataSource() ;
		ds.setDriverClassName("com.mysql.lcj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/dp?serverTimezonAsia/Seoul&zeroDateTimeBehavior=convertToNull");
		ds.setUsername("dp");
		ds.setPassword("dp");
		ds.setInitialSize(2);
		ds.setMaxActive(10);
		ds.setMaxIdle(10);
		return ds;			
		}
	
	@Bean
	public PlatformTransactionManager transactionManager() {
		DataSourceTransactionManager txManager = new DataSourceTransactionManager();
		txManager.setDataSource(dataSource());
		return txManager;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
	// 포트폴리오
	@Bean
	public PortfolioDao portfolioDao() {
		return new PortfolioDao(dataSource());
	}
	@Bean
	public PortfolioServiceImpl portfolioService() {
		return new PortfolioServiceImpl(portfolioDao());
	}
}

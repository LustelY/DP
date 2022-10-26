package com.DGD.DP.portfolio.dao;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.DGD.DP.portfolio.domain.Portfolio;

public class PortfolioDao {
	private JdbcTemplate jdbcTemplate;
	
	public PortfolioDao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public PortfolioDao() {
		super();
	}
	
	// 포트폴리오 등록
	public void addPortfolio(Portfolio portfolio) {
		String sql = "INSERT INTO Portfolio(userId, projectName, projectType, "
				+ "teamName, member, period, serviceUrl, project_func, "
				+ "project_skill, my_func, my_skill, image, description) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, portfolio.getUserId(), portfolio.getProjectName(),
				portfolio.getProjectType(), portfolio.getTeamName(), portfolio.getMember(),
				portfolio.getPeriod(), portfolio.getServiceUrl(), portfolio.getProject_func(),
				portfolio.getProject_skill(), portfolio.getMy_func(), portfolio.getMy_skill(),
				portfolio.getImage(), portfolio.getDescription()); 
	}
	
	// 포트폴리오 수정
//	public void updatePortfolio(Portfolio portfolio) {
//		String sql = "UPDATE Board SET projectName=?, projectType=?, teamName=?, member=?, period=?, "
//				+ "serviceUrl=?, project_func=?, project_skill=?, my_func=?, my_skill=?, image=?, "
//				+ "description=?, updateDate=now() where portfolio_idx=?";
//		jdbcTemplate.update(sql, portfolio.getProjectName(), portfolio.getProjectType(),
//				portfolio.getTeamName(), portfolio.getMember(), portfolio.getPeriod(),
//				portfolio.get
//				
//				)
//		
//	}

}

package com.DGD.DP.portfolio.service;

import com.DGD.DP.portfolio.dao.PortfolioDao;
import com.DGD.DP.portfolio.domain.Portfolio;

public class PortfolioServiceImpl implements PortfolioService {
	private PortfolioDao portfolioDao = null;
	
	public PortfolioServiceImpl() {
		super();
	}
	
	public PortfolioServiceImpl(PortfolioDao portfolioDao) {
		this.portfolioDao = portfolioDao;
	}

	// 포트폴리오 등록
	@Override
	public void addPortfolio(Portfolio portfolio) {
		portfolioDao.addPortfolio(portfolio);
	}

	// 포트폴리오 수정
//	@Override
//	public void updatePortfolio(Portfolio portfolio) {
//	}

	// 포트폴리오 삭제
//	@Override
//	public void deletePortfolio(int portfolio_idx) {
//	}
	

}

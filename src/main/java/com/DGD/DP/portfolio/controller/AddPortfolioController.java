package com.DGD.DP.portfolio.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.DGD.DP.config.DataSourceConfig;
import com.DGD.DP.portfolio.domain.Portfolio;
import com.DGD.DP.portfolio.service.PortfolioServiceImpl;

@Controller
@RequestMapping("main/addPortfolio")
public class AddPortfolioController {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataSourceConfig.class);
	PortfolioServiceImpl portfolioService = context.getBean("portfolioService", PortfolioServiceImpl.class);

	@GetMapping
	public String addPortfolioForm(Model model) {
		model.addAttribute("portfolio", new Portfolio());
		return "/main";
	}
//	@GetMapping
//	public String addPortfolio(Model model) {
//		System.out.println("1");
//		model.addAttribute("portfolio", new Portfolio());
//		System.out.println("2");
//		return "main";
//	}
	
	@PostMapping
	public String addPortfolio(@ModelAttribute("AddPortfolio")
	Portfolio portfolio, Model model) {
		System.out.println("등록");
		portfolioService.addPortfolio(portfolio);
//		model.addAttribute("portfolioList", portfolioService.portfolioList());
		context.close();
		return "redirect:/main";
		
	}
}

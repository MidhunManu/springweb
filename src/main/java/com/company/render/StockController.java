package com.company.render;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StockController {
	@GetMapping("/stock")	
	public String showStocks(Model model) {
		model.addAttribute("stock", new Stock());
		return "stock";
	}

	@PostMapping("buyStock")
	public String buyStocks(@ModelAttribute Stock stock, Model model) {
		model.addAttribute("stock", stock);
		System.out.println(stock.getStockName());
		System.out.println(stock.getStockPrice());
		return "stock";
	}
}

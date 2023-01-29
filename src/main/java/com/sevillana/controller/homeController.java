package com.sevillana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sevillana.service.ProductService;

@Controller
public class homeController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/login")
	public String register() {
		return "/login";
	}
	
	@GetMapping("/")
	public String index(Model model, @AuthenticationPrincipal User user) {
		Long countInteger = productService.count();
		model.addAttribute("countProduct", countInteger);
		System.out.println("user loged: "+user.toString());
		model.addAttribute("userName",user.getUsername());
		return "index";
	}
	
	

}

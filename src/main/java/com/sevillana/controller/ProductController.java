package com.sevillana.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sevillana.domain.Product;
import com.sevillana.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping(value = "/product")
	public String product(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("products", productService.findAll());
		model.addAttribute("countProducts", productService.count());
		model.addAttribute("totalValue", productService.totalValue());
		return "Product/product";
	}

	@PostMapping("/product/save")
	public String save(@Valid Product product, Errors errors) {
		product.setDate(new Date());
		System.out.println(product.toString());
		if (errors.hasErrors()) {
			return "redirect:/product";
		}
		productService.save(product);
		return "redirect:/product";
	}

	
	
	@GetMapping("/product/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("product", productService.findOne(id));
		return "Product/productUpdate";
	}
	
	@PostMapping("/product/edit")
	public String edit(@Valid Product product, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "redirect:/product/"+product.getId();
		}
		productService.save(product);
		return "redirect:/product";
	}

	@GetMapping("/product/{id}/delete")
	public String delete(@PathVariable Integer id) {
		productService.delete(id);
		return "redirect:/product";
	}
}
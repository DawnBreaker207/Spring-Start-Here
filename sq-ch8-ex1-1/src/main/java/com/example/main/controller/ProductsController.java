package com.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.main.model.Product;
import com.example.main.service.ProductService;

@Controller
public class ProductsController {
    private final ProductService productService;

    public ProductsController(ProductService productService) {
	this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
	var products = productService.findAll();
	model.addAttribute("products", products);

	return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(Product p, Model model) {
	productService.addProduct(p);

	var products = productService.findAll();
	model.addAttribute("products", products);

	return "products.html";
    }

}

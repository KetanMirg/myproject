package com.ketan.prac.resources;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MyController {
	
	@RequestMapping("/login")
	public String getMessage(ModelMap model){
		model.addAttribute("hello", "hello there!");
		System.out.println("Inside the getMEssage Method!");
		return "home";
	}
	
	@RequestMapping("/products")
	public String getProducts(ModelMap model,Principal p){
		String name  = p.getName();
		List<String> prodList = new ArrayList<String>();
		model.addAttribute("username", name);
		return "products";
	}
	
	
	@RequestMapping("/loginpage")
	public String getProductsCustomForm(ModelMap model,Principal p){

		List<String> prodList = new ArrayList<String>();
		
		return "loginpage";
	}
}

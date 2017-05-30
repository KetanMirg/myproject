package com.ketan.prac.resources;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelMap getMessage(ModelMap model,@RequestParam("user") String user, @RequestParam("pswd") String pswd){
		model.addAttribute("hello", "hello there!");
		System.out.println("Inside the getMEssage Method!");
		ModelMap mp = new ModelMap("home");
		mp.addAttribute("username", "ketan");
		model.addAttribute("username", user);
		model.addAttribute("password",pswd);
		model.addAttribute("dept","Comp.");
		
		return mp;
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

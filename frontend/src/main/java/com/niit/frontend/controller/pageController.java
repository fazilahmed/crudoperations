package com.niit.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
	@RequestMapping("/")
	public String gotoIndex()
	{
		return "index";
	}
	
	@RequestMapping("/contactus")
	public String gotoContactus()
	{
		return "contactus";
	}
	
	@RequestMapping("/aboutus")
	public String gotoAboutus()
	{
		return "Aboutus";
	}
	
	
	@RequestMapping("/success")
	public String gotosuccess()
	{
		return "success";
	}
}
package com.niit.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.dao.ProductDao;
import com.niit.backend.model.product;

@Controller
public class ProductController {

	@Autowired
	ProductDao productDao;

	@RequestMapping("/product")
	public ModelAndView productReg() {
		ModelAndView modelAndView = new ModelAndView("product");
		modelAndView.addObject("productModelAgent", new product());
		return modelAndView;

	}

	@RequestMapping("/addproduct")
	public String gotoproduct(@ModelAttribute("productModelAgent") product prod) {

		if (productDao.insertproduct(prod)) {
			return "index";
		} else {
			return "redirect:/product";
		}

	}
}

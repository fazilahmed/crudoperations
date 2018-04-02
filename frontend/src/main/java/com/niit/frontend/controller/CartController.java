package com.niit.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.dao.CartDao;
import com.niit.backend.model.cart;

@Controller
public class CartController {

	@Autowired
	CartDao cartDao;

	@RequestMapping("/cart")
	public ModelAndView cartReg() {
		ModelAndView modelAndView = new ModelAndView("cart");
		modelAndView.addObject("cartModelAgent", new cart());
		return modelAndView;

	}

	@RequestMapping("/addcart")
	public String gotocart(@ModelAttribute("cartModelAgent") cart car) {

		if (cartDao.insertcart(car)) {

			return "index";
		} else {
			return "redirect:/cart";
		}
	}
}

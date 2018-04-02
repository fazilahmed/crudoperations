package com.niit.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.dao.CategoryDao;
import com.niit.backend.model.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryDao categoryDao;

	@RequestMapping("/cat")
	public ModelAndView catReg() {
		ModelAndView modelAndView = new ModelAndView("category");
		modelAndView.addObject("categoryModelAgent", new Category());
		return modelAndView;

	}

	@RequestMapping("/addcat")
	public String gotoregister(@ModelAttribute("categoryModelAgent") Category cat) {
		if (categoryDao.catDao(cat)) {
			return "index";

		} else {
			return "redirect:/cat";
		}
	}
}

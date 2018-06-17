package com.niit.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		modelAndView.addObject("allcategories",categoryDao.listofcategories());
		return modelAndView;

	}

	@RequestMapping("/addcat")
	public String gotoregister(@ModelAttribute("categoryModelAgent") Category cat) {
		if (categoryDao.catDao(cat)) {
			return "redirect:/cat";

		} else {
			return "redirect:/cat";
		}
	}
	
	@RequestMapping("/deletecategory/{categoryid}")
	public String deletecategory(@PathVariable("categoryid") String categoryid) {

		Category category = categoryDao.singleCategory(categoryid);
		if (categoryDao.deleteCategory(category)) {
			return "redirect:/cat";
		} else

		{
			System.out.println("hii");
			return "redirect:/cat";
		}
	}
	
	@RequestMapping("/singleCategory")
	public ModelAndView singleCategory(@RequestParam("categoryid") String catid) {
		
		ModelAndView modelAndView = new ModelAndView("category");
		modelAndView.addObject("categoryModelAgent", categoryDao.singleCategory(catid));
		modelAndView.addObject("allcategories", categoryDao.listofcategories());
		return modelAndView;
	}
}

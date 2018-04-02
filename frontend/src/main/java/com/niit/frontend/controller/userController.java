package com.niit.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.dao.UserDao;
import com.niit.backend.model.userModel;

@Controller
public class userController {
	@Autowired
	UserDao userDAO;

	@RequestMapping("/reg")
	public ModelAndView gotologin() {
		ModelAndView modelAndView = new ModelAndView("register");
		modelAndView.addObject("userModelAgent", new userModel());
		modelAndView.addObject("allusers", userDAO.listofusers());
		return modelAndView;

	}

	@RequestMapping("/signup")
	public String gotoregister(@ModelAttribute("userModelAgent") userModel obj) {
		if (userDAO.insertUser(obj)) {
			return "redirect:/reg";

		} else {
			return "redirect:/reg";
		}
	}
}
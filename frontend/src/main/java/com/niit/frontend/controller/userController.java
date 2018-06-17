package com.niit.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@RequestMapping("/deleteuser/{emailid}")
	public String deleteUser(@PathVariable("emailid") String userName) {

		userModel user = userDAO.singleUser(userName);
		if (userDAO.deleteUser(user)) {
			return "redirect:/reg";
		} else

		{
			return "redirect:/reg";
		}
	}
	
	
	@RequestMapping("/singlereg")
	public ModelAndView singleUser(@RequestParam("userid") String uname) {
		ModelAndView modelAndView = new ModelAndView("register");
		modelAndView.addObject("userModelAgent", userDAO.singleUser(uname));
		modelAndView.addObject("allusers", userDAO.listofusers());
		return modelAndView;

	}
}

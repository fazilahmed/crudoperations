package com.niit.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.backend.dao.SupplierDao;
import com.niit.backend.model.supplier;

@Controller
public class SupplierController {

	@Autowired
	SupplierDao supplierDao;

	@RequestMapping("/supplier")
	public ModelAndView supplierReg() {
		ModelAndView modelAndView = new ModelAndView("supplier");
		modelAndView.addObject("supplierModelAgent", new supplier());
		return modelAndView;

	}

		@RequestMapping("/addsupplier")
	public String gotosupplier(@ModelAttribute("supplierModelAgent") supplier sup) {

		if (supplierDao.supDao(sup)) {
			return "index";
		} else {
			return "redirect:/supplier";
		}
	}
}

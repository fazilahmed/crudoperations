package com.niit.frontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		modelAndView.addObject("allproducts", productDao.listofproducts());
		modelAndView.addObject("process",false);
		return modelAndView;

	}

	@RequestMapping("/addproduct")
	public String gotoproduct(@ModelAttribute("productModelAgent") product prod) {

		if (productDao.insertproduct(prod)) {
			return "redirect:/product";
		} else {
			return "redirect:/product";
		}

	}
	
	@RequestMapping("/deleteproduct/{productid}")
	public String deleteProduct(@PathVariable("productid") int prodid)
	{
		product prod=productDao.singleProduct(prodid);
		if(productDao.deleteProduct(prod))
		{
			return "redirect:/product";
		}
		else
		{
			return "redirect:/product";
		}
	}
		
	@RequestMapping("/singleProd")
		public ModelAndView singleProduct(@RequestParam("productid") int prodid) {
		ModelAndView modelAndView = new ModelAndView("product");
		modelAndView.addObject("productModelAgent", productDao.singleProduct(prodid));
		modelAndView.addObject("allproducts", productDao.listofproducts());
		modelAndView.addObject("process",true);
		return modelAndView;

	}
	
	@RequestMapping("/productdisp")
	  public ModelAndView dispProduct() {
		ModelAndView modelAndView = new ModelAndView("productdisplay");
		modelAndView.addObject("productModelAgent", new product());
		modelAndView.addObject("allproducts", productDao.listofproducts());
		return modelAndView;
	}
	
	/*@RequestMapping("/layout/{productid}")
		public ModelAndView productdisplay(@PathVariable("productid") int prodid) {
		product prod=productDao.singleProduct(prodid);
		return null;
	}*/
	@RequestMapping("/singleProduct")
	public ModelAndView singleProd(@RequestParam("productid") int prodid) {
	ModelAndView modelAndView = new ModelAndView("singleprodlayout");
	modelAndView.addObject("productModelAgent", productDao.singleProduct(prodid));
	return modelAndView;

}
}

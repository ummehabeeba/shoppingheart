package com.shoppingheart.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shoppingheart.dao.ProductDao;
import com.shoppingheart.dao.ProductDaoImpl;
import com.shoppingheart.dto.ProductDetails;



@Controller
public class ShoppingHeartController {
	ProductDao dao =  new ProductDaoImpl();
	
	@RequestMapping(path = "add", method = RequestMethod.GET)
	public String addProductForm() {
		
		return "AddProductForm";
	}
	
	@RequestMapping(path = "add", method = RequestMethod.POST)
	public String addProduct(ProductDetails details, ModelMap map) {
		
		boolean isAdded = dao.add(details);
		
		if (isAdded) {
			map.addAttribute("msg", "Successfully Added...");
			
		} else {
			map.addAttribute("msg", "Not Added!!!");
		}
		return "addProduct";
			
		}
	


		@RequestMapping(path = "Search123", method = RequestMethod.GET)
		public String search() {
			
			return "Search";
		}
		@RequestMapping(path = "Search", method = RequestMethod.POST)
		public String search(String name, ModelMap map) {
			 List<ProductDetails> pro=dao.search(name);
			 map.addAttribute("name", pro);
			return "Search12";
			
		}
		
}
		



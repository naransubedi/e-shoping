package com.naran.onlineshoping;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.naran.onlineshoping.domain.Category;
import com.naran.onlineshoping.service.CategoryService;
import com.naran.onlineshoping.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	CategoryService categoryService;

	@Autowired
	ProductService productService;

	@RequestMapping(value = { "/", "/home", "index" }, method = RequestMethod.GET)
	public String home(Model model) {

		String title = "Home";

		model.addAttribute("categories", categoryService.findAll());

		model.addAttribute("title", title);

		model.addAttribute("userClickHome", true);

		return "home";
	}

	@RequestMapping(value = { "/about" }, method = RequestMethod.GET)
	public String about(Model model) {

		String title = "About";

		model.addAttribute("title", title);

		model.addAttribute("userClickAbout", true);

		return "home";
	}

	@RequestMapping(value = { "/contact" }, method = RequestMethod.GET)
	public String contact(Model model) {

		String title = "Contact";

		model.addAttribute("title", title);

		model.addAttribute("userClickContact", true);

		return "home";
	}

	@RequestMapping(value = { "/allProducts" }, method = RequestMethod.GET)
	public String products(Model model) {

		String title = "AllProducts";

		model.addAttribute("title", title);

		model.addAttribute("userClickAllProducts", true);

		model.addAttribute("categories", categoryService.findAll());

		model.addAttribute("products", productService.findAll());

		return "home";
	}

	@RequestMapping(value = { "/category/{id}/products" }, method = RequestMethod.GET)
	public String showProductsByCategory(Model model, @PathVariable("id") int id) {

		model.addAttribute("title", categoryService.getCategoryById(id).getName());

		model.addAttribute("userClickCategoryProducts", true);

		model.addAttribute("categories", categoryService.findAll());

		model.addAttribute("products", productService.findProductsByCategory(categoryService.getCategoryById(id)));

		return "home";
	}

	@RequestMapping(value = { "/product/viewProduct/{id}" }, method = RequestMethod.GET)
	public String showProduct(Model model, @PathVariable("id") int id) {

		model.addAttribute("title", productService.getProductById(id).getName());

		model.addAttribute("userClickProductShow", true);

		model.addAttribute("product", productService.getProductById(id));

		return "home";
	}
}

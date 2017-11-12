package com.naran.onlineshoping.errorHandler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTTPErrorHandler {

	String path = "/error";

	@RequestMapping(value = "/400")
	public String error400(Model model) {
		model.addAttribute("title", "error 400");
		
		model.addAttribute("desc", "This is 400 error");

		model.addAttribute("userClickErrorPage", true);
		return "/error/httperror";
	}

	@RequestMapping(value = "/404")
	public String error404(Model model) {
		model.addAttribute("title", "error 404");
		
		model.addAttribute("desc", "This is 404 error");

		model.addAttribute("userClickErrorPage", true);
		return "/error/httperror";
	}

	@RequestMapping(value = "/500")
	public String error500(Model model) {
		model.addAttribute("title", "error 500");
		
		model.addAttribute("desc", "This is 500 error");

		model.addAttribute("userClickErrorPage", true);
		return "/error/httperror";
	}

}

package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HomeController {
	
	@RequestMapping("/greet")
	public String sayHello(Model model)
	{
		String greetings = "Welcome to The Spring MVC Dynamic Web APP!!!";
		model.addAttribute("mygreetings", greetings);
		return "home";
	}

}

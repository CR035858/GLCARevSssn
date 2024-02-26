package com.gl.ccms.labwk16d03dem1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HomeController {
	
	@RequestMapping(value="/sayHello",method=RequestMethod.GET)
	public String greetHello()
	{
		return "Hello!!! Welcome to SpringBoot Based RestFul Services....";
	}

}

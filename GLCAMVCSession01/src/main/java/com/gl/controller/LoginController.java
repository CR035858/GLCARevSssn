package com.gl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.model.Login;
import com.gl.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping("/loginPage")
	public String showLoginPage(Model model)
	{
		Login login = new Login();
		model.addAttribute("login", login);
		return "loginPage";
	}
	
	
	
	
	@RequestMapping("/validateLogin")
	public String validateUser(@ModelAttribute("login") Login login)
	{
		if(loginService.validateLoginSvc(login))
		{
			return "success";
		}
		else
		{
			return "failure";
		}
	}
}

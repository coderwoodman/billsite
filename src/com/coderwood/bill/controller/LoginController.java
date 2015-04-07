package com.coderwood.bill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView login() {		
		ModelAndView modelAndView = new ModelAndView("billitem/list");
		modelAndView.addObject("loginname", "pxt");
		return modelAndView;
	}
}

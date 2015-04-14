package com.coderwood.bill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("loginName") String loginName) {
		ModelAndView modelAndView;
		if (loginName.equals("pxt")) {
			modelAndView = new ModelAndView("redirect:/billitem/list");
		} else {
			modelAndView = new ModelAndView("redirect:/");
		}

		return modelAndView;
	}

}

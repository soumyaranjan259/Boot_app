package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Restcontroller
//Writing examples
public class ShowHomeController{

	/*@RequestMapping("/home")
	public String renderHome() {
		return"welcome";
	}*/
	@RequestMapping("/")
	public String renderHome() {
		return "welcome";
	}
}

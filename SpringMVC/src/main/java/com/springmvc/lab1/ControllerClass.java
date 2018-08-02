package com.springmvc.lab1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
	@RequestMapping("/welcome")
	public String showLoginForm() {
		return "login";
	}
	

}

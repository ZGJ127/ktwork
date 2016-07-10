package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomePage {

	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		return "/login/login";
	}

}

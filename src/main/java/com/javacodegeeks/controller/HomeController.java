package com.javacodegeeks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class HomeController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "Maven Test";
	}
}

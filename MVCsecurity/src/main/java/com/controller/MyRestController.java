package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyRestController {
	
	@RequestMapping("/greet/{name}")
	@ResponseBody
	public String greet(@PathVariable ("name") String name)
	{
		return "good morning "+name;
	}
}

package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	@GetMapping("/helloWorld")
	public String helloWorld()
	{
		return "helloworld";
	}
	@ResponseBody
	@GetMapping("/bye")
	public String bye()
	{
		return "goodbye";
	}
	@ResponseBody
	@GetMapping("/good")
	public String treat()
	{
		return "Good morning";
	}
}

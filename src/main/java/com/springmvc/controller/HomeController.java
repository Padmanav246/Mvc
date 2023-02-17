package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/first")
public class HomeController {	
	@RequestMapping(path ="/home" ,method=RequestMethod.POST)
	public String home(Model model)
	{
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(40);
		marks.add(79);
		marks.add(80);
		model.addAttribute("marks", marks);
		model.addAttribute("name","This Is Padmanav");
		System.out.println("This is home url");
		
		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This Is About Page");
		return "about";
	}
	
}

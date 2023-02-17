package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springmvc.model.User;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void commonAttribute(Model m)
	{
		m.addAttribute("welcome","Welcome to the page");
		m.addAttribute("thankyou","Thank You For Visiting");
	}
	@RequestMapping("/contact")
	public String showForm() {
		return "form";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam("name") String username, @RequestParam("email") String useremail,
//			@RequestParam("password") String password, @RequestParam("conpassword") String conpassword, Model model) {
//		User user=new User();
//		user.setName(username);
//		user.setEmail(useremail);
//		user.setPassword(password);
//		user.setConpassword(conpassword);
//		model.addAttribute("user",user);
	public String handleForm(@ModelAttribute User user)
	{
		if(user.getName().isBlank()||user.getEmail().isBlank()||user.getPassword().isBlank()||user.getConpassword().isBlank())
		{
			return "redirect:/contact";
		}
		else
			return "sucess";
		
	}
}

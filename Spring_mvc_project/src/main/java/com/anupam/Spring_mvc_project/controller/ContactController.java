package com.anupam.Spring_mvc_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anupam.Spring_mvc_project.model.User;
import com.anupam.Spring_mvc_project.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/contact")
	public String showForm(Model m) {
		return "contact";
	}
	
	@RequestMapping(value="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);	
//		model.addAttribute("user" , user);
		this.userService.createUser(user);
		return "success";
	}

}

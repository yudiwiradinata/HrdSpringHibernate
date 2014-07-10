package com.yudi.project.hrd.controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/welcome")
public class HelloController {

	
	@RequestMapping(method=RequestMethod.GET)
	public String printWelcome(ModelMap model){
	
		model.addAttribute("message", "Spring 4 hello World");
		
		return "hello";
		
	}
}

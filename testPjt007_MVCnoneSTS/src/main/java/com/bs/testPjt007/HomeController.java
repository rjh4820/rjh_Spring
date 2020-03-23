package com.bs.testPjt007;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("--- home() Method ----");
		
		model.addAttribute("key", "home");
		
		return "home";
	}

	@RequestMapping("/login")
	public String login(Model model) {
		System.out.println("--- login() Method ----");
		
		model.addAttribute("key", "login");
		
		return "login";
	}
}

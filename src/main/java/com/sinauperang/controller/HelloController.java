package com.sinauperang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String welcome(Model model){
		model.addAttribute("greeting","Welcome to Perang");
		model.addAttribute("tagline", "ini adalah web perancangan pembelanjaan daerah");
		return "welcome";
		
	}

}

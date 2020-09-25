package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DashboardController 
{
	@GetMapping("/dashboard")
	public String dashboard(@RequestParam(name="name", required=false, defaultValue="No Connected") String name, Model model) 
	{
		model.addAttribute("name",name);
		
		return "dashboard";
	}

}

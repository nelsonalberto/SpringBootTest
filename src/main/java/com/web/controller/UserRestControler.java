package com.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.models.User;

@RestController
public class UserRestControler 
{
	@GetMapping("/getUserInfo")
	public User getUserInfo()
	{
		return new User("John","Doe");
	}
}

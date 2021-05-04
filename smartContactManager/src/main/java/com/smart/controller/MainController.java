package com.smart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.dao.UserRepository;
import com.smart.entities.contact;
import com.smart.entities.user;

@Controller
public class MainController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/test")
	@ResponseBody
	public String test()
	{
		//User class
		user u1=new user();
		u1.setName("Shruti Amrutkar");
		u1.setEmail("shrutiamrutkar177@gmail.com");
		
		//Contact class
		contact c1=new contact();
		u1.getContact().add(c1);
		
		userRepository.save(u1);
		
		return "Working";
	}

}

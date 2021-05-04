package com.smart.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smart.dao.UserRepository;
import com.smart.entities.user;
import com.smart.helper.Message;

@Controller
public class HomeController {
	
	@Autowired
	private BCryptPasswordEncoder PasswordEncoder;
	
	@Autowired
	private UserRepository userRepository;

	// Home handler
	@RequestMapping("/")
	public String home(Model m) {

		m.addAttribute("title", "Home-Smart Contact Manager");
		
		return "home";
	}

	// about handler
	@RequestMapping("/about")
	public String about(Model m) {

		m.addAttribute("title", "About-Smart Contact Manager");
		return "about";
	}

	// signup handler
	@RequestMapping("/signup")
	public String signup(Model m) {

		m.addAttribute("title", "Regitration-Smart Contact Manager");
		m.addAttribute("user", new user());
		return "signup";
	}

	// handler for register user
	@RequestMapping(value = "/do_register", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") user user,BindingResult r,
			@RequestParam(value = "agreement", defaultValue = "false") boolean agreement, Model m,HttpSession session) {
		
		try {
		if (!agreement) {
			System.out.println("You have not agreed terms and conditions");
		    throw new Exception("You have not agreed terms and conditions !!");
		}
		
		if(r.hasErrors())
		{
			System.out.println("Error"+r.toString());
			m.addAttribute("user",user);
			return "signup";
		}
       
		user.setRole("ROLE_USER");
		user.setEnabled(true);
		user.setImageUrl("default.jpg");
		user.setPassword(PasswordEncoder.encode(user.getPassword()));
		
		System.out.println("Agreement=" + agreement);
		System.out.println(user);
		
		//save data into database
		user result=this.userRepository.save(user);
		m.addAttribute("user",new user());
		
		session.setAttribute("message", new Message("Successfully Registered!!", "alert-success"));
		return "signup";
		//m.addAttribute("user",user);
		
			
		}catch (Exception e) {
			
			e.printStackTrace();
			m.addAttribute("user",user);
			session.setAttribute("message", new Message("Something went wrong!!"+e.getMessage(), "alert-danger"));
		}
		
		
		
		return "signup";
	}

}

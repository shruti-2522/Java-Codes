package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.userservice.UserService;


@Controller
public class ContactController {
	
	@Autowired
	private UserService UserService;

	@ModelAttribute
	public void commonDataModel(Model m) {
		m.addAttribute("Header", "Registration Form");
		m.addAttribute("desc", "Registration form for user");
		System.out.println("Adding Data to commom Model");
	}

	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("Creating form");
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handlerForm(@ModelAttribute("user") User user, Model model) {

		System.out.println(user);
		this.UserService.createUser(user);
		

		return "success";
	}
}

/*
 * 
 * public String handlerForm(@RequestParam("txtemail") String
 * email, @RequestParam("txtname") String name,
 * 
 * @RequestParam("txtpass") String pass, Model model) {
 * 
 * User user = new User(); user.setEmail(email); user.setName(name);
 * user.setPass(pass);
 * 
 * model.addAttribute(user);
 * 
 * System.out.println(user);
 * 
 * // proces /* model.addAttribute("name", name); model.addAttribute("email",
 * email); model.addAttribute("pass", pass);
 */

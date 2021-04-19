package springmvc.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)

	// This is old technique of jsp
	/*
	 * public String handlerForm(HttpServletRequest request) { String email =
	 * request.getParameter("txtemail"); System.out.println("My email is:" + email);
	 * return ""; }
	 */

	public String handlerForm(@RequestParam("txtemail") String email, @RequestParam("txtname") String name,
			@RequestParam("txtpass") String pass, Model model) {

		System.out.println("Name:" + name);
		System.out.println("Email:" + email);
		System.out.println("Password:" + pass);

		// proces
		model.addAttribute("name", name);
		model.addAttribute("email", email);
		model.addAttribute("pass", pass);
		return "success";
	}
}
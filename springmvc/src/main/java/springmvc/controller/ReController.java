package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	//Redirect View
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is first Handler(one)");
		RedirectView redir=new RedirectView();
		redir.setUrl("enjoy");
	     return redir;
	}

	/*
	 * @RequestMapping("/one") public String one() {
	 * System.out.println("This is first Handler(one)"); return
	 * "redirect:/enjoy";//Redirect prefix }
	 */

	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("This is Second Hnadler(enjoy)");
		return "contact";
	}

}

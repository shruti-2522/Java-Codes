package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
public class HomeController {
	
	 @RequestMapping(value = "/home", method = RequestMethod.GET)
	@ResponseBody
	public String home() {
		
		System.out.println("home controller...");
		return"HITESh";
	}
}

package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is Home Url..");
		model.addAttribute("name","Shruti Amrutkar");
		model.addAttribute("id",1);
		
		List<String> frnds=new ArrayList<String>();
		frnds.add("Sairaj");
		frnds.add("Niki");
		frnds.add("Hitesh");
		frnds.add("Rushali");
		
		model.addAttribute("f",frnds);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller....");
		return "about";
	}

	@RequestMapping("/service")
	public String services() {
		System.out.println("This is service controller...");
		return "service";
	}

	@RequestMapping("/help")
	public String help() {
		System.out.println("This is Help controller..");
		return "help";
	}

}

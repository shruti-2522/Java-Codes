package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is Home Url..");
		model.addAttribute("name", "Shruti Amrutkar");
		model.addAttribute("id", 1);

		List<String> frnds = new ArrayList<String>();
		frnds.add("Sairaj");
		frnds.add("Niki");
		frnds.add("Hitesh");
		frnds.add("Rushali");

		model.addAttribute("f", frnds);
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
	public ModelAndView help() {
		System.out.println("This is Help controller..");

		// Create model and view object:
		ModelAndView m1 = new ModelAndView();

		//Setting Data
		m1.addObject("name", "shruti");
		m1.addObject("id", 1);
		
		LocalDateTime now=LocalDateTime.now();
		m1.addObject("time", now);
		
		//Marks
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(70);
		l1.add(80);
		l1.add(60);
		l1.add(90);
		
		
		m1.addObject("marks",l1);
		


		// setting the view name
		m1.setViewName("help");

		return m1;
	}

}

package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

	@RequestMapping("/complex")
	public String Showform() {
		String str=null;
		System.out.println(str.charAt(0));
		return "complex_form";
	}

	@RequestMapping(path = "/handlerForm", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("student") Student stud, BindingResult result) {

		if (result.hasErrors()) {
			return "complex_form";
		}
		System.out.println(stud);
		return "success";
	}

}

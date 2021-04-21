package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("This is Home view...");
		String str = null;
		System.out.println(str.length());

		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("txtsearch") String query) {
		String url = "https://www.google.com/search?q=" + query;
		RedirectView r = new RedirectView();
		r.setUrl(url);
		return r;

	}

	/*
	 * // Exceptional handling in springMVC
	 * 
	 * @ExceptionHandler(value = NullPointerException.class) public String
	 * ExceptionHandlerNull(Model m) { m.addAttribute("msg",
	 * "Null Pointer Exception has Occured"); return "null_page"; }
	 * 
	 * @ExceptionHandler(value = NumberFormatException.class) public String
	 * ExceptionHandlerNumberFormat(Model m) { m.addAttribute("msg",
	 * "Null Pointer Exception has Occured"); return "null_page"; }
	 * 
	 * @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	 * 
	 * @ExceptionHandler(value = Exception.class) public String
	 * exceptionHanderGenric(Model m) { m.addAttribute("msg",
	 * "Number Format Exception has Occured"); return "null_page"; }
	 */

}

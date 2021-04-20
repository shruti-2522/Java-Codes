package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("This is Home view...");

		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("txtsearch") String query) {
		String url="https://www.google.com/search?q="+query;
		RedirectView r = new RedirectView();
		r.setUrl(url);
		return r;

	}

}

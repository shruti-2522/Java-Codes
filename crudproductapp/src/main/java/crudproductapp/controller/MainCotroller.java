package crudproductapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import crudproductapp.dao.ProductDao;
import crudproductapp.model.Product;

@Controller
public class MainCotroller {
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String home(Model m) {
		List<Product> p1=productDao.getAllProducts();
		m.addAttribute("p1",p1);
		return "index";
	}

	// ADD PRODUCT
	@RequestMapping("/add_prod")
	public String add() {
		return "add_product_form";
	}

	// Handle product
	@RequestMapping(value="/handle-product",method=RequestMethod.POST)
	public RedirectView hadleProduct(@ModelAttribute Product product,HttpServletRequest s)
	{
		System.out.println("Product Details"+product);
		productDao.createProduct(product);
		RedirectView r1=new RedirectView();
		r1.setUrl(s.getContextPath()+ "/");
		
		return r1;
	}
	
	//Delete Handler
	@RequestMapping("/delete/{pid}")
	public RedirectView handleDel(@PathVariable("pid") int pid,HttpServletRequest s)
	{
		this.productDao.delProduct(pid);
		RedirectView r1=new RedirectView();
		r1.setUrl(s.getContextPath()+ "/");
		return r1;
	}
	
	//Edit Holder
	@RequestMapping("/edit/{pid}")
	public String form(@PathVariable("pid") int pid,HttpServletRequest s,Model m)
	{
		Product p1=this.productDao.getProduct(pid);
		m.addAttribute("product",p1);
		
		return "update_form";
	}

}

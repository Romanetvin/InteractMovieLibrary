package Interact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/home")
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String homePage(final ModelMap model){
		model.addAttribute("user", "Vincent");
		return "home";
	}
	

}

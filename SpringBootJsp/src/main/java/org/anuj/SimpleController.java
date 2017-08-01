package org.anuj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {

	@RequestMapping("/login")
		public String login(Model model) {
		System.out.println("Inside Controller");
	        return "login";
		
	}	
}

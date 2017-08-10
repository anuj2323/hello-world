package org.anuj;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleController {
	@RequestMapping("/login")
		public String login(Model model) {
		System.out.println("Inside Controller");
		return "login";
	}	
	@RequestMapping(value="login/loginprocess",method=RequestMethod.POST)
	public String loginprocess(Model model,@ModelAttribute("login1")Login login ,BindingResult res,HttpServletRequest rq,HttpServletResponse rs){
		System.out.println("Inside Loginprocess");
		/*if(res.hasErrors()){
			return "login";
		}
		*/
		HttpSession s=rq.getSession(); 
		ServletContext sc= rq.getServletContext();
		System.out.println("Before Login name"+login.getName()+"Before Login age"+login.getAge());
		if(login.getName()!=null && login.getAge()!=0){
		//s.setAttribute("sessname", login.getName());
		//s.setAttribute("sessage", login.getAge());
		sc.setAttribute("scname", login.getName());
		sc.setAttribute("scage", login.getAge());
		}
		//String newname=(String)s.getAttribute("Normal name"+"sessname");
		//int newage=(Integer)s.getAttribute("Normal age"+"sessage");
		String newname1=(String)sc.getAttribute("scname");
		int newage1=(Integer)sc.getAttribute("scage");
		System.out.println(login.getAge());
		System.out.println(login.getName());
		//System.out.println(newname);
		//System.out.println(newage);
		System.out.println("Sc name"+newname1);
		System.out.println("Sc age"+newage1);
		model.addAttribute("name", newname1);
		//ob.setName(name);
		//System.out.println(ob.getName());
		//ob.setFeedback(feedback);
		//System.out.println(ob.getFeedback());
		//System.out.println(ob.getId());
		return "feedback";
	}
}

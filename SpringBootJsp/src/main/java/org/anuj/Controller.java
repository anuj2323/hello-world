package org.anuj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
	@Autowired
	Service service;
@RequestMapping("/save")
public void show(){
	System.out.println("controller called");
	User user=new User();
	user.setId(1);
	user.setName("Anuj");
	service.saveuser(user);	
}

}

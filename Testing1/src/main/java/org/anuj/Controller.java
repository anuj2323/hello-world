package org.anuj;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{
	
@RequestMapping("/save")
public User show(){
	System.out.println("controller called");
	User user=new User();
	user.setId(1);
	user.setName("Anuj");
	return user;	
}
@RequestMapping(method=RequestMethod.GET, value="/get/{name}")
String get(@PathVariable("name") String name){
return name;
}
}

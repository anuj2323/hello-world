package org.anuj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1= new User(1,"anuj");
		User u2= new User(2,"pppp");
		User u3= new User(2,"arpit");
		User u4= new User(2,"zzzzzzzzz");
		User u5= new User(2,"rrrrrrrrrrrr");
		ArrayList<User>al=new ArrayList<User>();
		al.add(u1);
		al.add(u2);
		al.add(u3);
		al.add(u4);
		al.add(u5);
		Collections.sort(al, (user1,user2)-> user1.name.compareTo(user2.name));
		for(User u:al){
			System.out.println(u.name);
		}
	
	}

}

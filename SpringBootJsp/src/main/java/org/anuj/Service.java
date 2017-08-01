package org.anuj;

import org.springframework.beans.factory.annotation.Autowired;
@org.springframework.stereotype.Service
public class Service {
@Autowired
private UserDao userdao;
void saveuser(User ob){
	userdao.save(ob);
}

}

package org.anuj;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class UserDao {
	@Autowired
	 private EntityManager entityManager;

void save(User ob){
	Session session=entityManager.unwrap(Session.class);
	Transaction t=session.beginTransaction();
	session.save(ob);
	t.commit();
	session.close();
}
}

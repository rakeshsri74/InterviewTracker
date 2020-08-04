package com.iiht.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.model.Interview;
import com.iiht.model.User;

@Repository("userDao")
@Transactional(propagation= Propagation.REQUIRED)
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void registerUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}

	public void updateUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
	}

	public List<User> listUsers() {
		Session session = sessionFactory.getCurrentSession();
		List<User> userList = session.createQuery("from User").list();
		return userList;
	}

	public void deleteUser(long userId) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.load(User.class,new Long(userId));
		if(null != user)
		{
			session.delete(user);
		}
	}

}

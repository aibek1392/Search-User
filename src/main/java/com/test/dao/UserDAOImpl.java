package com.test.dao;

import java.lang.invoke.MethodHandles;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	private Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass()); 
	
	
	@Autowired
	EntityManager sf;

	public void addUser(User user) {
		sf.persist(user);

	}

	public List<User> getAllUsers() {
		@SuppressWarnings("unchecked")
		List<User> users = sf.createQuery("from User").getResultList();
		return users;
		
	}

	@Transactional
	public void change(User user) {
		sf.persist(user);
	}

	public void deleteUser(Integer id) {
	}

	public User getUserById(Integer id) {
		logger.info("getUserbyId -> {}", id);
		User user = sf.find(User.class, id);
		return user;
	}

}

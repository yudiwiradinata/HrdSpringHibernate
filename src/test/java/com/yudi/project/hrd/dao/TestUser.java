package com.yudi.project.hrd.dao;

import java.beans.Introspector;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.yudi.project.hrd.model.User;

public class TestUser {

	FileSystemXmlApplicationContext context;
	UserDao userDao;

	@Before
	public void init() {
		context = new FileSystemXmlApplicationContext(
				"/src/main/webapp/WEB-INF/applicationContext.xml");
		userDao = (UserDao) context.getBean("userDao");
	}

	@Test
	public void testGetAll() {

		List<User> list = userDao.getAllUser(0, 10, "", 3, "ASC");

		for (int i = 0; i <= list.size(); i++) {
			System.out.println("  ETT " + list.get(i).getUsername());
		}

	}

	
	public void testFindById() {

		User user = userDao.getUserById(2);

		System.out.println("  " + user.getUsername());
		System.out.println("  " + user.getPassword());		
		System.out.println("  " + user.getEmail());

	}

	public void testDelete() {
		// TODO Auto-generated method stub		
		userDao.delete(new Integer(1));
		
	}
		
	public void testUpdate() {
		// TODO Auto-generated method stub
		User user = userDao.getUserById(2);
		user.setEmail("Yudi3@prawed");
		userDao.update(user);
		
	}
	
	public void testSave() {

		User user = new User();
		user.setUsername("Kampret4");
		user.setPassword("Kampret2");
		user.setEmail("er@fd.co");

		userDao.save(user);
		//System.out.println("Id user " + res);

	}

}

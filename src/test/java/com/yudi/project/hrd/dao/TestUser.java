package com.yudi.project.hrd.dao;

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
	public void init(){		
		context = new FileSystemXmlApplicationContext("/src/main/webapp/WEB-INF/applicationContext.xml");
		userDao = (UserDao) context.getBean("userDao");
	}

	
	public void testGetAll(){
		
		List<User> list = userDao.getAllUser();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("  "+list.get(i).getUsername());
		}
		
	}
	
	@Test
	public void testSave(){
		
	/*	User user = new User();
		user.setUsername("Kampret");
		user.setPassword("Kampret2");
		user.setEmail("er@fd.co");
		*/
		
		int res = userDao.delete(17);
		System.out.println("Id user "+res);
		
		
		
		
	}
	
}

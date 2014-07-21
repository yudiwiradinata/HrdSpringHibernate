package com.yudi.project.hrd.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yudi.project.hrd.dao.UserDao;
import com.yudi.project.hrd.model.User;

@Repository("userDao")
@Transactional(readOnly = true)
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	@Transactional(readOnly = false)
	public int save(User user) {
		// TODO Auto-generated method stub
		int result;
		try {
			sessionFactory.getCurrentSession().persist(user);// save(user);
			result = user.getId();
		} catch (HibernateException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			result = 0;
		}
		return result;
	}

	public int delete(int userId) {
		// TODO Auto-generated method stub
		int result = 1;
		User user = (User) sessionFactory.getCurrentSession().load(User.class,
				userId);
		try {
			sessionFactory.getCurrentSession().delete(user);
		} catch (HibernateException e) {
			// TODO: handle exception
			System.out.println("error delete " + e.getMessage());
			result = 0;
		}

		return result;
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from User ")
				.list();
	}

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		User user = null;
		try {
			user = (User) sessionFactory.getCurrentSession().load(User.class, userId);
		} catch (HibernateException e) {
			// TODO: handle exception
			System.err.println("Erro getUserById "+e.getMessage());
		}
		return user;
	}

}

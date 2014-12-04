package com.yudi.project.hrd.dao.impl;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import org.hibernate.Hibernate;
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

	SessionFactory sessionFactory;

	@Autowired
	public UserDaoImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}

	@Transactional(readOnly = false)
	public void save(User user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(user);// save(user);

		} catch (HibernateException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	@Transactional(readOnly = false)
	public void delete(int userId) {
		// TODO Auto-generated method stub
		User user = this.getUserById(userId);
		System.out.println("User delete " + user.getUsername());
		try {
			sessionFactory.getCurrentSession().delete(user);
		} catch (HibernateException e) {
			// TODO: handle exception
			System.out.println("error delete " + e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from User ")
				.list();
	}

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		User user = null;
		try {
			user = (User) sessionFactory.getCurrentSession().get(User.class,
					userId);
		} catch (HibernateException e) {
			// TODO: handle exception
			System.err.println("Erro getUserById " + e.getMessage());
		}
		return user;
	}

	@Transactional(readOnly = false)
	public void update(User user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(user);
		} catch (HibernateException e) {
			// TODO: handle exception
			System.err.println("Erro update " + e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = false)
	public List<User> getAllUser(int iDisplayStart, int iDisplayLength) {
		// TODO Auto-generated method stub
		try {
			return sessionFactory.getCurrentSession().createQuery("from User")
					.setMaxResults(iDisplayLength)
					.setFirstResult(iDisplayStart).list();
		} catch (HibernateException e) {
			// TODO: handle exception
			System.err.println("Erro update " + e.getMessage());
			return null;
		}		
	}

}

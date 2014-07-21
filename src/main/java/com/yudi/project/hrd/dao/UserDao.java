package com.yudi.project.hrd.dao;

import java.util.List;

import com.yudi.project.hrd.model.User;

public interface UserDao {

	public int save(User user);
	public int delete(int userId);
	public List<User> getAllUser();
	public User getUserById(int userId);
}

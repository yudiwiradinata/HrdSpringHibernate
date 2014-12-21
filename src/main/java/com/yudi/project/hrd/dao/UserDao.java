package com.yudi.project.hrd.dao;

import java.util.List;

import com.yudi.project.hrd.model.User;

public interface UserDao {

	public void save(User user);
	public void delete(int userId);
	public void update(User user);	
	public List<User> getAllUser();
	public List<User> getAllUser(int iDisplayStart,int iDisplayLength, String keyword,int coloumn,String sort);
	public User getUserById(int userId);
	public List<User> getListUserById(List<Integer> ids);
	public List<User> getUserByString(String keyword);
	
}

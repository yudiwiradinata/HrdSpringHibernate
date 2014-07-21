package com.yudi.project.hrd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yudi.project.hrd.dao.UserDao;
import com.yudi.project.hrd.model.User;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	UserDao userDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView home(){
		List<User> listUser = userDao.getAllUser();
		ModelAndView model =  new ModelAndView("home");
		model.addObject("userList",listUser);
		
		return model;
		
	}
	
	@RequestMapping(value="/userdetail", method=RequestMethod.GET)
	public ModelAndView userDetail(@RequestParam int userId){
		ModelAndView model = new ModelAndView("detail");
		model.addObject("userDetail", userDao.getUserById(userId));
		return model;
	}
	
	
}

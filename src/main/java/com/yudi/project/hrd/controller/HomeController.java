package com.yudi.project.hrd.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yudi.project.hrd.dao.UserDao;
import com.yudi.project.hrd.model.User;
import com.yudi.project.hrd.util.JsonObject;

@Controller
public class HomeController {

	@Autowired
	UserDao userDao;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		List<User> listUser = userDao.getAllUser();
		ModelAndView model = new ModelAndView("home2");
		model.addObject("userList", listUser);

		return model;

	}

	@RequestMapping(value = "/home2", method = RequestMethod.POST ,produces = "application/json")
	public @ResponseBody
	String showUser(
			HttpServletRequest request,
            HttpServletResponse response		
			) {
		  
		String start = request.getParameter("start");
		String draw	 = request.getParameter("draw");
		String length = request.getParameter("length");
		String search = request.getParameter("search[value]");
		String order = request.getParameter("order[0][dir]");
		String column = request.getParameter("order[0][column]");				
		
		JsonObject<User> data = new JsonObject<User>();
		List<User> users2 = userDao.getUserByString(search);
		List<User> users = new ArrayList<User>();	
		 
		users = userDao.getAllUser(Integer.parseInt(start), Integer.parseInt(length),search,(Integer.parseInt(column) + 1), order);
	
		data.setAaData(users);
		
		data.setiTotalDisplayRecords(users2.size());
		
		data.setiTotalRecords(users2.size());
		data.setsEcho(Integer.parseInt(draw));

		return toJson(data);

	}

	@RequestMapping(value = "/userdetail", method = RequestMethod.GET)
	public ModelAndView userDetail(
			@RequestParam(value = "user_id", required = false) int userId) {
		ModelAndView model = new ModelAndView("detail");
		model.addObject("userDetail", userDao.getUserById(userId));
		return model;
	}

	@RequestMapping(value = "/detail", method = RequestMethod.POST)
	public ModelAndView detail(
			@ModelAttribute User user,
			HttpServletRequest request,
            HttpServletResponse response
			) {
		ModelAndView model = new ModelAndView("detail2");
		String select = request.getParameter("select");
		List<Integer> ids = new ArrayList<Integer>();
		//getListUserById
		String[] split = select.split(",");
		for(int i=0; i < split.length; i++){
			ids.add(Integer.parseInt(split[i]));
		}
		List<User> users = userDao.getListUserById(ids);
		
		model.addObject("users", users);
		
		return model;
	}

	
	@SuppressWarnings("unused")
	private String toJson(JsonObject<?> dt) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(dt);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}

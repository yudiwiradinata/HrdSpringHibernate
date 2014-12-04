package com.yudi.project.hrd.controller;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
		ModelAndView model = new ModelAndView("home");
		model.addObject("userList", listUser);

		return model;

	}

	@RequestMapping(value = "/home2", produces = "application/json")
	public @ResponseBody
	String showUser(@RequestParam int iDisplayStart,
			@RequestParam int iDisplayLength, @RequestParam int sEcho) {
		
		JsonObject<User> data = new JsonObject<User>();
		List<User> users2 = userDao.getAllUser();
		List<User> users = userDao.getAllUser(iDisplayStart, iDisplayLength);
		data.setAaData(users);
		data.setiTotalDisplayRecords(users2.size());
		data.setiTotalRecords(users2.size());
		data.setsEcho(sEcho);

		return toJson(data);

	}

	@RequestMapping(value = "/userdetail", method = RequestMethod.GET)
	public ModelAndView userDetail(
			@RequestParam(value = "user_id", required = false) int userId) {
		ModelAndView model = new ModelAndView("detail");
		model.addObject("userDetail", userDao.getUserById(userId));
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

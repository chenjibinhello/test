package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.UserModel;
import com.example.demo.pojo.User;
import com.example.demo.utils.Md5Util;

@RestController
@RequestMapping("/sys/user")
public class DemoController {
	
	@RequestMapping("login")
	public User login(@RequestBody @Valid UserModel userModel) {
		User user = new User();
		user.setName(userModel.getUsername());
		String password = Md5Util.md5Convert(userModel.getPassword());
		user.setPassword(password);
		return user;
	}
	
	@RequestMapping("list")
	public ModelAndView index(ModelAndView modelAndView) {
		modelAndView.setViewName("index");
		List<String> list = new ArrayList<String>();
		list.add("1");
		modelAndView.addObject("list", list);
		return modelAndView;
	}
}

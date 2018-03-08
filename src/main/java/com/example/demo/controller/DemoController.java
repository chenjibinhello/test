package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.model.UserModel;
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
	public ModelAndView get(ModelAndView modelAndView) {
		modelAndView.setViewName("index");
		
		Map<String, String> list = new HashMap<String, String>();
		list.put("1", "壹");
		list.put("2", "贰");
		modelAndView.addObject("list", list);
		return modelAndView;
	}
}

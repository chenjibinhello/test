package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

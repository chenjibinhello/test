package com.example.demo.model;

import org.hibernate.validator.constraints.NotBlank;

import com.example.demo.annotation.validator.Phone;

public class UserModel {

	private String username;
	private String password;
	private String phone;
	
	@NotBlank(message = "用户名不能为空")
	public String getUsername() {
		return username;
	}
	
	@NotBlank(message = "密码不能为空")
	public String getPassword() {
		return password;
	}
	
	@Phone
	public String getPhone() {
		return phone;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}

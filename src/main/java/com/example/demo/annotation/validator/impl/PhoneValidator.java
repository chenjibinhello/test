package com.example.demo.annotation.validator.impl;

import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.demo.annotation.validator.Phone;

public class PhoneValidator implements ConstraintValidator<Phone, String> {

	private Pattern pattern = Pattern.compile("1(([38]\\d)|(5[^4&&\\d])|(4[579])|(7[0135678]))\\d{8}");
	@Override
	public void initialize(Phone phone) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
		return pattern.matcher(value).matches();
	}

}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.vo.PartnersVO;

@RestController
@RequestMapping("/sys/partner")
public class PartnerController {
	
	@RequestMapping("")
	public PartnersVO index() {
		PartnersVO partnerVO = new PartnersVO();
		return partnerVO;
	}
}

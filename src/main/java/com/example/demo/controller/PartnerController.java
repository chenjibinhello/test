package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.po.Partners;
import com.example.demo.service.IPartnerService;

@RestController
@RequestMapping("/sys/partner")
public class PartnerController {
	
	@Autowired
	private IPartnerService iPartnerService;
	
	@RequestMapping(value="get/{id}")
	public Partners get(@PathVariable String id) {
		Integer partnerId = Integer.parseInt(id);
		Partners partners = iPartnerService.get(partnerId);
		return partners;
	}
}

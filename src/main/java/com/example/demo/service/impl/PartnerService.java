package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.po.Partners;
import com.example.demo.dao.PartnersMapper;
import com.example.demo.service.IPartnerService;

@Service
public class PartnerService implements IPartnerService {

	@Autowired
	private PartnersMapper partnersMapper;
	@Override
	public Partners get(Integer id) {
		if (id == null) {
			return null;
		}
		return partnersMapper.selectByPrimaryKey(id);
	}
}

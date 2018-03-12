package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.bean.po.Partners;

@Service
public interface IPartnerService {

	Partners get(Integer id);
}

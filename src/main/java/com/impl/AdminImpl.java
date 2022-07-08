package com.impl;

import org.springframework.stereotype.Service;

import com.service.AdminService;

@Service
public class AdminImpl implements AdminService {

	@Override
	public String adminPage() {
		// TODO Auto-generated method stub
		return "Welcome to Admin";
	}

}

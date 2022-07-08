package com.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.UserRegister;
import com.exception.ResourceNotFoundException;
import com.repositiory.UserRegisterRepositiory;
import com.service.UserRegisterService;

@Service
public class UserRegisterImpl implements UserRegisterService {

	
	@Autowired
	private UserRegisterRepositiory userRegisterRepositiory;
	
	
	@Override
	public UserRegister saveUser(UserRegister userRegister) {
		return userRegisterRepositiory.save(userRegister);
	}

	@Override
	public List<UserRegister> listOfAllUser() {
		return userRegisterRepositiory.findAll();
	}

	@Override
	public String deleteUser(Long id) {
		UserRegister userRegister = userRegisterRepositiory.findById(id).orElseThrow(()-> new ResourceNotFoundException("User id is not found"));
		userRegisterRepositiory.delete(userRegister);
		return "User Delete";
	}

	@Override
	public UserRegister updateUserDetails(Long id, UserRegister userRegister) {
		UserRegister userRegister2 = userRegisterRepositiory.findById(id).orElseThrow(()-> new ResourceNotFoundException("User id is not found"));
		userRegister2.setName(userRegister.getName());
		userRegister2.setUserName(userRegister.getUserName());
		userRegister2.setIdentityNumber(userRegister.getIdentityNumber());
		userRegister2.setCity(userRegister.getCity());
		userRegister2.setPassword(userRegister.getPassword());
		userRegister2.setRole(userRegister.getRole());
		userRegisterRepositiory.save(userRegister2);
		return userRegister2;
	}

	
	
	

}

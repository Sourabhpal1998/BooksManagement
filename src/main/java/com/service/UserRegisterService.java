package com.service;

import java.util.List;

import com.entity.UserRegister;

public interface UserRegisterService {
	
	public UserRegister saveUser(UserRegister userRegister);
	
	public List<UserRegister> listOfAllUser();
	
	public String deleteUser(Long id);
	
	public UserRegister updateUserDetails(Long id, UserRegister userRegister);

}

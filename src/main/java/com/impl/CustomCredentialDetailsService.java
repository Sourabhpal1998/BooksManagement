package com.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.entity.UserRegister;
import com.repositiory.UserRegisterRepositiory;

public class CustomCredentialDetailsService implements UserDetailsService {
	
	private UserRegisterRepositiory userRegisterRepositiory;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserRegister userRegister = userRegisterRepositiory.findByUserName(username);
		if(userRegister == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new CustomCredentialDetails(userRegister);
	}

}

package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.UserRegister;
import com.service.UserRegisterService;

@RestController
public class UserRegisterController {
	
	@Autowired
	private UserRegisterService userRegisterService;
	
	
	@PostMapping("/save/user")
    public UserRegister saveUser(@RequestBody UserRegister userRegister) {
    	return userRegisterService.saveUser(userRegister);
    }
	
	@GetMapping("/list/all/user")
	public List<UserRegister> listOfAllUser(){
		return userRegisterService.listOfAllUser();
	}
	
	@DeleteMapping("/delete/user")
	public String deleteUser(@PathVariable Long id) {
		return userRegisterService.deleteUser(id);
	}
	
	@PutMapping("/update/user/details")
	public UserRegister updateUserDetails(@PathVariable Long id, @RequestBody UserRegister userRegister) {
		return userRegisterService.updateUserDetails(id, userRegister);
	}

}

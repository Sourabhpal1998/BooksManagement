package com.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.UserRegister;

@Repository
public interface UserRegisterRepositiory extends JpaRepository<UserRegister, Long> {

	UserRegister findByUserId(String userId);

	UserRegister findByUserName(String username);

}

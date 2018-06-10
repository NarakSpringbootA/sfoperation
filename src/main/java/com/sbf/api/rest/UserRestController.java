package com.sbf.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.sbf.api.model.User;
import com.sbf.api.service.UserSevice;

@RestController
public class UserRestController {
   @Autowired
	private UserSevice userSevice;

 //  @PostMapping("/register?role=ROLE_USER")
   @PostMapping("/register")
public boolean user(@RequestBody User user){
	System.out.println(user);
	return userSevice.createUser(user);
}
}

package com.sbf.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sbf.api.model.User;
@Service
public class UserServiceImp implements UserSevice {
	private List<User> users;

	public UserServiceImp() {
		
		users = new ArrayList<User>();
		users.add(new User("123","HokNarak","123456","555","1234567890","narak.hok"));
		users.add(new User("123","HokNarak","123456","555","1234567890","narak.hok"));
		users.add(new User("123","HokNarak","123456","555","1234567890","narak.hok"));
		users.add(new User("123","HokNarak","123456","555","1234567890","narak.hok"));
		users.add(new User("123","HokNarak","123456","555","1234567890","narak.hok"));
		users.add(new User("123","HokNarak","123456","555","1234567890","narak.hok"));
		users.add(new User("123","HokNarak","123456","555","1234567890","narak.hok"));
		users.add(new User("123","HokNarak","123456","555","1234567890","narak.hok"));
			
	}

	@Override
	public boolean createUser(User user) {
		return	users.add(user);
	}

}

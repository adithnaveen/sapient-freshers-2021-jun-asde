package com.company.rest.works.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.rest.works.model.User;
import com.company.rest.works.services.UserService;

@RestController
public class UserResource {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String hello() {
		return "Working...."; 
	}
	
	@GetMapping(value = "/users")
	public List<User> getUsers() {
		return userService.getAllUsers(); 
	}
	
}

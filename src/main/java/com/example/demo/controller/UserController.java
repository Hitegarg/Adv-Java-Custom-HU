package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserService userService;
	
	UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/register")
	private User saveUser(@Valid User user) {
			return userService.create(user);
	}
	
	@GetMapping("/")
	private List<User> getAllUser() {
		return userService.getAllUser();
}
	
	

}

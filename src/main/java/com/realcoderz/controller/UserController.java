package com.realcoderz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realcoderz.model.User;
import com.realcoderz.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/User")
public class UserController {
	
	
	@Autowired
	private UserService service;
	
	
	
	
	@GetMapping("/showuser")
	public List<User> show(){
		return service.showuser();
		
	}
	
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		
		return service.registereduser(user);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteuser(id);
		
	}
	
	
	
	
	

}

package com.electronicstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronicstore.entity.User;
import com.electronicstore.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	
	
	@PostMapping("/adduser")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		try {
			User savedUser = userService.addUser(user);
			String responseMsg = savedUser.getUserName() + " save with Id " + savedUser.getUserId();
			return new ResponseEntity<String>(responseMsg, HttpStatus.OK);
		} catch (Exception e) {
			String errorMsg = "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
			return new ResponseEntity<String>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	@DeleteMapping("/userid/{searchUserId}")
	public void deleteUser(@PathVariable int searchUserId)
	{
		try {
			userService.delete(searchUserId);
		}catch(Exception e) {
			e.
			printStackTrace();
		}
	}
	
	
}

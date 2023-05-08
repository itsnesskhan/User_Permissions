package com.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.demo.user.payloads.ApiResponse;
import com.demo.user.payloads.UserDto;
import com.demo.user.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/save")
	ResponseEntity<ApiResponse> createUser(@RequestBody UserDto userDto){
		ApiResponse apiResponse = userService.addUser(userDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
	}
}

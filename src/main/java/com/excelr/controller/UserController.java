package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.dto.UserLocationDTO;
import com.excelr.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/users-location")
	public List<UserLocationDTO> getAllUserLocation(){
		return userService.getAllUserLocation();
	}
}

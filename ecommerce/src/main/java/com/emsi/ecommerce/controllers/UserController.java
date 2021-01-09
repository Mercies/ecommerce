package com.emsi.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.emsi.ecommerce.service.IUserService;

@Controller
public class UserController {
	
	
	@Autowired
	private IUserService iUserService;
}

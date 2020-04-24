package com.neo.controller;

import java.util.List;

import com.neo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.model.User;
/**
 * @author Jigubigu
 * @version 1.0
 * @date 2019/9/26 17:16
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
	@RequestMapping("/getAllUser")
	public List<User> getUsers() {
		List<User> users = userService.getAllUser();
		return users;
	}

}
package com.example.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import com.example.demo.service.LoggedUserManagementService;
import com.example.demo.service.LoginCountService;

@Component
@RequestScope
public class LoginProcessor {
    private final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;

    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService,
	    LoginCountService loginCountService) {
	this.loggedUserManagementService = loggedUserManagementService;
	this.loginCountService = loginCountService;
    }

    public boolean login() {
	loginCountService.increment();

	String username = this.getUsername();
	String password = this.getPassword();

	boolean loginResult = false;
	if ("natalie".equals(username) && "password".equals(password)) {
	    loginResult = true;
	    loggedUserManagementService.setUsername(username);
	}
	return loginResult;

    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }
}

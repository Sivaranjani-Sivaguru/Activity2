package com.model;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Subscription {
	private List<UserService> userservice;
	
	public Subscription() {}
	

	public Subscription(List<UserService> userservice) {
		
		this.userservice = userservice;
	}


	public List<UserService> getUserservice() {
		return userservice;
	}

	public void setUserservice(List<UserService> userservice) {
		this.userservice = userservice;
	}

	@Override
	public String toString() {
		return "Subscription [userservice=" + userservice + "]";
	}
	

}

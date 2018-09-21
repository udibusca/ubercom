package com.projeto.ubercom.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.projeto.ubercom.security.UserSS;

public class UserService {
	
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch (Exception e) {
			return null;
		}
	}
}
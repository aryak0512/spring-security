package com.aryak.securitydemo.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class User {

	//private Long id;
	private String username;
	private String role;
	private String password;

}

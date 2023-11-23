package com.aryak.securitydemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v2")
public class AppController2 {
	
	@GetMapping("/msg")
	public String hello() {
		return "hello world";
	}

}

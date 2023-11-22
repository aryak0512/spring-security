package com.aryak.securitydemo.security;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
class UserDetailsServiceImpl implements UserDetailsService {

	// @Autowired
	// private AccountService accountService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		System.out.println("in here");
		User user = new User("ADMIN", "admin", "$2a$12$jmVqfXICj7iYOV2LwU19buzQL2qnorMNTuVBHOEZW2LeqM1CAhkvu");
		// fetch from DAO layer
		User u = Optional.ofNullable(user).orElseThrow(() -> new UsernameNotFoundException(""));
		return new UserDetailsImpl(user);
	}

	// ...
}

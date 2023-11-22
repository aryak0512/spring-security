package com.aryak.securitydemo.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User user;

	public UserDetailsImpl(User user) {
		super();
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<GrantedAuthority> list = new ArrayList<>();
		SimpleGrantedAuthority sga = new SimpleGrantedAuthority(user.getRole());
		list.add(sga);
		return list;
	}

	@Override
	public String getPassword() {

		System.out.println("In password : " + user);
		return user.getPassword();
	}

	@Override
	public String getUsername() {

		System.out.println("In username : " + user);
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {

		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {

		return true;
	}

}

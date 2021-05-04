package com.smart.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.smart.dao.UserRepository;
import com.smart.entities.user;

public class UserDetailsImplService implements UserDetailsService {
 
	@Autowired
	private UserRepository u1;
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//Fetching user from database
		user u2=u1.getUserByUserName(username);
		
		if(u2==null)
		{
			throw new UsernameNotFoundException("Could Not found User !!");
		}
		CustomUserDetails c1=new CustomUserDetails(u2);
		return c1;
	}

}

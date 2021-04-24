package com.example.JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.JPA.dao.UserRepository;
import com.example.JPA.model.User;

@SpringBootApplication
public class SpingJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpingJpaApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		User user=new User();
		user.setId(2);
		user.setName("Sneha Amrutkar");
		user.setCity("Dhule");
		user.setStatus("I am a Designer");
		
		
	UserRepository u1=(UserRepository) userRepository.save(user);
	System.out.println(u1);
		
	}

}

package com.example.JPA.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.JPA.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}

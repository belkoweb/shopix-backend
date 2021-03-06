package com.shopix.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.shopix.beans.User;

public interface UserService {
	public User findByNom(String nom);

	public User findByEmail(String email);

	public User findByEmailAndPassword(String email, String password);

	public ResponseEntity<?> save(User user);

	public User findByEmailAndPassword1(String email, String password);
	
	public List<User> findAll();
	

	public void changeStatus(long id, Boolean status);
	
	
}

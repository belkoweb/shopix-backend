package com.shopix.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopix.beans.User;
import com.shopix.service.UserService;

@RestController
@RequestMapping("/shopix-api/users")
@CrossOrigin
public class UserRest {
	@Autowired
	private UserService userService;
	@PostMapping("/")
	public ResponseEntity<?> save(@RequestBody User user) {
		return userService.save(user);
	}
	@GetMapping("/nom/{nom}")
	public User finByNom(@PathVariable("nom")String nom) {
		return userService.findByNom(nom);
	}
    @GetMapping("/email/{email}")
	public User findByEmail(@PathVariable("email")String email) {
		return userService.findByEmail(email);
	}
    @GetMapping("/email/{email}/password/{password}")
	public User findByEmailAndPassword(@PathVariable("email")String email, @PathVariable("password")String password) {
		return userService.findByEmailAndPassword(email, password);
	}
	

}

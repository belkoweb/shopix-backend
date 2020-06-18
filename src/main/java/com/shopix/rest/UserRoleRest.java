package com.shopix.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopix.beans.Role;
import com.shopix.service.UserRoleService;

@RestController
@RequestMapping("/shopix-api/userRole")
public class UserRoleRest {
	@Autowired
	private UserRoleService userRoleService;

	@PostMapping("/email/{email}/password/{password}")
	public int save(@PathVariable String email, @PathVariable String password, @RequestBody Role role) {
		return userRoleService.save(email, password, role);
	}

}

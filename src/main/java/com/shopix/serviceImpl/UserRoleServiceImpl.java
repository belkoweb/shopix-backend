package com.shopix.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopix.beans.Role;
import com.shopix.beans.User;
import com.shopix.beans.UserRole;
import com.shopix.dao.RoleDao;
import com.shopix.dao.UserRoleDao;
import com.shopix.service.UserRoleService;
import com.shopix.service.UserService;
@Service
public class UserRoleServiceImpl implements UserRoleService {
 @Autowired
 private RoleDao roleDao;
 @Autowired
 private UserRoleDao userRoleDao;
 @Autowired
 private UserService userService;
@Override
public int save(String email, String password, Role role) {
	User user = userService.findByEmailAndPassword(email, password);
	if(user != null) {
     roleDao.save(role);
     UserRole userRole = new UserRole();
     userRole.setUser(user);
     userRole.setRole(role);
     userRoleDao.save(userRole);
	}
	return 1;
}
	

}

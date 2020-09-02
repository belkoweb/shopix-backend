package com.shopix.serviceImpl;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.shopix.beans.User;
import com.shopix.dao.UserDao;
import com.shopix.service.UserService;
import com.shopix.utils.SaltHashPassword;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
    public SaltHashPassword saltHashPassword;
	@Override
	public User findByNom(String nom) {
		
		return userDao.findByNom(nom);
	}

	@Override
	public User findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public User findByEmailAndPassword(String email, String password) {
		if(!email.equals("") || !password.equals("")) {
			try {
				String pass= SaltHashPassword.generateHash(password);
				return userDao.findByEmailAndPassword(email, pass);
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	@Override
	public ResponseEntity<?> save(User user) {
		try {
			String password = SaltHashPassword.generateHash(user.getPassword());
			user.setPassword(password);
			user.setCpassword(password);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		User userLoaded = findByEmail(user.getEmail());
		if (userLoaded != null) {
			System.out.println("/////////////////////////////////////");
			System.out.println("/////////////////////////////////////");
			System.out.println("/////////////////////////////////////");
			
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<>(userDao.save(user), HttpStatus.CREATED);
	}

	@Override
	public User findByEmailAndPassword1(String email, String password) {
		// TODO Auto-generated method stub
				return userDao.findByEmailAndPassword(email, password);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public void changeStatus(long id, Boolean status) {
		// TODO Auto-generated method stub
		User user = userDao.getOne(id);
		System.out.println("this is it !!");
		System.out.println(user);
		System.out.println(status);
		if(user != null) {
			System.out.println("in the if block");
			user.setActive(status);
			userDao.save(user);
		}
	}

}

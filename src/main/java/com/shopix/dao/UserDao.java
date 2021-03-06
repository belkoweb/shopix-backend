package com.shopix.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.shopix.beans.User;
@Repository
@CrossOrigin
public interface UserDao  extends JpaRepository<User, Long>{
	public User findByNom(String nom);
	public User findByEmail(String email);
	public User findByEmailAndPassword(String email,String password);
}

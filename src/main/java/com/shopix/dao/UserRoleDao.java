package com.shopix.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shopix.beans.UserRole;
@RepositoryRestResource
public interface UserRoleDao  extends JpaRepository<UserRole, Long>{

}

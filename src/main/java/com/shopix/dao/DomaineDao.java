package com.shopix.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shopix.beans.Domaine;
@RepositoryRestResource
@CrossOrigin
public interface DomaineDao  extends JpaRepository<Domaine, Long>{
	 public Domaine findByNom(String nom);

}

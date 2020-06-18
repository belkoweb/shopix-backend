package com.shopix.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shopix.beans.Categorie;
@RepositoryRestResource
@CrossOrigin
public interface CategorieDao  extends JpaRepository<Categorie, Long>{
	public Categorie findByNom(String categorie);

} 

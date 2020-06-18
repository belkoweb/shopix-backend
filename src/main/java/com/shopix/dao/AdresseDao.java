package com.shopix.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shopix.beans.Adresse;
@RepositoryRestResource
@CrossOrigin
public interface AdresseDao  extends JpaRepository<Adresse, Long>{
 public Adresse findByadresse1(String adresse1);
}

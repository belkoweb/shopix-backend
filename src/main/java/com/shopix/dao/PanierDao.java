package com.shopix.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shopix.beans.Panier;
@RepositoryRestResource
public interface PanierDao  extends JpaRepository<Panier, Long>{

}

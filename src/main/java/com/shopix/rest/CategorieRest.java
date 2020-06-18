package com.shopix.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopix.beans.Categorie;
import com.shopix.beans.Domaine;
import com.shopix.service.CategorieService;

@RestController
@CrossOrigin
@RequestMapping("/shopix-api/categories")
public class CategorieRest {
	@Autowired
	private CategorieService categorieService;
    @GetMapping("/")
	public Collection<Categorie> findAll() {
		return categorieService.findAll();
	}
	@GetMapping("/nom/{nom}")
	public Categorie findByNom(@PathVariable("nom")String categorie) {
		return categorieService.findByNom(categorie);
	}
	

}

package com.shopix.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopix.beans.Fournisseur;
import com.shopix.service.FournisseurService;

@Controller
@RequestMapping("/shopix-api/fournisseurs")
public class FournisseurRest {
	@Autowired
    private FournisseurService fournisseurService;
     @GetMapping("/nom/{nom}")
	public Fournisseur findByNom( @PathVariable("nom")String nom) {
		return fournisseurService.findByNom(nom);
	}
}

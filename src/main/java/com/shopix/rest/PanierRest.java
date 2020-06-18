package com.shopix.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopix.beans.Panier;
import com.shopix.service.PanierService;

@RestController
@RequestMapping("/shopix-api/paniers")
public class PanierRest {
 @Autowired
 private PanierService panierService;

@GetMapping("/")
 public Collection<Panier> findAll() {
	return panierService.findAll();
}


@PostMapping("/")
public int save(@RequestBody Panier panier) {
	return panierService.save(panier);
}
 
 
}

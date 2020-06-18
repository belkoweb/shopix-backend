package com.shopix.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopix.beans.Produit;
import com.shopix.service.ProduitService;
@CrossOrigin
@RestController
@RequestMapping("/shopix-api/produits")
public class ProduitRest {
 @Autowired
 private ProduitService produitService;
 @GetMapping("/prix/{prix}")
 public List<Produit> findByPrixLessThan(@PathVariable double prix) {
	return produitService.findByPrixLessThan(prix);
}
@GetMapping("/categorie/{categorie}")
 public List<Produit> findByCategorie(@PathVariable String categorie) {
	return produitService.findByCategorie(categorie);
}
@PostMapping("/")
 public Produit save(@RequestBody Produit produit) {
	return produitService.save(produit);
}
@GetMapping("/nbrProtuit")
 public Long nombreProduit() {
	return produitService.nombreProduit();
}
@PutMapping("/id/{id}")
public Produit update(@PathVariable Long id,@RequestBody Produit produit) {
	return produitService.update(id, produit);
}
@DeleteMapping("/id/{id}")
public void deleteProduit(@PathVariable Long id) {
	produitService.deleteProduit(id);
}

@GetMapping("/")
 public List<Produit> findAll() {
	return produitService.findAll();
}

@GetMapping("/ref/{ref}")
public Produit findByRef(@PathVariable("ref")String ref) {
	return produitService.findByRef(ref);
}

 @GetMapping("/libelle/{libelle}")
public Produit findByLibelle(@PathVariable("libelle")String libelle) {
	return produitService.findByLibelle(libelle);
}
 
}

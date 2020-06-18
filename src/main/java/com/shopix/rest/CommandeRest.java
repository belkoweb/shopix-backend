package com.shopix.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopix.beans.Commande;
import com.shopix.beans.User;
import com.shopix.service.CommandeService;

@RestController
@CrossOrigin
@RequestMapping("/shopix-api/commandes")
public class CommandeRest {
@Autowired
private CommandeService commandeService;
@GetMapping("/etat/{etatCommande}")
public Long countByEtatCommande(@PathVariable String etatCommande) {
	return commandeService.countByEtatCommande(etatCommande);
}
@GetMapping("/nbrCommandes")
public Long nbrCommandes() {
	return commandeService.nbrCommandes();
}
@PostMapping("/email/{email}/password/{password}")
public int save(@PathVariable String email,@PathVariable String password,@RequestBody Commande commande) {
	return commandeService.save(email, password, commande);
}
@GetMapping("/")
public Collection<Commande> findAll() {
	return commandeService.findAll();
}
@GetMapping("/reference/{ref}")
public Commande findByref(@PathVariable String ref) {
	return commandeService.findByref(ref);
}
@GetMapping("/user")
public Collection<Commande> findAllByUser(@RequestBody User user) {
	return commandeService.findAllByUser(user);
}

@PutMapping("/id/{id}")
public Commande update(@PathVariable Long id, @RequestBody Commande commande ) {
	return commandeService.update(id, commande);
}

@DeleteMapping("/id/{id}")
public void delete(@PathVariable Long id) {
	commandeService.delete(id);
}
}

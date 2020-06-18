package com.shopix.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopix.beans.Adresse;
import com.shopix.service.AdresseService;

@RestController
@RequestMapping("/shopix-api/adresse")
@CrossOrigin("*")
public class AdresseRest {
@Autowired
private AdresseService adresseService;
@CrossOrigin
@PostMapping("/email/{email}/password/{password}")
public int save(@PathVariable String email,@PathVariable String password,@RequestBody Adresse adresse) {
	return adresseService.save(email, password, adresse);
}

}

package com.shopix.service;

import java.util.Collection;

import com.shopix.beans.Categorie;
import com.shopix.beans.Domaine;

public interface CategorieService {
public Categorie findByNom(String categorie);
public Collection<Categorie> findAll();
}

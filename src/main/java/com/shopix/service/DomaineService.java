package com.shopix.service;

import java.util.List;

import com.shopix.beans.Domaine;

public interface DomaineService {
 public Domaine findByNom(String nom);
 public List<Domaine> findAll();
}

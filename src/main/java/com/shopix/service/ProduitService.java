package com.shopix.service;

import java.util.List;

import com.shopix.beans.Produit;

public interface ProduitService {
public Produit findByRef(String ref);
public Produit findByLibelle(String libelle);
public Produit update(Long id,Produit produit);
public List<Produit> findAll();
public void deleteProduit(Long id);
public Long nombreProduit();
public Produit save(Produit produit);
public List<Produit> findByCategorie(String categorie);
public List<Produit> findByPrixLessThan(double prix);
}

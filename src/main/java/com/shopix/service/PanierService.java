package com.shopix.service;

import java.util.Collection;

import com.shopix.beans.Panier;

public interface PanierService {
    
	public int save(Panier panier);
	public Collection<Panier> findAll();

 
}

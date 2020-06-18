package com.shopix.serviceImpl;

import org.springframework.stereotype.Service;

import com.shopix.beans.Facture;
import com.shopix.service.FactureService;
@Service
public class FactureServiceImpl implements FactureService {

	@Override
	public Facture findByRefCommande(String refCOmmande) {
		return null;
	}

}

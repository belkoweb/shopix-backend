package com.shopix.serviceImpl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopix.beans.Panier;
import com.shopix.beans.PanierItem;
import com.shopix.dao.PanierDao;
import com.shopix.dao.ProduitDao;
import com.shopix.service.PanierItemService;
import com.shopix.service.PanierService;

@Service
public class PanierServiceImpl implements PanierService {

	@Autowired
	private PanierDao panierDao;
	@Autowired
	private PanierItemService panierItemService;
   
	@Override
	public int save(Panier panier) {
		System.out.println("this is not working motherfucker");
		Long id = panier.getId();
		if (id != null) {
			return -1;
		} else {
			calculerTotal(panier, panier.getPanierItems());
			panierItemService.save(panier, panier.getPanierItems());
			panierDao.save(panier);
		}

		return 1;
	}

	private void calculerTotal(Panier panier, Collection<PanierItem> panierItems) {
		double total = 0;
		for (PanierItem panierItem : panierItems) {
			total += panierItem.getPrixPiece() * panierItem.getNbrPiece();
		}
		panier.setTotalPanier(total);
	}

	@Override
	public Collection<Panier> findAll() {
		return panierDao.findAll();
	}



}

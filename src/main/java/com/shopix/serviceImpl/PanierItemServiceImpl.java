package com.shopix.serviceImpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopix.beans.Panier;
import com.shopix.beans.PanierItem;
import com.shopix.dao.PanierDao;
import com.shopix.dao.PanierItemDao;
import com.shopix.service.PanierItemService;
@Service
public class PanierItemServiceImpl implements PanierItemService {
  @Autowired
  private PanierDao panierDao;
  @Autowired
  private PanierItemDao panierItemDao;
	
	
	@Override
	public int save(Panier panier, Collection<PanierItem> panierItems) {
		panierDao.save(panier);
		System.out.println("saving the !panier!");
		for (PanierItem panierItem : panierItems) {
			panierItem.setPanier(panier);
			panierItem.setTotal(panierItem.getPrixPiece() * panierItem.getNbrPiece());
			panierItemDao.save(panierItem);
		}
		return 1;
	}


}

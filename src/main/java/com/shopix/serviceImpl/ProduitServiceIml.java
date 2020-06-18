package com.shopix.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopix.beans.Categorie;
import com.shopix.beans.CommandeItem;
import com.shopix.beans.Domaine;
import com.shopix.beans.Produit;
import com.shopix.beans.Propriete;
import com.shopix.dao.CategorieDao;
import com.shopix.dao.CommandeItemDao;
import com.shopix.dao.ProduitDao;
import com.shopix.dao.ProprieteDao;
import com.shopix.service.ProduitService;

@Service
public class ProduitServiceIml implements ProduitService {
	@Autowired
	ProduitDao produitDao;
	@Autowired
	ProprieteDao proprieteDao;
	@Autowired
	CommandeItemDao commandeItemDao;
	@Autowired
	CategorieDao categorieDao;

	@Override
	public Produit findByRef(String ref) {
		return produitDao.findByRef(ref);
	}

	@Override
	public Produit findByLibelle(String libelle) {
		return produitDao.findByLibelle(libelle);
	}

	@Override
	public Produit update(Long id, Produit produit) {
		produit.setId(id);
		return produitDao.save(produit);
	}

	@Override
	public List<Produit> findAll() {
		// TODO Auto-generated method stub
		return produitDao.findAll();
	}

	@Override
	@Transactional
	public void deleteProduit(Long id) {
		// TODO Auto-generated method stub
		Produit produit = produitDao.getOne(id);
		if (produit != null) {
			if (produit.getCommandeItems() != null) {
				for (CommandeItem commandeItem : produit.getCommandeItems()) {
					commandeItemDao.deleteById(commandeItem.getId());
				}
			}
			if (produit.getProprietes() != null) {
				for (Propriete propriete : produit.getProprietes()) {
					proprieteDao.deleteById(propriete.getId());
				}

			}
			produitDao.deleteById(produit.getId());
		}
	}

	@Override
	public Long nombreProduit() {
		// TODO Auto-generated method stub
		return produitDao.count();
	}

	@Override
	public Produit save(Produit produit) {
		// TODO Auto-generated method stub
		Produit prod = findByLibelle(produit.getLibelle());
		if (prod != null) {
			return null;
		} else {
			return produitDao.save(produit);
		}
	}

	@Override
	public List<Produit> findByCategorie(String categorie) {
		// TODO Auto-generated method stub
		Categorie cat = categorieDao.findByNom(categorie);
		List<Produit> prod = produitDao.findByCategorie(cat);
		return prod;
	}

	@Override
	public List<Produit> findByPrixLessThan(double prix) {
		// TODO Auto-generated method stub
		return produitDao.findByPrixLessThan(prix);
	}

}

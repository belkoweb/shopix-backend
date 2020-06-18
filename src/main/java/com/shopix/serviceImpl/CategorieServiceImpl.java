package com.shopix.serviceImpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopix.beans.Categorie;
import com.shopix.beans.Domaine;
import com.shopix.dao.CategorieDao;
import com.shopix.service.CategorieService;
@Service
public class CategorieServiceImpl implements CategorieService {
	@Autowired
   private CategorieDao categorieDao;
	@Override
	public Categorie findByNom(String categorie) {
		return categorieDao.findByNom(categorie);
	}
	@Override
	public Collection<Categorie> findAll() {
		// TODO Auto-generated method stub
		return categorieDao.findAll();
	}

}

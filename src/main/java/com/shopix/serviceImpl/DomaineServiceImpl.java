package com.shopix.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopix.beans.Domaine;
import com.shopix.dao.DomaineDao;
import com.shopix.service.DomaineService;
@Service
public class DomaineServiceImpl implements DomaineService {
   @Autowired
   private DomaineDao domaineDao;
	@Override
	public Domaine findByNom(String nom) {
		return domaineDao.findByNom(nom); 
	}
	@Override
	public List<Domaine> findAll() {
		// TODO Auto-generated method stub
		return domaineDao.findAll();
	}

}

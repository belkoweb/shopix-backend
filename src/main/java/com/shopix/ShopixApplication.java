
package com.shopix;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shopix.beans.Categorie;
import com.shopix.beans.Domaine;
import com.shopix.beans.Fournisseur;
import com.shopix.beans.Produit;
import com.shopix.dao.CategorieDao;
import com.shopix.dao.DomaineDao;
import com.shopix.dao.FournisseurDao;
import com.shopix.dao.ProduitDao;

@SpringBootApplication
public class ShopixApplication implements CommandLineRunner {
	@Autowired
	private DomaineDao domaineDao;
	@Autowired
	private CategorieDao categorieDao;
	@Autowired
	private FournisseurDao fournisseurDao;
	@Autowired
	private ProduitDao produitDao;

	public static void main(String[] args) {
		SpringApplication.run(ShopixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Informatique", "Vetements & Chaussures", "TV & Electronique", "Supermarche").forEach(nameDomaine -> {
			Domaine domaine = new Domaine();
			domaine.setNom(nameDomaine);
			domaineDao.save(domaine);

		});
		Stream.of("Informatique", "Vetements & Chaussures", "TV & Electronique", "Supermarche").forEach(nameCategorie -> {
			Categorie categorie = new Categorie();
			categorie.setNom(nameCategorie);
			categorieDao.save(categorie);

		});

		Fournisseur fournisseur1 = new Fournisseur("f1", "f1@gmail.com", "0645362788");
		Fournisseur fournisseur2 = new Fournisseur("f2", "f2@gmail.com", "0645454578");
		Fournisseur fournisseur3 = new Fournisseur("f3", "f3@gmail.com", "0677474743");
		fournisseurDao.save(fournisseur1);
		fournisseurDao.save(fournisseur2);
		fournisseurDao.save(fournisseur3);
		// informatique
		Produit p1 = new Produit("x-1", "Logitech Mouse M90", "Logitech ", "GREY - USB - N/A - EWR2",
				"assets/images/1.png", 75);
		Produit p2 = new Produit("x-2", "HP Omen", "HP", "PC Gamer", "assets/images/2.png", 20000);
		Produit p3 = new Produit("x-3", "Macbook Pro", "Apple", "Laptop", "assets/images/3.png", 20000);
		Produit p4 = new Produit("x-4", "Rog Strix G", "Asus", "PC Gamer", "assets/images/4.png", 18000);
		Produit p5 = new Produit("x-5", "Iphone 11 Pro Max", "Apple", "Telephone Portable", "assets/images/5.png",
				12000);
		// Vêtements & Chaussures
		Produit p6 = new Produit("x-6", "Fashion", "Fashion", " Chaussures de Ville pour Hommes", "assets/images/6.png",
				200);
		Produit p7 = new Produit("x-7", "TUNIQUE À MANCHES COURTES", "Defacto", "Couleur: Kaki", "assets/images/7.png",
				79);
		Produit p8 = new Produit("x-8", "Daniel Wellington", "Daniel Wellington",
				"Montre Pour Homme Classic Black Cornwall Silver 40Mm DW00100149 - TU", "assets/images/8.png", 1849);
		Produit p9 = new Produit("x-9", "Nike", "Nike", "Survêtement pour Enfant - NIKE SPORTSWEAR",
				"assets/images/9.png", 559);
		Produit p10 = new Produit("x-10", "Defacto ROBE", "Defacto", "BLEU MARINE", "assets/images/10.png", 66);

		// SuperMarché

		Produit p11 = new Produit("x-6", "Jaouda ", "Jaouda", "Lait Uht Entier 500Ml",
				"assets/images/11.png", 5);
		Produit p12 = new Produit("x-7", "Cigala", "Cigala", "Riz Jaune Étuvé Cigala 1Kg", "assets/images/12.png",
				18);
		Produit p13 = new Produit("x-8", "Huilor ", "Huilor ",
				"Huile De Table Tournesol 5L", "assets/images/14.png", 69);
		Produit p14 = new Produit("x-9", "Crunchips" + 
				"", "Crunchips", "Chips Red Chili 100G",
				"assets/images/4.jpg", 12);
		Produit p15 = new Produit("x-10", "Nutella", "Nutella", "Pack Biscuits B-Ready 132 G X6", "assets/images/15.png", 27);
       
		//TV & Électronique
		Produit p16 = new Produit("x-6", "Samsung", "SAMSUNG", "SAMSUNG A8",
				"assets/images/16.png", 200);
		Produit p17 = new Produit("x-7", "Infinix", "INFINIX", "INFINIX 5W", "assets/images/17.png",
				79);
		Produit p18 = new Produit("x-8", "Wansenda", "Wansenda",
				"Clé USB 3.0 Wansenda", "assets/images/18.png", 1849);
		Produit p19 = new Produit("x-9", "SanDisk", "SanDisk", "Clé USB SanDisk",
				"assets/images/19.png", 559);
		Produit p20 = new Produit("x-10", "Oreik", "Oreik", "Ecouteur Oreik 9Max ", "assets/images/20.png", 66);

		Categorie cat1 = categorieDao.findByNom("Informatique");
		if (cat1 != null) {
			p1.setCategorie(cat1);
			produitDao.save(p1);
			p2.setCategorie(cat1);
			produitDao.save(p2);
			p3.setCategorie(cat1);
			produitDao.save(p3);
			p4.setCategorie(cat1);
			produitDao.save(p4); 
			p5.setCategorie(cat1);
			produitDao.save(p5);
			
		}

		Categorie cat2 = categorieDao.findByNom("Vetements & Chaussures");
		if (cat2 != null) {
			p6.setCategorie(cat2);
			produitDao.save(p6);
			p7.setCategorie(cat2);
			produitDao.save(p7);
			p8.setCategorie(cat2);
			produitDao.save(p8);
			p9.setCategorie(cat2);
			produitDao.save(p9);
			p10.setCategorie(cat2);
			produitDao.save(p10);
		}

		Categorie cat3 = categorieDao.findByNom("Supermarche");
		if (cat3 != null) {
			p11.setCategorie(cat3);
			produitDao.save(p11);
			p12.setCategorie(cat3);
			produitDao.save(p12);
			p13.setCategorie(cat3);
			produitDao.save(p13);
			p14.setCategorie(cat3);
			produitDao.save(p14);
			p15.setCategorie(cat3);
			produitDao.save(p15);
		}

		Categorie cat4 = categorieDao.findByNom("TV & Electronique");
		if (cat4 != null) {
			p16.setCategorie(cat4);
			produitDao.save(p16);
			p17.setCategorie(cat4);
			produitDao.save(p17);
			p18.setCategorie(cat4);
			produitDao.save(p18);
			p19.setCategorie(cat4);
			produitDao.save(p19);
			p20.setCategorie(cat4);
			produitDao.save(p20);
		}

	}

}

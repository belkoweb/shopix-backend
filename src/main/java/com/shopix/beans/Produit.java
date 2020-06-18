package com.shopix.beans;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String ref;
	private String libelle;
	private String marque;
	private String description;
	private String image;
	private double prix;
	private int stock;
	private int note;
	private int nbrVentes;
	private boolean active;
	@ManyToOne
	private Categorie categorie;
	@OneToMany(mappedBy = "produit")
	private Collection<Propriete> proprietes;
	@ManyToOne
	private Fournisseur fournisseur;
	@ManyToOne
	private Domaine domaine;
	@OneToMany
	@JsonProperty(access = Access.WRITE_ONLY)
	private Collection<CommandeItem> commandeItems;

	public Produit(String ref, String libelle, String marque, String description, String image, double prix) {
		super();
		this.ref = ref;
		this.libelle = libelle;
		this.marque = marque;
		this.description = description;
		this.image = image;
		this.prix = prix;
	}

}

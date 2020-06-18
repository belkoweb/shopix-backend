package com.shopix.beans;

import java.util.Collection;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
public class Commande {
	 @Id @GeneratedValue(strategy = GenerationType.AUTO )
		private Long id;
	    private String ref;
	    private double total;
	    private Date date = new Date();
	    @ManyToOne
	   
	    private User user;
	    @OneToMany(mappedBy = "commande")
	    @JsonProperty(access = Access.WRITE_ONLY)
	    private Collection<CommandeItem> commandeItems;
	    private String etatCommande;
	    @OneToOne
	    private Facture facture;
	    @OneToMany(mappedBy = "commande")
	    private Collection<Livraison> livraisons;
}

package com.shopix.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Propriete {
	 @Id @GeneratedValue(strategy = GenerationType.AUTO )
		private Long id;
	    private String libelle;
	    private double valeur;
	    @ManyToOne
	    private Produit produit;
	    

}

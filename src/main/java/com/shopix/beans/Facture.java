package com.shopix.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Facture {
	 @Id @GeneratedValue(strategy = GenerationType.AUTO )
		private Long id;
	    private Date date;
	    private double tva;
	    private int remise;
	    private double totalHT;
	    private double totalTTC;
	    @OneToOne
	    private Commande commande;
}


package com.shopix.beans;

import java.util.Date;

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
public class Livraison {
	 @Id @GeneratedValue(strategy = GenerationType.AUTO )
		private Long id;
	    private Date date;
	    private String description;
	    @ManyToOne
	    private Commande commande;
	    @ManyToOne
	    private Magasin magasin;
	    @ManyToOne
	    private ModeLivraison modeLivraison;
}

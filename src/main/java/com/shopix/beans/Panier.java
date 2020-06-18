package com.shopix.beans;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class Panier {
	 @Id @GeneratedValue(strategy = GenerationType.AUTO )
		private Long id;
	    private double totalPanier;
	    @OneToMany(mappedBy = "panier")
	    private Collection<PanierItem> panierItems;
	    @OneToOne
	    private User user;
	    
	    
}

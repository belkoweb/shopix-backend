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
public class Adresse {
	 @Id @GeneratedValue(strategy = GenerationType.AUTO )
		private Long id;
	    private String adresse1;
	    private String adresse2;
	    private String ville;
	    private String codePostal;
	    private String pays;
	    private String type;
	    @ManyToOne
	    private User user;
}

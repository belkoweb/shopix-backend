package com.shopix.beans;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class User {
 @Id @GeneratedValue(strategy = GenerationType.AUTO )
 private Long id;
 private String nom;
 private String prenom;
 private String login;
 private String email;
 private String password;
 private String cpassword;
 private String tel;
 private boolean active;
 @OneToMany(mappedBy = "user")
 @JsonProperty(access = Access.WRITE_ONLY)
 private Collection<Commande> commandes;
 private String  userRole;
 @OneToMany(mappedBy = "user")
 @JsonProperty(access = Access.WRITE_ONLY)
 private Collection<Adresse> adresses;
 @OneToOne
 private Panier panier;
}

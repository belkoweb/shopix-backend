package com.shopix.beans;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Role {
	 @Id @GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	private String designation;
	private String description;
	@OneToMany(mappedBy = "role")
	private Collection<UserRole>  userRoles;

}

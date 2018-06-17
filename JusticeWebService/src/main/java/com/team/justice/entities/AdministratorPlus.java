package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "adminPlus")
public class AdministratorPlus implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -834552631377943113L;
	@Id
	String name;
	String password;
	
	@OneToMany(mappedBy = "administratorPlus")
	List<Administrator> administrators;

}

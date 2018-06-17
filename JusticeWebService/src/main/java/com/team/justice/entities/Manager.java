package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "managers")
public class Manager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7919950489276008069L;
	@Id
	String email;
	String firstName;
	String secondName;
	String phone;

	@ManyToMany
	List<Administrator> administrators;

}

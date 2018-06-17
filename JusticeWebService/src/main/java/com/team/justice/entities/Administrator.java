package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "administrators")
public class Administrator implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3988637200540160802L;
	@Id
	String name;
	String password;

	@ManyToMany(mappedBy = "administrators")
	List<Tournament> tournaments;
	@ManyToMany(mappedBy = "administrators")
	List<Athlete> athletes;
	@ManyToMany(mappedBy = "administrators")
	List<Coach> coaches;
	@ManyToOne
	AdministratorPlus administratorPlus;
	@ManyToMany(mappedBy = "administrators")
	List<Manager> managers;
	@OneToMany(mappedBy = "administrator")
	List<User> users;
}

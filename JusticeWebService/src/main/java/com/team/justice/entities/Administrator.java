package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "administrators")
public class Administrator implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3988637200540160802L;
	@Id
	String name;
	@Setter
	String password;
	@Setter
	@ManyToMany(mappedBy = "administrators")
	List<Tournament> tournaments;
	@Setter
	@ManyToMany(mappedBy = "administrators")
	List<Athlete> athletes;
	@Setter
	@ManyToMany(mappedBy = "administrators")
	List<Coach> coaches;
	@Setter
	@ManyToOne
	AdministratorPlus administratorPlus;
	@Setter
	@ManyToMany(mappedBy = "administrators")
	List<Manager> managers;
	@Setter
	@OneToMany(mappedBy = "administrator")
	List<User> users;
}

package com.team.justice.entities;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "administrators")
public class Administrator {

	@Id
	String name;
	String password;

	@ManyToMany(mappedBy = "administrator")
	List<Tournament> tournaments;
	@ManyToMany
	List<Athlete> athletes;
	@ManyToMany
	List<Coach> coaches;
}

package com.team.justice.entities;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "judo")
public class Judo {

	@Id
	private String name;
	String rule;
	Integer timer;
	Integer score;
	
	@OneToMany(mappedBy = "judo")
	List<Tournament> tournaments;

}

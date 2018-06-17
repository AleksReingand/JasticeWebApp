package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "judo")
public class Judo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4507420581450977408L;
	@Id
	private String name;
	String rule;
	Integer timer;
	Integer score;
	
	@OneToMany(mappedBy = "judo")
	List<Tournament> tournaments;

}

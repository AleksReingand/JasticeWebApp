package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "judo")
public class Judo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4507420581450977408L;
	@Id
	private String name;
	@Setter
	String rule;
	@Setter
	Integer timer;
	@Setter
	Integer score;
	@Setter
	@OneToMany(mappedBy = "judo")
	List<Tournament> tournaments;

}

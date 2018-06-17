package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "sambo")
public class Sambo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1748870905745617261L;
	@Id
	private String name;
	String rule;
	Integer timer;
	Integer score;

	@OneToMany(mappedBy = "sambo")
	List<Tournament> tournaments;
}

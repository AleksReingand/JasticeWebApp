package com.team.justice.entities;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "sambo")
public class Sambo {
	@Id
	private String name;
	String rule;
	Integer timer;
	Integer score;

	@OneToMany(mappedBy = "sambo")
	List<Tournament> tournaments;
}

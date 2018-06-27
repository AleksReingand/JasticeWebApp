package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "sambo")
public class Sambo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1748870905745617261L;
	@Id
	private String name;
	@Setter
	String rule;
	@Setter
	Integer timer;
	@Setter
	Integer score;
	@Setter
	@OneToMany(mappedBy = "sambo")
	List<Tournament> tournaments;
}

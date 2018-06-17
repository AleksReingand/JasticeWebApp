package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "mats")
public class Mat implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8064318490378156659L;

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	Integer number;
	@OneToMany(mappedBy = "mat")
	List<Fight> fights;
	@OneToOne(mappedBy = "mat")
	Operator operator;
}

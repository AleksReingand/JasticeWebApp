package com.team.justice.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "weight categories")
public class WightCategoriesTour implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3669877018767962917L;

	@Id
	String nameCategory;

	@ManyToOne
	Tournament tournament;
}

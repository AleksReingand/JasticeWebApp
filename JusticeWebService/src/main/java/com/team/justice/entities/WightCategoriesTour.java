package com.team.justice.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "weight_categories")
public class WightCategoriesTour implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3669877018767962917L;

	@Id
	String nameCategory;
	@Setter
	@ManyToOne
	Tournament tournament;
}

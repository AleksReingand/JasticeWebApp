package com.team.justice.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "fights")
public class Fight {

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
}

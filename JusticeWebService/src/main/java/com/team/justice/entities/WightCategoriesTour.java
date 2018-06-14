package com.team.justice.entities;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="weight categories")
public class WightCategoriesTour {

	@Id
	String nameCategory;
	
	@OneToMany
	Tournament tournament;
}

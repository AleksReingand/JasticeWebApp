package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "adminPlus")
public class AdministratorPlus implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -834552631377943113L;
	@Id
	String name;
	@Setter
	String password;
	@Setter
	@OneToMany(mappedBy = "administratorPlus")
	List<Administrator> administrators;

}

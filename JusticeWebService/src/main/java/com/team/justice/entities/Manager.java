package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "managers")
public class Manager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7919950489276008069L;
	@Id
	String email;
	@Setter
	String firstName;
	@Setter
	String secondName;
	@Setter
	String phone;
	@Setter
	@ManyToMany
	List<Administrator> administrators;

}

package com.team.justice.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

import com.team.justice.api.enums.StatusCoach;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "coaches")
public class Coach implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 954543821761538658L;
	@Id
	String passport;
	@Setter
	String city;
	@Setter
	String firstName;
	@Setter
	String secondName;
	@Setter
	String phone;
	@Setter
	String email;
	@Setter
	String skype;
	@Setter
	@ManyToMany
	List<Club> clubs;
	@Setter
	@OneToMany
	List<Athlete> athletes;
	@Setter
	@Enumerated(EnumType.STRING)
	StatusCoach statusCoach;
	@Setter
	@ManyToMany
	List<Administrator> administrators;


}

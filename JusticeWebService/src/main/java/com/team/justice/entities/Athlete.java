package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.team.justice.api.enums.StatusGender;

import lombok.*;

import com.team.justice.api.enums.StatusAthlete;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "athletes")
public class Athlete implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6661840799693435426L;
	@Id
	String nickName;
	@Setter
	String passport;
	@Setter
	String firstName;
	@Setter
	String secondName;
	String birthday;
	@Setter
	String phone;
	@Setter
	String email;
	StatusGender gender;
	@Setter
	Double weigth;
	@Setter
	@Enumerated(EnumType.STRING)
	StatusAthlete statusAthlete;
	@Setter
	@ManyToOne
	Coach coach;
	@Setter
	@ManyToOne
	Club club;
	@Setter
	@ManyToMany
	List<Administrator> administrators;
	@Setter
	@OneToMany(mappedBy = "athlete")
	List<Fight> fights;

}

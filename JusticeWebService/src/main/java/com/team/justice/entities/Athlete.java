package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.team.justice.api.enums.StatusGender;

import lombok.*;

import com.team.justice.api.enums.StatusAthlete;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "athletes")
public class Athlete implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6661840799693435426L;
	@Id
	@Getter
	String nickName;
	@Getter
	@Setter
	String passport;
	@Getter
	@Setter
	String firstName;
	@Getter
	@Setter
	String secondName;
	@Getter
	String birthday;
	@Getter
	@Setter
	String phone;
	@Getter
	@Setter
	String email;
	@Getter
	StatusGender gender;
	@Getter
	@Setter
	Double weigth;
	@Getter
	@Setter
	@Enumerated(EnumType.STRING)
	StatusAthlete statusAthlete;
	@Getter
	@Setter
	@ManyToOne
	Coach coach;
	@Getter
	@Setter
	@ManyToOne
	Club club;
	@Getter
	@Setter
	@ManyToMany
	List<Administrator> administrators;
	@Getter
	@Setter
	@OneToMany(mappedBy = "athlete")
	List<Fight> fights;

}

package com.team.justice.entities;

import javax.persistence.*;

import com.team.justice.api.enums.StatusAthlete;

import lombok.Data;

@Data
@Entity
@Table(name = "tournament and athlete")
public class TourAthlete {

	@Id
	String nickName;
	@Enumerated(EnumType.STRING)
	StatusAthlete status;
	Integer place;

	@ManyToOne
	Tournament tournament;
	@ManyToOne
	Athlete athlete;
	@ManyToOne
	WightCategoriesTour wightCategoriesTour;

}

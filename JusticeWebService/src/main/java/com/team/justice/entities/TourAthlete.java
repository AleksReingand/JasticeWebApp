package com.team.justice.entities;

import java.io.Serializable;

import javax.persistence.*;

import com.team.justice.api.enums.StatusAthlete;

import lombok.Data;

@Data
@Entity
@Table(name = "tournament and athlete")
public class TourAthlete implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7491818574454663955L;
	@Id
	String nickName;
	@Enumerated(EnumType.STRING)
	StatusAthlete status;
	Integer place;

	@ManyToOne
	Tournament tournament;
	@ManyToOne
	Athlete athlete;

}

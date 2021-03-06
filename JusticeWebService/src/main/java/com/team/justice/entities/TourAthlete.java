package com.team.justice.entities;

import java.io.Serializable;

import javax.persistence.*;

import com.team.justice.api.enums.StatusAthlete;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "tournament and athlete")
public class TourAthlete implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7491818574454663955L;
	@Id
	String nickName;
	@Setter
	@Enumerated(EnumType.STRING)
	StatusAthlete status;
	@Setter
	Integer place;
	@Setter
	@ManyToOne
	Tournament tournament;
	@Setter
	@ManyToOne
	Athlete athlete;

}

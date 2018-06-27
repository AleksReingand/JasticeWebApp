package com.team.justice.entities;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Embeddable;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class TournamentId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1104610471094914443L;

	String city;
	String discipline;
	ZonedDateTime dataAndTime;

}

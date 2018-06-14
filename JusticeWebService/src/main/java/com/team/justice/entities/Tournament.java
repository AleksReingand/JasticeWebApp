package com.team.justice.entities;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;

import javax.persistence.*;

import com.team.justice.api.enums.StatusTournament;

import lombok.Data;

@Data
@Entity
@Table(name = "tournaments")
public class Tournament implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5211450717613911332L;
	@Column
	@EmbeddedId
	private TournamentId tournamentId;

	String title;
	ZonedDateTime dateAndTime;
	Integer mat;
	@Enumerated(EnumType.STRING)
	StatusTournament stutus;

	@OneToMany(mappedBy = "tournament")
	List<TourAthlete> tourAthletes;
	@ManyToOne
	Address address;
	@ManyToOne
	Sambo sambo;
	@ManyToOne
	Judo judo;
	@ManyToMany
	Administrator administrator;
	@OneToMany(mappedBy = "tournament")
	List<Fight> fights;
	@OneToMany(mappedBy = "tournament")
	List<WightCategoriesTour> wightCategoriesTour;

}

package com.team.justice.entities;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.List;

import javax.persistence.*;

import com.team.justice.api.enums.StatusTournament;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
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
	@Setter
	String title;
	@Setter
	ZonedDateTime dateAndTime;
	@Setter
	Integer mat;
	@Setter
	@Enumerated(EnumType.STRING)
	StatusTournament stutus;
	@Setter
	@OneToMany(mappedBy = "tournament")
	List<TourAthlete> tourAthletes;
	@Setter
	@ManyToOne
	Address address;
	@Setter
	@ManyToOne
	Sambo sambo;
	@Setter
	@ManyToOne
	Judo judo;
	@Setter
	@ManyToMany
	List<Administrator> administrators;
	@Setter
	@OneToMany(mappedBy = "tournament")
	List<Fight> fights;
	@Setter
	@OneToMany(mappedBy = "tournament")
	List<WightCategoriesTour> wightCategoriesTour;

}

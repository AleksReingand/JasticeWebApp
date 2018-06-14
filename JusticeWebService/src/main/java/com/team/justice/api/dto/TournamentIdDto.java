package com.team.justice.api.dto;

import java.time.ZonedDateTime;

public class TournamentIdDto {

	String city;
	String discipline;
	ZonedDateTime dateAndTime;

	public TournamentIdDto() {
		super();
	}

	public TournamentIdDto(String city, String discipline, ZonedDateTime dateAndTime) {
		super();
		this.city = city;
		this.discipline = discipline;
		this.dateAndTime = dateAndTime;
	}

	public String getCity() {
		return city;
	}

	public String getDiscipline() {
		return discipline;
	}

	public ZonedDateTime getDateAndTime() {
		return dateAndTime;
	}

}

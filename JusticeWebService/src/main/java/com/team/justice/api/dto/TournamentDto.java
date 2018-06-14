package com.team.justice.api.dto;

import java.time.ZonedDateTime;

import com.team.justice.api.enums.StatusTournament;

public class TournamentDto {
	TournamentIdDto tournamentIdDto;
	String title;
	ZonedDateTime timeAndData;
	Integer mat;
	StatusTournament status;

	public TournamentDto() {
		super();
	}

	public TournamentDto(TournamentIdDto tournamentIdDto, String title, ZonedDateTime timeAndData, Integer mat,
			StatusTournament status) {
		super();
		this.tournamentIdDto = tournamentIdDto;
		this.title = title;
		this.timeAndData = timeAndData;
		this.mat = mat;
		this.status = status;
	}

	public TournamentIdDto getTournamentIdDto() {
		return tournamentIdDto;
	}

	public String getTitle() {
		return title;
	}

	public ZonedDateTime getTimeAndData() {
		return timeAndData;
	}

	public Integer getMat() {
		return mat;
	}

	public StatusTournament getStatus() {
		return status;
	}

}

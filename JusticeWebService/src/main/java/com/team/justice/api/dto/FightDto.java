package com.team.justice.api.dto;

public class FightDto {

	String tournamentId;
	String fightResultDto;
	Integer matId;

	public FightDto() {
		super();
	}

	public FightDto(String tournamentId, String fightResultDto, Integer matId) {
		super();
		this.tournamentId = tournamentId;
		this.fightResultDto = fightResultDto;
		this.matId = matId;
	}

	public String getTournamentId() {
		return tournamentId;
	}

	public String getFightResultDto() {
		return fightResultDto;
	}

	public Integer getMatId() {
		return matId;
	}

}

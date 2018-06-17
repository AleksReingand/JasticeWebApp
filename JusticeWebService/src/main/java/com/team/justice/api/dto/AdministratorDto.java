package com.team.justice.api.dto;

import java.util.List;

public class AdministratorDto {

	String name;
	String password;
	List<String> managerIds;
	List<String> userIds;
	List<TournamentIdDto> tournamentsIds;
	List<String> nickNameAthletes;
	List<String> coachPassports;

	public AdministratorDto() {
		super();
	}

	public AdministratorDto(String name, String password, List<String> managerIds, List<String> userIds,
			List<TournamentIdDto> tournamentsIds, List<String> nickNameAthletes, List<String> coachPassports) {
		super();
		this.name = name;
		this.password = password;
		this.managerIds = managerIds;
		this.userIds = userIds;
		this.tournamentsIds = tournamentsIds;
		this.nickNameAthletes = nickNameAthletes;
		this.coachPassports = coachPassports;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public List<String> getManagerIds() {
		return managerIds;
	}

	public List<String> getUserIds() {
		return userIds;
	}

	public List<TournamentIdDto> getTournamentsIds() {
		return tournamentsIds;
	}

	public List<String> getNickNameAthletes() {
		return nickNameAthletes;
	}

	public List<String> getCoachPassports() {
		return coachPassports;
	}

}

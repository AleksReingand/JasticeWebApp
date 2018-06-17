package com.team.justice.api.dto;

import com.team.justice.api.enums.StatusAthlete;

public class TourAthleteDto {

	String nickName;
	StatusAthlete status;
	Integer place;

	public TourAthleteDto() {
		super();
	}

	public TourAthleteDto(String nickName, StatusAthlete status, Integer place) {
		super();
		this.nickName = nickName;
		this.status = status;
		this.place = place;
	}

	public String getNickName() {
		return nickName;
	}

	public StatusAthlete getStatus() {
		return status;
	}

	public Integer getPlace() {
		return place;
	}

}

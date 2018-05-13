package com.team.justice.api.dto;

import java.util.List;

public class ClubDto {

	public ClubIdDto id;
	public List<String> couchePassports;
	public List<String> athleteNickNames;

	public ClubDto() {
		super();
	}

	public ClubIdDto getId() {
		return id;
	}

	public List<String> getCouchePassports() {
		return couchePassports;
	}

	public List<String> getAthleteNickNames() {
		return athleteNickNames;
	}

}

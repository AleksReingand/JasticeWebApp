package com.team.justice.api.dto;

import java.util.List;

import com.team.justice.api.enums.StatusCoach;

import lombok.Getter;

@Getter
public class CoachDto {

	public String passport;
	public String city;
	public String firstName;
	public String secondName;
	public String phone;
	public String email;
	public String skype;
	public ClubIdDto clubIdDto;
	public List<String> athleteNickNames;
	public StatusCoach statusCouch;

	public CoachDto() {
		super();
	}

	public CoachDto(String passport, String city, String firstName, String secondName, String phone, String email,
			String skype, ClubIdDto clubIdDto, List<String> athleteNickNames, StatusCoach statusCouch) {
		super();
		this.passport = passport;
		this.city = city;
		this.firstName = firstName;
		this.secondName = secondName;
		this.phone = phone;
		this.email = email;
		this.skype = skype;
		this.clubIdDto = clubIdDto;
		this.athleteNickNames = athleteNickNames;
		this.statusCouch = statusCouch;
	}

}

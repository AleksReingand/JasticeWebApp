package com.team.justice.api.dto;

import java.util.List;

public class CouchDto {

	public String passport;
	public String firstName;
	public String secondName;
	public String phone;
	public String email;
	public String skype;
	public ClubDto club;
	public List<String> athleteNickNames;

	public CouchDto() {
		super();
	}

	public CouchDto(String passport, String firstName, String secondName, String phone, String email, String skype,
			ClubDto club, List<String> athleteNickNames) {
		super();
		this.passport = passport;
		this.firstName = firstName;
		this.secondName = secondName;
		this.phone = phone;
		this.email = email;
		this.skype = skype;
		this.club = club;
		this.athleteNickNames = athleteNickNames;
	}

	public String getPassport() {
		return passport;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getSkype() {
		return skype;
	}

	public ClubDto getClub() {
		return club;
	}

	public List<String> getAthleteNickNames() {
		return athleteNickNames;
	}

}

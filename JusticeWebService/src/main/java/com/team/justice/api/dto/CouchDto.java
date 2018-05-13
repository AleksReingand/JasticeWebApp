package com.team.justice.api.dto;

import java.util.List;

public class CouchDto {

	public String passport;
	public String city;
	public String firstName;
	public String secondName;
	public String phone;
	public String email;
	public String skype;
	public String clubName;
	public List<String> athleteNickNames;

	public CouchDto() {
		super();
	}

	public CouchDto(String passport, String city, String firstName, String secondName, String phone, String email,
			String skype, String clubName, List<String> athleteNickNames) {
		super();
		this.passport = passport;
		this.city = city;
		this.firstName = firstName;
		this.secondName = secondName;
		this.phone = phone;
		this.email = email;
		this.skype = skype;
		this.clubName = clubName;
		this.athleteNickNames = athleteNickNames;
	}

	public String getPassport() {
		return passport;
	}

	public String getCity() {
		return city;
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

	public String getClubName() {
		return clubName;
	}

	public List<String> getAthleteNickNames() {
		return athleteNickNames;
	}

}

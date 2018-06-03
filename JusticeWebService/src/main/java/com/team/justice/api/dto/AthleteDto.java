package com.team.justice.api.dto;

import com.team.justice.api.enums.StatusAthlete;

public class AthleteDto {

	public String nickName;
	public String passport;
	public String firstName;
	public String secondName;
	public String birthday;
	public String phone;
	public String email;
	public boolean gender;
	public double weigth;
	public StatusAthlete statusAthlete;
	public String passportCoach;
	public String clubName;
	public String city;

	public AthleteDto() {
		super();
	}

	public AthleteDto(String nickName, String passport, String firstName, String secondName, String birthday,
			String phone, String email, boolean gender, double weigth, StatusAthlete statusAthlete,
			String passportCoach, String clubName, String city) {
		super();
		this.nickName = nickName;
		this.passport = passport;
		this.firstName = firstName;
		this.secondName = secondName;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.weigth = weigth;
		this.passportCoach = passportCoach;
		this.clubName = clubName;
		this.statusAthlete = statusAthlete;
		this.city = city;
	}

	public String getNickName() {
		return nickName;
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

	public String getBirthday() {
		return birthday;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public boolean isGender() {
		return gender;
	}

	public double getWeigth() {
		return weigth;
	}

	public String getPassportCoach() {
		return passportCoach;
	}

	public String getClubName() {
		return clubName;
	}

	public StatusAthlete getStatusAthlete() {
		return statusAthlete;
	}

	public String getCity() {
		return city;
	}

}

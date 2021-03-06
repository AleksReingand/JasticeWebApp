package com.team.justice.api.dto;

import com.team.justice.api.enums.StatusGender;
import com.team.justice.api.enums.StatusAthlete;

public class AthleteDto {

	public String nickName;
	public String passport;
	public String firstName;
	public String secondName;
	public String birthday;
	public String phone;
	public String email;
	public StatusGender gender;
	public double weigth;
	public StatusAthlete statusAthlete;
	public String passportCoach;
	public String clubName;
	public String city;

	public AthleteDto() {
		super();
	}

	public AthleteDto(String nickName, String passport, String firstName, String secondName, String birthday,
			String phone, String email, StatusGender gender, double weigth, StatusAthlete statusAthlete,
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
		this.statusAthlete = statusAthlete;
		this.passportCoach = passportCoach;
		this.clubName = clubName;
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

	public StatusGender getGender() {
		return gender;
	}

	public double getWeigth() {
		return weigth;
	}

	public StatusAthlete getStatusAthlete() {
		return statusAthlete;
	}

	public String getPassportCoach() {
		return passportCoach;
	}

	public String getClubName() {
		return clubName;
	}

	public String getCity() {
		return city;
	}

}

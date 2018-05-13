package com.team.justice.api.dto;

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
	public String firstNameCouch;
	public String secondNameCouch;
	public String clubName;

	public AthleteDto() {
		super();
	}

	public AthleteDto(String nickName, String passport, String firstName, String secondName, String birthday,
			String phone, String email, boolean gender, double weigth, String firstNameCouch, String secondNameCouch,
			String clubName) {
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
		this.firstNameCouch = firstNameCouch;
		this.secondNameCouch = secondNameCouch;
		this.clubName = clubName;
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

	public String getFirstNameCouch() {
		return firstNameCouch;
	}

	public String getSecondNameCouch() {
		return secondNameCouch;
	}

	public String getClubName() {
		return clubName;
	}

	

}

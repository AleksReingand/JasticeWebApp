package com.team.justice.api.dto;

public class AthleteDto {

	public String nickName;
	public String passport;
	public String firstName;
	public String secondName;
	public String phone;
	public String eMail;
	public boolean gender;
	public double weigth;

	public AthleteDto() {
		super();
	}

	public AthleteDto(String nickName, String passport, String firstName, String secondName, String phone, String eMail,
			boolean gender, double weigth) {
		super();
		this.nickName = nickName;
		this.passport = passport;
		this.firstName = firstName;
		this.secondName = secondName;
		this.phone = phone;
		this.eMail = eMail;
		this.gender = gender;
		this.weigth = weigth;
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

	public String getPhone() {
		return phone;
	}

	public String geteMail() {
		return eMail;
	}

	public boolean isGender() {
		return gender;
	}

	public double getWeigth() {
		return weigth;
	}

}

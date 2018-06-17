package com.team.justice.api.dto;

public class ManagerDto {

	String firstName;
	String secondName;
	String phone;
	String email;

	public ManagerDto() {
		super();
	}

	public ManagerDto(String firstName, String secondName, String phone, String email) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.phone = phone;
		this.email = email;
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

}

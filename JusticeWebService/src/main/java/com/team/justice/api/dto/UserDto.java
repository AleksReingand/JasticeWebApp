package com.team.justice.api.dto;

public class UserDto {

	String name;
	String email;

	public UserDto() {
		super();
	}

	public UserDto(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}

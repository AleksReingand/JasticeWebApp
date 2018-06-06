package com.team.justice.api.dto;

import lombok.Getter;

@Getter
public class ClubIdDto {

	public String title;
	public String city;

	public ClubIdDto() {
		super();
	}

	public ClubIdDto(String title, String city) {
		super();
		this.title = title;
		this.city = city;
	}

}

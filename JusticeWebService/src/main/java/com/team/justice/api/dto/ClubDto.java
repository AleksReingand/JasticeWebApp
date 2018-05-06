package com.team.justice.api.dto;

public class ClubDto {

	public ClubIdDto club;
	public String title;

	public ClubDto() {
		super();
	}

	public ClubDto(ClubIdDto club, String title) {
		super();
		this.club = club;
		this.title = title;
	}

	public ClubIdDto getClub() {
		return club;
	}

	public String getTitle() {
		return title;
	}

}

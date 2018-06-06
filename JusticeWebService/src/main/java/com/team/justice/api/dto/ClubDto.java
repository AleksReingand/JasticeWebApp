package com.team.justice.api.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class ClubDto {

	public ClubIdDto clubIdDto;
	public AddressDto addressDto;
	public List<String> couchePassports;
	public List<String> athleteNickNames;

	public ClubDto() {
		super();
	}

	public ClubDto(ClubIdDto clubIdDto, AddressDto addressDto, List<String> couchePassports,
			List<String> athleteNickNames) {
		super();
		this.clubIdDto = clubIdDto;
		this.addressDto = addressDto;
		this.couchePassports = couchePassports;
		this.athleteNickNames = athleteNickNames;
	}

}

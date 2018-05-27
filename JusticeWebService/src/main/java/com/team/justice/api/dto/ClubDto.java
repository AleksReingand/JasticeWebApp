package com.team.justice.api.dto;

import java.util.List;

public class ClubDto {

	public String title;
	public String nameCity;
	public AddressDto address;
	public List<String> couchePassports;
	public List<String> athleteNickNames;

	public ClubDto() {
		super();
	}

	public ClubDto(String title, String nameCity, AddressDto address, List<String> couchePassports,
			List<String> athleteNickNames) {
		super();
		this.title = title;
		this.nameCity = nameCity;
		this.address = address;
		this.couchePassports = couchePassports;
		this.athleteNickNames = athleteNickNames;
	}

	public AddressDto getAddress() {
		return address;
	}

	public String getTitle() {
		return title;
	}

	public String getNameCity() {
		return nameCity;
	}

	public List<String> getCouchePassports() {
		return couchePassports;
	}

	public List<String> getAthleteNickNames() {
		return athleteNickNames;
	}

}

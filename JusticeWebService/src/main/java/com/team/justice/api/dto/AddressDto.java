package com.team.justice.api.dto;

import java.util.List;

public class AddressDto {

	public double lon;
	public double lat;
	public String country;
	public String city;
	public String state;
	public String street;
	public int building;
	public String housing;
	public List<String> titleClubs;

	public AddressDto() {
		super();
	}

	public AddressDto(double lon, double lat, String country, String city, String state, String street, int building,
			String housing, List<String> titleClubs) {
		super();
		this.lon = lon;
		this.lat = lat;
		this.country = country;
		this.city = city;
		this.state = state;
		this.street = street;
		this.building = building;
		this.housing = housing;
		this.titleClubs = titleClubs;
	}

	public double getLat() {
		return lat;
	}

	public double getLon() {
		return lon;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getStreet() {
		return street;
	}

	public int getBuilding() {
		return building;
	}

	public String getHousing() {
		return housing;
	}

	public List<String> getTitleClubs() {
		return titleClubs;
	}

	

}

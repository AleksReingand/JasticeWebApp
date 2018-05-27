package com.team.justice.api.dto;

import java.util.List;

public class AddressDto {

	public double lat;
	public double lon;
	public String country;
	public String city;
	public String state;
	public String street;
	public int buinding;
	public String housing;
	public List<String> titleClubs;

	public AddressDto() {
		super();
	}

	public AddressDto(double lat, double lon, String country, String city, String state, String street, int buinding,
			String housing, List<String> titleClubs) {
		super();
		this.lat = lat;
		this.lon = lon;
		this.country = country;
		this.city = city;
		this.state = state;
		this.street = street;
		this.buinding = buinding;
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

	public int getBuinding() {
		return buinding;
	}

	public String getHousing() {
		return housing;
	}

	public List<String> getTitleClubs() {
		return titleClubs;
	}

	

}

package com.team.justice.api.dto;

import java.util.List;

public class AddressDto {

	public Double lon;
	public Double lat;
	public String country;
	public String city;
	public String state;
	public String street;
	public Integer building;
	public String housing;

	public AddressDto() {
		super();
	}

	public AddressDto(Double lon, Double lat, String country, String city, String state, String street, Integer building,
			String housing) {
		super();
		this.lon = lon;
		this.lat = lat;
		this.country = country;
		this.city = city;
		this.state = state;
		this.street = street;
		this.building = building;
		this.housing = housing;
	}

	public Double getLat() {
		return lat;
	}

	public Double getLon() {
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

	public Integer getBuilding() {
		return building;
	}

	public String getHousing() {
		return housing;
	}

}

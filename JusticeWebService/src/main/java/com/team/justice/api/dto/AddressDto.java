package com.team.justice.api.dto;


public class AddressDto {

	public CoordinatesIdDto coordinates;
	public String country;
	public String city;
	public String state;
	public String street;
	public int buinding;
	public String housing;

	public AddressDto() {
		super();
	}

	public AddressDto(CoordinatesIdDto coordinates, String country, String city, String state, String street, int buinding,
			String housing) {
		super();
		this.coordinates = coordinates;
		this.country = country;
		this.city = city;
		this.state = state;
		this.street = street;
		this.buinding = buinding;
		this.housing = housing;
	}

	public CoordinatesIdDto getCoordinates() {
		return coordinates;
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

}

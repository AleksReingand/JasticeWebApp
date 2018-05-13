package com.team.justice.api.dto;

public class CoordinatesIdDto {

	double lon;
	double lat;

	public CoordinatesIdDto() {
		super();
	}

	public CoordinatesIdDto(double lon, double lat) {
		super();
		this.lon = lon;
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public double getLat() {
		return lat;
	}

}

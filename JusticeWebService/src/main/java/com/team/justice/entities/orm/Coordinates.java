package com.team.justice.entities.orm;

import java.io.Serializable;

public class Coordinates implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2855555450161322821L;

	double longitude;
	double latitude;

	Address address;

	public Coordinates() {
		super();
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Coordinates [longitude=" + longitude + ", latitude=" + latitude + ", address=" + address + "]";
	}

}

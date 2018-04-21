package com.team.justice.entities.orm;

import java.io.Serializable;
import java.util.*;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5098305290878742129L;

	String country;
	String city;
	String state;
	String street;
	int house;

	Coordinates coordinates;

	List<Club> clubs;

	CurrentTournament currentTournament;

	public Address() {
		super();
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public List<Club> getClubs() {
		return clubs;
	}

	public CurrentTournament getCurrentTournament() {
		return currentTournament;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouse() {
		return house;
	}

	public void setHouse(int house) {
		this.house = house;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", state=" + state + ", street=" + street + ", house="
				+ house + "]";
	}

}

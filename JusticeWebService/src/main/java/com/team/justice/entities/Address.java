package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "addreses")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6961186160218442876L;

	@EmbeddedId
	private CoordinatesId id;

	String country;
	String city;
	String state;
	String street;
	int building;
	String housing;

	@OneToMany(mappedBy = "address")
	List<Club> clubs;

	public Address() {
		super();
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

	public int getBuilding() {
		return building;
	}

	public void setBuilding(int building) {
		this.building = building;
	}

	public String getHousing() {
		return housing;
	}

	public void setHousing(String housing) {
		this.housing = housing;
	}

	public List<Club> getClubs() {
		return clubs;
	}

	public void setClubs(List<Club> clubs) {
		this.clubs = clubs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", state=" + state + ", street=" + street
				+ ", building=" + building + ", housing=" + housing + ", clubs=" + clubs + "]";
	}

}

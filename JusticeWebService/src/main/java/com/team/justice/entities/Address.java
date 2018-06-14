package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "addreses")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6961186160218442876L;

	@EmbeddedId
	private CoordinatesId id;
	@NotNull
	String country;
	@NotNull
	String city;
	String state;
	@NotNull
	String street;
	@NotNull
	int building;
	String housing;

	@OneToMany(mappedBy = "address")
	List<Club> clubs;
	@OneToMany(mappedBy = "address")
	List<Tournament> tournaments;

	public Address() {
		super();
	}

	public Address(CoordinatesId id, @NotNull String country, @NotNull String city, String state,
			@NotNull String street, @NotNull int building, String housing, List<Club> clubs,
			List<Tournament> tournaments) {
		super();
		this.id = id;
		this.country = country;
		this.city = city;
		this.state = state;
		this.street = street;
		this.building = building;
		this.housing = housing;
		this.clubs = clubs;
		this.tournaments = tournaments;
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

	public List<Tournament> getTournaments() {
		return tournaments;
	}

	public void setTournaments(List<Tournament> tournaments) {
		this.tournaments = tournaments;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CoordinatesId getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

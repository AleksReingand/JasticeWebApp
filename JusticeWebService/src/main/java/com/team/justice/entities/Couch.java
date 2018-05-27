package com.team.justice.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

import com.team.justice.api.enums.StatusCouch;

@Entity
@Table(name = "couches")
public class Couch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 954543821761538658L;
	@Id
	String passport;
	String city;
	String firstName;
	String secondName;
	String phone;
	String email;
	String skype;
	@ManyToMany
	List<Club> clubs;
	@OneToMany(mappedBy = "couch")
	List<Athlete> athletes;
	@Enumerated(EnumType.STRING)
	StatusCouch statusCouch;

	public Couch() {
		super();
	}

	public Couch(String passport, String city, String firstName, String secondName, String phone, String email,
			String skype, List<Club> clubs, List<Athlete> athletes, StatusCouch statusCouch) {
		super();
		this.passport = passport;
		this.city = city;
		this.firstName = firstName;
		this.secondName = secondName;
		this.phone = phone;
		this.email = email;
		this.skype = skype;
		this.clubs = clubs;
		this.athletes = athletes;
		this.statusCouch = statusCouch;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public List<Club> getClubs() {
		return clubs;
	}

	public void setClubs(List<Club> clubs) {
		this.clubs = clubs;
	}

	public List<Athlete> getAthletes() {
		return athletes;
	}

	public void setAthletes(List<Athlete> athletes) {
		this.athletes = athletes;
	}

	public StatusCouch getStatusCouch() {
		return statusCouch;
	}

	public void setStatusCouch(StatusCouch statusCouch) {
		this.statusCouch = statusCouch;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPassport() {
		return passport;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((passport == null) ? 0 : passport.hashCode());
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
		Couch other = (Couch) obj;
		if (passport == null) {
			if (other.passport != null)
				return false;
		} else if (!passport.equals(other.passport))
			return false;
		return true;
	}

}

package com.team.justice.entities.orm;

import java.io.Serializable;
import java.util.*;

public class Couch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 954543821761538658L;

	String passport;
	String firstName;
	String secondName;
	String phone;
	String eMail;

	List<Administrator> administrators;

	Club club;

	List<Athlete> athletes;

	public Couch() {
		super();
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

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public List<Athlete> getAthletes() {
		return athletes;
	}

	public void setAthletes(List<Athlete> athletes) {
		this.athletes = athletes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPassport() {
		return passport;
	}

	public List<Administrator> getAdministrators() {
		return administrators;
	}

	@Override
	public String toString() {
		return "Couch [passport=" + passport + ", firstName=" + firstName + ", secondName=" + secondName + ", phone="
				+ phone + ", eMail=" + eMail + ", club=" + club + "]";
	}

}

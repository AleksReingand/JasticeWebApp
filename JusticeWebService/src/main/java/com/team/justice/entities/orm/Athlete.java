package com.team.justice.entities.orm;

import java.io.Serializable;
import java.util.*;

public class Athlete implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6661840799693435426L;

	String firstName;
	String secondName;
	String phone;
	String eMail;

	List<Administrator> administrators;

	Couch couch;

	Club club;

	CurrentTournament currentTournament;

	public Athlete() {
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

	public Couch getCouch() {
		return couch;
	}

	public void setCouch(Couch couch) {
		this.couch = couch;
	}

	public Club getClub() {
		return club;
	}

	public void setClub(Club club) {
		this.club = club;
	}

	public CurrentTournament getCurrentTournament() {
		return currentTournament;
	}

	public void setCurrentTournament(CurrentTournament currentTournament) {
		this.currentTournament = currentTournament;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Administrator> getAdministrators() {
		return administrators;
	}

	@Override
	public String toString() {
		return "Athlete [firstName=" + firstName + ", secondName=" + secondName + ", phone=" + phone + ", eMail="
				+ eMail + ", couch=" + couch + ", club=" + club + "]";
	}

}

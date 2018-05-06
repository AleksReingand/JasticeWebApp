package com.team.justice.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "couches")
public class Couch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 954543821761538658L;
	@Id
	String passport;
	String firstName;
	String secondName;
	String phone;
	String eMail;
	String skype;
	@ManyToOne
	Club club;
	@OneToMany(mappedBy = "couch")
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

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
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

	@Override
	public String toString() {
		return "Couch [passport=" + passport + ", firstName=" + firstName + ", secondName=" + secondName + ", phone="
				+ phone + ", eMail=" + eMail + ", skype=" + skype + ", club=" + club + "]";
	}

}

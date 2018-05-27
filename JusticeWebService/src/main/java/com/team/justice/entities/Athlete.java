package com.team.justice.entities;

import java.io.Serializable;

import javax.persistence.*;

import com.team.justice.api.enums.StatusAthlete;

@Entity
@Table(name = "athletes")
public class Athlete implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6661840799693435426L;
	@Id
	String nickName;
	String passport;
	String firstName;
	String secondName;
	String birthday;
	String phone;
	String email;
	boolean gender;
	double weigth;
	@Enumerated(EnumType.STRING)
	StatusAthlete statusAthlete;
	@ManyToOne
	Couch couch;
	@ManyToOne
	Club club;

	public Athlete() {
		super();
	}

	public Athlete(String nickName, String passport, String firstName, String secondName, String birthday, String phone,
			String email, boolean gender, double weigth, StatusAthlete statusAthlete, Couch couch, Club club) {
		super();
		this.nickName = nickName;
		this.passport = passport;
		this.firstName = firstName;
		this.secondName = secondName;
		this.birthday = birthday;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.weigth = weigth;
		this.statusAthlete = statusAthlete;
		this.couch = couch;
		this.club = club;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
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

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public StatusAthlete getStatusAthlete() {
		return statusAthlete;
	}

	public void setStatusAthlete(StatusAthlete statusAthlete) {
		this.statusAthlete = statusAthlete;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNickName() {
		return nickName;
	}

	public String getBirthday() {
		return birthday;
	}

	public boolean isGender() {
		return gender;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
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
		Athlete other = (Athlete) obj;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		return true;
	}

}

package com.team.justice.entities;

import java.io.Serializable;

import javax.persistence.*;

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
	@ManyToOne
	Couch couch;
	@ManyToOne
	Club club;

	public Athlete() {
		super();
	}

	public Athlete(String nickName, String passport, String firstName, String secondName, String birthday, String phone,
			String email, boolean gender, double weigth, Couch couch, Club club) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String geteMail() {
		return email;
	}

	public void seteMail(String email) {
		this.email = email;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
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

	public boolean isGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Athlete [nickName=" + nickName + ", passport=" + passport + ", firstName=" + firstName + ", secondName="
				+ secondName + ", birthday=" + birthday + ", phone=" + phone + ", email=" + email + ", gender=" + gender
				+ ", weigth=" + weigth + ", couch=" + couch + ", club=" + club + "]";
	}

}

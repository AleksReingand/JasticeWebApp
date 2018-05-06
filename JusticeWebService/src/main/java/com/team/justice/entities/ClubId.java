package com.team.justice.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
@Embeddable
public class ClubId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6505283436819184122L;

	String title;
	String city;

	public ClubId() {
		super();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTitle() {
		return title;
	}

	public String getCity() {
		return city;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

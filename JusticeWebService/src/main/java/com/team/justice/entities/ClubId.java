package com.team.justice.entities;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class ClubId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6505283436819184122L;

	String title;
	String nameCity;

	public ClubId() {
		super();
	}

	public ClubId(String title, String nameCity) {
		super();
		this.title = title;
		this.nameCity = nameCity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameCity == null) ? 0 : nameCity.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		ClubId other = (ClubId) obj;
		if (nameCity == null) {
			if (other.nameCity != null)
				return false;
		} else if (!nameCity.equals(other.nameCity))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClubId [title=" + title + ", nameCity=" + nameCity + "]";
	}

}
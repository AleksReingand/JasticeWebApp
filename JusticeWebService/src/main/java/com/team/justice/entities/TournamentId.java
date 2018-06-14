package com.team.justice.entities;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Embeddable;

@Embeddable
public class TournamentId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1104610471094914443L;

	String city;
	String discipline;
	ZonedDateTime dataAndTime;

	public TournamentId() {
		super();
	}

	public TournamentId(String city, String discipline, ZonedDateTime dataAndTime) {
		super();
		this.city = city;
		this.discipline = discipline;
		this.dataAndTime = dataAndTime;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public ZonedDateTime getDataAndTime() {
		return dataAndTime;
	}

	public void setDataAndTime(ZonedDateTime dataAndTime) {
		this.dataAndTime = dataAndTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((dataAndTime == null) ? 0 : dataAndTime.hashCode());
		result = prime * result + ((discipline == null) ? 0 : discipline.hashCode());
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
		TournamentId other = (TournamentId) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (dataAndTime == null) {
			if (other.dataAndTime != null)
				return false;
		} else if (!dataAndTime.equals(other.dataAndTime))
			return false;
		if (discipline == null) {
			if (other.discipline != null)
				return false;
		} else if (!discipline.equals(other.discipline))
			return false;
		return true;
	}

}

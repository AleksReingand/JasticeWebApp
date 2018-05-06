package com.team.justice.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Entity
@Embeddable
public class CoordinatesId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5580580529205872269L;

	double lon;
	double lat;

	public CoordinatesId() {
		super();
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

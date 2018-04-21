package com.team.justice.entities.orm;

import java.io.Serializable;
import java.util.*;

public class Club implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7687675403066064279L;

	String title;

	List<Couch> couches;

	List<Athlete> athletes;

	Address address;

	public Club() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Couch> getCouches() {
		return couches;
	}

	public void setCouches(List<Couch> couches) {
		this.couches = couches;
	}

	public List<Athlete> getAthletes() {
		return athletes;
	}

	public void setAthletes(List<Athlete> athletes) {
		this.athletes = athletes;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Club [title=" + title + ", address=" + address + "]";
	}

}

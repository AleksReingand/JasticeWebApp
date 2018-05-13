package com.team.justice.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "clubs")
public class Club implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7687675403066064279L;

	@EmbeddedId
	private ClubId id;

	@ManyToOne
	Address address;
	@OneToMany(mappedBy = "club")
	List<Couch> couches;
	@OneToMany(mappedBy = "club")
	List<Athlete> athletes;

	public Club() {
		super();
	}

	public Club(ClubId id, Address address, List<Couch> couches, List<Athlete> athletes) {
		super();
		this.id = id;
		this.address = address;
		this.couches = couches;
		this.athletes = athletes;
	}

	public ClubId getId() {
		return id;
	}

	public Address getAddress() {
		return address;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

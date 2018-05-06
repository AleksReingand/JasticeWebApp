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

	ClubId clubId;
	String title;
	@ManyToOne
	Address address;
	@OneToMany(mappedBy = "club")
	List<Couch> couches;
	@OneToMany(mappedBy = "club")
	List<Athlete> athletes;

	public Club() {
		super();
	}

	public ClubId getClubId() {
		return clubId;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Club [title=" + title + "]";
	}

}

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
	@ManyToMany(mappedBy = "clubs")
	List<Coach> coaches;
	@OneToMany(mappedBy = "club")
	List<Athlete> athletes;

	public Club() {
		super();
	}

	public Club(ClubId id, Address address, List<Coach> coaches, List<Athlete> athletes) {
		super();
		this.id = id;
		this.address = address;
		this.coaches = coaches;
		this.athletes = athletes;
	}

	public ClubId getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

	public List<Coach> getCoaches() {
		return coaches;
	}

	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Club other = (Club) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}

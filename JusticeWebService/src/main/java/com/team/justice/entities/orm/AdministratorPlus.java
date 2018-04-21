package com.team.justice.entities.orm;

import java.io.Serializable;
import java.util.*;

public class AdministratorPlus implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5389474808394545886L;
	String name;
	String password;
	
	List<Tournament> tournaments;
	
	List<Administrator> administrators;

	public AdministratorPlus() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Tournament> getTournaments() {
		return tournaments;
	}

	public void setTournaments(List<Tournament> tournaments) {
		this.tournaments = tournaments;
	}

	public List<Administrator> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(List<Administrator> administrators) {
		this.administrators = administrators;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}

package com.team.justice.entities.orm;

import java.io.Serializable;
import java.util.*;

public class Administrator implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2303836855397319215L;

	String name;
	String password;

	AdministratorPlus administratorPlus;

	List<Couch> couches;

	List<Athlete> athletes;

	CurrentTournament currentTournament;

	PreRegistration preRegistration;

	MainRegistration mainRegistration;

	List<Manager> managers;

	List<User> users;

	List<Tournament> tournaments;

	Discipline discipline;

	public Administrator() {
		super();
	}

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
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

	public CurrentTournament getCurrentTournament() {
		return currentTournament;
	}

	public void setCurrentTournament(CurrentTournament currentTournament) {
		this.currentTournament = currentTournament;
	}

	public PreRegistration getPreRegistration() {
		return preRegistration;
	}

	public void setPreRegistration(PreRegistration preRegistration) {
		this.preRegistration = preRegistration;
	}

	public MainRegistration getMainRegistration() {
		return mainRegistration;
	}

	public void setMainRegistration(MainRegistration mainRegistration) {
		this.mainRegistration = mainRegistration;
	}

	public List<Manager> getManagers() {
		return managers;
	}

	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<Tournament> getTournaments() {
		return tournaments;
	}

	public void setTournaments(List<Tournament> tournaments) {
		this.tournaments = tournaments;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public AdministratorPlus getAdministratorPlus() {
		return administratorPlus;
	}

	@Override
	public String toString() {
		return "Administrator [name=" + name + ", password=" + password + "]";
	}

}

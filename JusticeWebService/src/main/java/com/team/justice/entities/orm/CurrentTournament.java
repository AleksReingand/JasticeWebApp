package com.team.justice.entities.orm;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class CurrentTournament implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6677568578564995676L;

	String title;
	boolean property;
	LocalDate date;
	LocalTime time;
	int mat;

	List<WeightCategories> categories;

	List<Administrator> administrators;

	List<Tournament> tournaments;

	List<Athlete> athletes;

	Address address;

	Discipline discipline;

	List<Mat> mats;

	MainRegistration mainRegistration;

	PreRegistration preRegistration;

	public CurrentTournament() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isProperty() {
		return property;
	}

	public void setProperty(boolean property) {
		this.property = property;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public List<WeightCategories> getCategories() {
		return categories;
	}

	public void setCategories(List<WeightCategories> categories) {
		this.categories = categories;
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

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

	public List<Mat> getMats() {
		return mats;
	}

	public void setMats(List<Mat> mats) {
		this.mats = mats;
	}

	public MainRegistration getMainRegistration() {
		return mainRegistration;
	}

	public void setMainRegistration(MainRegistration mainRegistration) {
		this.mainRegistration = mainRegistration;
	}

	public PreRegistration getPreRegistration() {
		return preRegistration;
	}

	public void setPreRegistration(PreRegistration preRegistration) {
		this.preRegistration = preRegistration;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Administrator> getAdministrators() {
		return administrators;
	}

	public List<Tournament> getTournaments() {
		return tournaments;
	}

	@Override
	public String toString() {
		return "CurrentTournament [title=" + title + ", property=" + property + ", date=" + date + ", time=" + time
				+ ", mat=" + mat + ", categories=" + categories + ", address=" + address + ", discipline=" + discipline
				+ "]";
	}

}

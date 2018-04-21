package com.team.justice.entities.orm;

import java.io.Serializable;
import java.util.*;

public class Discipline implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2038323788563128217L;

	List<Sambo> sambos;

	List<Judo> judos;

	public Discipline() {
		super();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Sambo> getSambos() {
		return sambos;
	}

	public List<Judo> getJudos() {
		return judos;
	}

	@Override
	public String toString() {
		return "Discipline [sambos=" + sambos + ", judos=" + judos + "]";
	}

}

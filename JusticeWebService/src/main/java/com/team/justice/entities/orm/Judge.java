package com.team.justice.entities.orm;

import java.io.Serializable;

public class Judge implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3827905600349503704L;

	String name;
	int score;

	Operator operator;

	public Judge() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Judge [name=" + name + ", score=" + score + ", operator=" + operator + "]";
	}

}

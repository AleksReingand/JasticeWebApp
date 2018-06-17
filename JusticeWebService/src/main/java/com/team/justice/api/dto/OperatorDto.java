package com.team.justice.api.dto;

public class OperatorDto {

	Integer number;
	String name;

	public OperatorDto() {
		super();
	}

	public OperatorDto(Integer number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

}

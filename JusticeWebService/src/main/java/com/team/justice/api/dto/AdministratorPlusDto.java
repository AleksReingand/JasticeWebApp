package com.team.justice.api.dto;

import java.util.List;

public class AdministratorPlusDto {

	String name;
	String password;
	List<String> namesAdmin;

	public AdministratorPlusDto() {
		super();
	}

	public AdministratorPlusDto(String name, String password, List<String> namesAdmin) {
		super();
		this.name = name;
		this.password = password;
		this.namesAdmin = namesAdmin;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public List<String> getNamesAdmin() {
		return namesAdmin;
	}

}

package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "addreses")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6961186160218442876L;

	@Getter
	@EmbeddedId
	private CoordinatesId id;
	@NotNull
	@Getter
	@Setter
	String country;
	@Getter
	@Setter
	@NotNull
	String city;
	@Getter
	@Setter
	String state;
	@Getter
	@Setter
	@NotNull
	String street;
	@Getter
	@Setter
	@NotNull
	int building;
	@Getter
	@Setter
	String housing;

	@Getter
	@Setter
	@OneToMany(mappedBy = "address")
	List<Club> clubs;
	@Getter
	@Setter
	@OneToMany(mappedBy = "address")
	List<Tournament> tournaments;

}

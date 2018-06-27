package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "addreses")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6961186160218442876L;
	@EmbeddedId
	private CoordinatesId id;
	@Setter
	String country;
	@Setter
	String city;
	@Setter
	String state;
	@Setter
	String street;
	@Setter
	int building;
	@Setter
	String housing;
	@Setter
	@OneToMany(mappedBy = "address")
	List<Club> clubs;
	@Setter
	@OneToMany(mappedBy = "address")
	List<Tournament> tournaments;

}

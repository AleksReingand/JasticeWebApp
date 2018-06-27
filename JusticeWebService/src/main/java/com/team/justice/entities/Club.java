package com.team.justice.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "clubs")
public class Club implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7687675403066064279L;
	@EmbeddedId
	private ClubId id;
	@Setter
	@ManyToOne
	Address address;
	@Setter
	@ManyToMany
	List<Coach> coaches;
	@Setter
	@OneToMany(mappedBy = "club")
	List<Athlete> athletes;

}

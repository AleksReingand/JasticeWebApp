package com.team.justice.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class ClubId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6505283436819184122L;

	String title;
	String nameCity;

}
package com.team.justice.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class CoordinatesId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5580580529205872269L;

	Double lon;
	Double lat;

}

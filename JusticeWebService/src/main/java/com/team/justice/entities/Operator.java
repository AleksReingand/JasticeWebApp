package com.team.justice.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "operators")
public class Operator implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 7210510610071091912L;

	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Setter
	Integer number;
	@Setter
	String name;
	@Setter
	@OneToOne
	Mat mat;

}

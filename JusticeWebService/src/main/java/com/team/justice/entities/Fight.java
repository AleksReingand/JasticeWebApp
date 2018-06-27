package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "fights")
public class Fight implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7585223252772370504L;
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Setter
	@ManyToOne
	Tournament tournament;
	@Setter
	@ManyToOne
	Athlete athlete;
	@Setter
	@ManyToOne
	Mat mat;
	@Setter
	@OneToMany(mappedBy = "fight")
	List<FightResult> fightResults;

}

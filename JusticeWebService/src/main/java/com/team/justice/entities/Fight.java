package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fights")
public class Fight implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7585223252772370504L;

	@Getter
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Getter
	@Setter
	@ManyToOne
	Tournament tournament;
	@Getter
	@Setter
	@ManyToOne
	Athlete athlete;
	@Getter
	@Setter
	@ManyToOne
	Mat mat;
	@Getter
	@Setter
	@OneToMany(mappedBy = "fight")
	List<FightResult> fightResults;

}

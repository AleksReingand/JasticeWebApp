package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "result_fight")
public class FightResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1479057707117927602L;
	@Id
	String nickName;
	@Setter
	Double timeFight;
	@Setter
	Integer score;
	@Setter
	Integer shido;
	@Setter
	Double osaekomi;
	@Setter
	@ManyToMany
	List<Athlete> athletes;
	@Setter
	@ManyToOne
	Fight fight;

}

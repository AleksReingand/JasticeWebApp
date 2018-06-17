package com.team.justice.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "result_fight")
public class FightResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1479057707117927602L;

	@Id
	String nickName;
	Double timeFight;
	Integer score;
	Integer shido;
	Double osaekomi;

	@ManyToMany
	List<Athlete> athletes;
	@ManyToOne
	Fight fight;

}

package com.team.justice.api.dto;

public class FightResultDto {

	String nickName;
	Double timeFight;
	Integer score;
	Integer shido;
	Double osaekomi;

	public FightResultDto() {
		super();
	}

	public FightResultDto(String nickName, Double timeFight, Integer score, Integer shido, Double osaekomi) {
		super();
		this.nickName = nickName;
		this.timeFight = timeFight;
		this.score = score;
		this.shido = shido;
		this.osaekomi = osaekomi;
	}

	public String getNickName() {
		return nickName;
	}

	public Double getTimeFight() {
		return timeFight;
	}

	public Integer getScore() {
		return score;
	}

	public Integer getShido() {
		return shido;
	}

	public Double getOsaekomi() {
		return osaekomi;
	}

}

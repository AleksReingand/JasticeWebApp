package com.team.justice.api.dto;

public class JudoDto {

	String title;
	String rule;
	Integer timer;
	Integer score;

	public JudoDto() {
		super();
	}

	public JudoDto(String title, String rule, Integer timer, Integer score) {
		super();
		this.title = title;
		this.rule = rule;
		this.timer = timer;
		this.score = score;
	}

	public String getTitle() {
		return title;
	}

	public String getRule() {
		return rule;
	}

	public Integer getTimer() {
		return timer;
	}

	public Integer getScore() {
		return score;
	}

}

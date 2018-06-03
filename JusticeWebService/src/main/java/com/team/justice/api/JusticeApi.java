package com.team.justice.api;

public interface JusticeApi {
	
	//Base URL coach "/coach"
	//POST
	String ADD_NEW_COACH = "/registration";
	String ADD_NEW_ATHLETE = "/athlete";
	String ADD_NEW_ADDRESS = "/address";
	//PUT
	String UPDATE_ATHLETE = "/athlete";
	//GET
	String SHOW_ATHLETE = "/athlete";
	String SHOW_ATHLETES = "/athletes";
	String ATHLETE_TO_TOURNAMENT = "/tourn/athlete";
	//DATA
	String ATHLETE_NICK_NAME = "nick";
	

}

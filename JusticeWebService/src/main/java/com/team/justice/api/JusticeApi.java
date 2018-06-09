package com.team.justice.api;

public interface JusticeApi {
	
	//Base URL "/app"
	//POST
	String ADD_NEW_COACH = "/coach";
	String ADD_NEW_ATHLETE = "/athlete";
	String ADD_NEW_ADDRESS = "/address";
	//PUT
	String UPDATE_ATHLETE = "/athlete";
	//GET
	String SHOW_ATHLETE = "/athlete";
	String SHOW_ATHLETES = "/athletes";
	String ATHLETE_TO_TOURNAMENT = "/tournament/athlete";
	//DATA
	String ATHLETE_NICK_NAME = "nick";
	

}

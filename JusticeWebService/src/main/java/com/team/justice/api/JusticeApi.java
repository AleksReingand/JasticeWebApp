package com.team.justice.api;

public interface JusticeApi {
	
	//Base URL couch "/couch"
	//POST
	String ADD_NEW_COUCH = "/registration";
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

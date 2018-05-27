package com.team.justice.interfaces;

import com.team.justice.api.dto.*;
import com.team.justice.api.enums.ReturnCode;

public interface IJusticeCouch {

	ReturnCode addNewCouch(CouchDto couchDto, ClubDto clubDto);
	
	ReturnCode updateProfileCouch(String passport, CouchDto couchDto);
	
	ReturnCode deleteProfileCouch(String passpart);
	
	ReturnCode addNewClub(ClubDto clubDto);

	ReturnCode addNewAthlete(AthleteDto athleteDto, ClubDto clubDto);
	
	ReturnCode updateProfileAthlete(String nickName, AthleteDto atleteDto);
	
	ReturnCode deleteAthlete(String nickName);
	
	Iterable<AthleteDto> showAthletes(String passport);
	
	AthleteDto showAthlete(String nickName);
	
	ReturnCode addAthleteToTourn(String nickName, TournamentDto tourn);


}

package com.team.justice.interfaces;

import com.team.justice.api.dto.*;
import com.team.justice.api.enums.ReturnCode;
import com.team.justice.entities.Athlete;

public interface IJusticeCouch {

	ReturnCode addNewCouch(CouchDto couch);
	
	ReturnCode updateProfileCouch(String passport);
	
	ReturnCode deleteProfileCouch(String passpart);
	
	ReturnCode addNewClub(ClubDto club);

	ReturnCode addNewAthlete(AthleteDto athlete);
	
	ReturnCode updateProfileAthlete(String nickName);
	
	ReturnCode deleteAthlete(String nickName);
	
	Iterable<AthleteDto> showAthletes(String passport);
	
	AthleteDto showAthlete(String nickName);
	
	ReturnCode addAthleteToTourn(String nickName, TournamentDto tourn);

}

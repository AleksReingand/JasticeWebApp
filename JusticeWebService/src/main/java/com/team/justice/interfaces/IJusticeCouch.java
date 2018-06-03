package com.team.justice.interfaces;

import com.team.justice.api.dto.*;
import com.team.justice.api.enums.ReturnCode;

public interface IJusticeCouch {

	ReturnCode addNewCoach(CoachDto coachDto);
	
	ReturnCode updateProfileCoach(CoachDto coachDto);
	
	ReturnCode deleteProfileCoach(String passport);
	
	ReturnCode addNewClub(ClubDto clubDto);

	ReturnCode addNewAthlete(AthleteDto athleteDto);
	
	ReturnCode updateProfileAthlete(AthleteDto atleteDto);
	
	ReturnCode deleteAthlete(String nickName);
	
	Iterable<AthleteDto> showAthletes(String passport);
	
	AthleteDto showAthlete(String nickName);
	
	ReturnCode addAthleteToTourn(String nickName, TournamentDto tourn);


}

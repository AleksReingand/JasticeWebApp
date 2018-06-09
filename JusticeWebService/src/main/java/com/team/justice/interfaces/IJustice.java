package com.team.justice.interfaces;

import java.util.List;

import com.team.justice.api.dto.*;
import com.team.justice.api.enums.ReturnCode;



//The interface application is common for all roles.

public interface IJustice {

	// Return current tournament, search in DB of status "current".
	TournamentDto showCurrentTourn();

	Iterable<TournamentDto> comingAllTourn();

	Iterable<TournamentDto> archiveTourn();

	ReturnCode subscribeNews(String email, String name);

	Iterable<ClubDto> showAllClubs();

	ReturnCode addNewCoach(CoachDto coachDto);

	ReturnCode updateProfileCoach(CoachDto coachDto);

	ReturnCode deleteProfileCoach(String passport);

	ReturnCode addNewClub(ClubDto clubDto);

	ReturnCode addNewAthlete(AthleteDto athleteDto);

	ReturnCode updateProfileAthlete(AthleteDto atleteDto);

	ReturnCode deleteAthlete(String nickName);

	Iterable<AthleteDto> showAthletes(String passport);

	AthleteDto showAthlete(String nickName);

	ReturnCode addAthleteToTourn(String nickName, TournamentDto tournamentDto);

	Iterable<AthleteDto> showAthletesOnStatRegistered();

	ReturnCode changeStatAthleteOfArraved(String idAthlete);
	
	ReturnCode addNewTournament(TournamentDto newTournamentDto);
	
	Iterable<AthleteDto> showAthletesOnStatArraved();
	
	ReturnCode sortAthlete(List<AthleteDto> athletesDto);
	
	ReturnCode addMats(Integer mats);
	
	Iterable<AthleteDto> manualChangeSort(List<AthleteDto> athletesDto);
	
	ReturnCode deleteMat(Integer idMat);
	
	TournamentDto embeddedCopyTourn(TournamentDto tournamentDto);
	
	ReturnCode changeStatTournament(String idTournament);
	
	MatDto showMat(Integer idMat);
	
	Iterable<CoachDto> showAllCoaches();	

	ReturnCode addNewAddress(AddressDto addressDto);

}

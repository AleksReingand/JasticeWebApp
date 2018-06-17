package com.team.justice.converter;

import com.team.justice.api.dto.*;
import com.team.justice.entities.*;

public class Converter {
	public static Coach coachDtoToEntity(CoachDto coachDto) {
		return null;
	}

	public static AthleteDto entityToAthleteDto(Athlete athlete) {
		AthleteDto athleteDto = new AthleteDto(athlete.getNickName(), athlete.getPassport(), athlete.getFirstName(),
				athlete.getSecondName(), athlete.getBirthday(), athlete.getPhone(), athlete.getEmail(), athlete.getGender(), athlete.getWeigth(),
				athlete.getStatusAthlete(), athlete.getCoach().getPassport(), athlete.getClub().getId().getTitle(),
				athlete.getClub().getAddress().getCity());
		return athleteDto;
	}
}

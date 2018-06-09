package com.team.justice.interfaces;

import com.team.justice.api.dto.AthleteDto;

public interface IJusticeOperator {
	
	Iterable<AthleteDto> callCouple(String idAthleteOne, String idAthleteTwo);
	

}

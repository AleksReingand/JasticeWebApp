package com.team.justice.web;

import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.team.justice.api.dto.*;
import com.team.justice.api.enums.StatusAthlete;
import com.team.justice.api.enums.StatusCoach;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JusticeWebServiceApplicationTests {

	@Before
	public void createData() {
		
		AddressDto addressDto = new AddressDto(11.111, 11.111, "Israel", "TelAviv", null, "Ben Gurion", 100, "A",
				Collections.emptyList());
		
		ClubDto clubDto = new ClubDto(new ClubIdDto("Israel", "Israel"), addressDto, Collections.emptyList(), Collections.emptyList());
		
		CoachDto coachDto = new CoachDto("12345", "Israel", "Aleks", "Reingand", "972506557376", "a.reingand@gmail.com",
				"AleksR", null, Collections.emptyList(), StatusCoach.ACTIVE);
		
		AthleteDto athleteDto = new AthleteDto("Ivan", "000000", "Ivan", "Ivanov", "12-12-2012", null, null, true, 54.3,
				StatusAthlete.ACTIVE, "12345", "Israel", "TelAviv");
	}

	@Test
	public void addNewCoach() {
		
	}
	@Test
	public void addNewAthlete() {
		
	}
	@Test
	public void addNewClub() {
		
	}
	@Test
	public void updateProfileCoach() {
		
	}
	@Test
	public void deleteProfileCoach() {
		
	}
	@Test
	public void updateProfileAthlete() {
		
	}
	@Test
	public void deleteAthlete() {
		
	}
	@Test
	public void addAthleteToTournament() {
		
	}

}

package com.team.justice.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.team.justice.api.JusticeApi;
import com.team.justice.api.dto.*;
import com.team.justice.api.enums.ReturnCode;
import com.team.justice.interfaces.IJustice;

@RestController
@RequestMapping("/app")
public class JasticeRestControl {
	@Autowired
	IJustice couches;

	@PostMapping(JusticeApi.ADD_NEW_COACH)
	public ReturnCode addNewCoach(@RequestBody CoachDto coachDto) {
		return couches.addNewCoach(coachDto);
	}

	@PostMapping(JusticeApi.ADD_NEW_ATHLETE)
	public ReturnCode addNewAthlete(@RequestBody AthleteDto athleteDto, Principal principal) {
		String name = principal.getName();
		return couches.addNewAthlete(athleteDto);
	}

	@GetMapping(JusticeApi.SHOW_ATHLETE)
	public AthleteDto athlete(@RequestParam(name = JusticeApi.ATHLETE_NICK_NAME) String nickName) {
		return couches.showAthlete(nickName);
	}

}

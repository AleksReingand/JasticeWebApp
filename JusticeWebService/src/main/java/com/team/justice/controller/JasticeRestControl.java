package com.team.justice.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.team.justice.api.JusticeApi;
import com.team.justice.api.dto.AthleteDto;
import com.team.justice.api.dto.*;
import com.team.justice.api.enums.ReturnCode;
import com.team.justice.interfaces.IJusticeCouch;
import com.team.justice.interfaces.IJusticeCummon;

@RestController
@RequestMapping("/coach")
public class JasticeRestControl {
	@Autowired
	IJusticeCouch couches;
	@Autowired
	IJusticeCummon common;

	@PostMapping(JusticeApi.ADD_NEW_COACH)
	public ReturnCode addNewCoach(@RequestBody CoachDto coachDto) {
		return couches.addNewCoach(coachDto);
	}

	@PostMapping(JusticeApi.ADD_NEW_ATHLETE)
	public ReturnCode addNewAthlete(@RequestBody AthleteDto athleteDto, Principal principal) {
		String name = principal.getName();
		return couches.addNewAthlete(athleteDto);
	}
	
	@PostMapping(JusticeApi.ADD_NEW_ADDRESS)
	public ReturnCode addNewAddress(@RequestBody AddressDto addressDto) {
		return common.addNewAddress(addressDto);
	}
		
	@GetMapping(JusticeApi.SHOW_ATHLETE)
	public AthleteDto athlete(@RequestParam(name = JusticeApi.ATHLETE_NICK_NAME) String nickName) {
		return couches.showAthlete(nickName);
	}

}

package com.team.justice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.team.justice.api.JusticeApi;
import com.team.justice.api.dto.AthleteDto;
import com.team.justice.api.dto.CouchDto;
import com.team.justice.api.enums.ReturnCode;
import com.team.justice.interfaces.IJusticeCouch;

@RestController
@RequestMapping("/couch")
public class JasticeRestControl {
	@Autowired
	IJusticeCouch couches;

	@PostMapping(JusticeApi.ADD_NEW_COUCH)
	public ReturnCode addNewCouch(@RequestBody CouchDto couch) {
		return couches.addNewCouch(couch);
	}

	@PostMapping(JusticeApi.ADD_NEW_ATHLETE)
	public ReturnCode addNewAthlete(@RequestBody AthleteDto athlete) {
		return couches.addNewAthlete(athlete);
	}
		
	@GetMapping(JusticeApi.SHOW_ATHLETE)
	public AthleteDto athlete(@RequestParam(name = JusticeApi.ATHLETE_NICK_NAME) String nickName) {
		return couches.showAthlete(nickName);
	}

}

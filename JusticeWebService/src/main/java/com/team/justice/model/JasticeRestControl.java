package com.team.justice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.team.justice.interfaces.IJustice;
import com.team.justice.api.*;
import com.team.justice.api.dto.*;
import com.team.justice.api.enums.ReturnCode;

@RestController
public class JasticeRestControl {
	@Autowired
	IJustice justice;

	@PostMapping(JusticeApi.ADD_NEW_COUCH)
	public ReturnCode addNewCouch(@RequestBody CouchDto couch) {
		return justice.addNewCouch(couch);
	}

	@PostMapping(JusticeApi.ADD_NEW_ATHLETE)
	public ReturnCode addNewAthlete(@RequestBody AthleteDto athlete) {
		return justice.addNewAthlete(athlete);
	}

	@PostMapping(JusticeApi.ADD_NEW_CLUB)
	public ReturnCode addNewClub(@RequestBody ClubDto club) {
		return justice.addNewClub(club);
	}

	@PostMapping(JusticeApi.ADD_NEW_ADDRESS)
	public ReturnCode addNewAddress(@RequestBody AddressDto address) {
		return justice.addNewAddress(address);
	}

}

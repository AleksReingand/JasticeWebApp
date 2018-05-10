package com.team.justice.handler;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.team.justice.api.dto.AddressDto;
import com.team.justice.api.dto.AthleteDto;
import com.team.justice.api.dto.ClubDto;
import com.team.justice.api.dto.CouchDto;
import com.team.justice.api.enums.ReturnCode;
import com.team.justice.interfaces.IJustice;

@Repository
public class JusticeHandler implements IJustice {
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public ReturnCode addNewCouch(CouchDto couch) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public ReturnCode addNewAthlete(AthleteDto athlete) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public ReturnCode addNewClub(ClubDto club) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public ReturnCode addNewAddress(AddressDto address) {
		// TODO Auto-generated method stub
		return null;
	}

}

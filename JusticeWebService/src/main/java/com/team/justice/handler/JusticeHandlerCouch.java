package com.team.justice.handler;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.team.justice.api.dto.*;
import com.team.justice.api.enums.ReturnCode;
import com.team.justice.entities.*;
import com.team.justice.interfaces.IJusticeCouch;

@Repository
public class JusticeHandlerCouch implements IJusticeCouch {
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public ReturnCode addNewCouch(CouchDto couch) {
		// TODO Auto-generated method stub
		if (em.find(Couch.class, couch.passport) != null) {
			return ReturnCode.COUCH_EXISTS;
		}

		if (em.find(Club.class, couch.club) == null) {

		}

		// em.persist(new Couch(couch.passport, couch.firstName, couch.secondName,
		// couch.phone, couch.email, couch.skype, club, athletes));
		return null;
	}

	@Override
	@Transactional
	public ReturnCode addNewAthlete(AthleteDto athlete) {

		if (em.find(Athlete.class, athlete.nickName) != null) {
			return ReturnCode.ATHLETE_EXISTS;
		}

		Couch couch = em.find(Couch.class, athlete.firstNameCouch);
		// TODO
		Club club = em.find(Club.class, athlete.clubName);
		// TODO

		em.persist(new Athlete(athlete.nickName, athlete.passport, athlete.firstName, athlete.secondName,
				athlete.birthday, athlete.phone, athlete.email, athlete.gender, athlete.weigth, couch, club));

		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode addNewClub(ClubDto club) {
		// TODO Auto-generated method stub
		if ((em.find(Club.class, club.id) != null)) {
			return ReturnCode.CLUB_EXISTS;
		}
		List<Couch> couches = new ArrayList<>();
		List<Athlete> athletes = new ArrayList<>();
		ClubId id = new ClubId(club.id.title, club.id.nameCity);
		Address address = new Address();
		em.persist(new Club(id, address, couches, athletes));
		return null;
	}

	@Override
	@Transactional
	public ReturnCode updateProfileCouch(String passport) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public ReturnCode deleteProfileCouch(String passpart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public ReturnCode updateProfileAthlete(String nickName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public ReturnCode deleteAthlete(String nickName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<AthleteDto> showAthletes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Athlete showAthlete(String nickName) {
		Athlete athlete = em.find(Athlete.class, nickName);

		return athlete;
	}

	private AthleteDto AthleteToAthleteDto(Athlete athlete) {
		AthleteDto athleteDto = new AthleteDto(athlete.getNickName(), athlete.getPassport(), athlete.getFirstName(),
				athlete.getSecondName(), athlete.getBirthday(), athlete.getPhone(), athlete.geteMail(),
				athlete.isGender(), athlete.getWeigth(), athlete.getCouch().getFirstName(), athlete.getCouch().getSecondName(),
				athlete.getClub().getId().getTitle());
		return athleteDto;
	}

	@Override
	@Transactional
	public ReturnCode addAthleteToTourn(String nickName, TournamentDto tourn) {
		// TODO Auto-generated method stub
		return null;
	}

}

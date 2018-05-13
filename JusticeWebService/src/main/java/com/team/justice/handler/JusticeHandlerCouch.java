package com.team.justice.handler;

import java.util.*;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.team.justice.api.dto.*;
import com.team.justice.api.enums.ReturnCode;
import com.team.justice.entities.*;
import com.team.justice.interfaces.IJusticeCouch;
import com.team.justice.interfaces.IJusticeCummon;

@Repository
public class JusticeHandlerCouch implements IJusticeCouch, IJusticeCummon {
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public ReturnCode addNewCouch(CouchDto couch) {

		if (em.find(Couch.class, couch.passport) != null) {
			return ReturnCode.COUCH_EXISTS;
		}

		ClubId clubId = new ClubId(couch.clubName, couch.city);
		Club club = em.find(Club.class, clubId);
		if (club == null) {
			// TODO (There is we can call function for create new club, but in parameter
			// clubDto)
		}
		List<Athlete> athletes = Collections.emptyList();

		em.persist(new Couch(couch.passport, couch.city, couch.firstName, couch.secondName, couch.phone, couch.email,
				couch.skype, club, athletes));
		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode addNewAthlete(AthleteDto athlete) {

		if (em.find(Athlete.class, athlete.nickName) != null) {
			return ReturnCode.ATHLETE_EXISTS;
		}

		Couch couch = em.find(Couch.class, athlete.firstNameCouch);
		// TODO (Key couch - it's passport. Inside athleteDto is nameCouch, how get
		// couch)
		Club club = em.find(Club.class, couch.getClub());
		// TODO (If not couch, what doing?)

		em.persist(new Athlete(athlete.nickName, athlete.passport, athlete.firstName, athlete.secondName,
				athlete.birthday, athlete.phone, athlete.email, athlete.gender, athlete.weigth, couch, club));

		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode addNewClub(ClubDto club) {
		if ((em.find(Club.class, club.id) != null)) {
			return ReturnCode.CLUB_EXISTS;
		}

		List<Couch> couches = Collections.emptyList();
		List<Athlete> athletes = Collections.emptyList();
		ClubId id = new ClubId(club.id.title, club.id.nameCity);
		// TODO (Here we need call function for create new Address)
		Address address = new Address();

		em.persist(new Club(id, address, couches, athletes));
		return null;
	}

	@Override
	@Transactional
	public ReturnCode updateProfileCouch(String passport) {
		Couch couch = em.find(Couch.class, passport);
		if (couch == null) {
			return ReturnCode.COUCH_NOT_FOUND;
		}
		// TODO (What doing setter)

		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode deleteProfileCouch(String passport) {
		// TODO (then I thought that the coach can have several clubs or strictly do
		// that the coach has only one club, with the removal of the coach, what happens
		// to the athletes? Does the field coach - null?)

		Couch couch = em.find(Couch.class, passport);
		if (couch == null) {
			return ReturnCode.COUCH_NOT_FOUND;
		}
		// TODO (Will be need change Club to List<Club>)
		Club club = em.find(Club.class, couch.getClub());
		List<Couch> couches = club.getCouches();
		couches.remove(couch);
		em.remove(couch);

		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode updateProfileAthlete(String nickName) {
		Athlete athlete = em.find(Athlete.class, nickName);
		if (athlete == null) {
			return ReturnCode.ATHLETE_NOT_FOUND;
		}

		// TODO (what doing setter)

		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode deleteAthlete(String nickName) {

		Athlete athlete = em.find(Athlete.class, nickName);
		if (athlete == null) {
			return ReturnCode.ATHLETE_NOT_FOUND;
		}
		Couch couch = em.find(Couch.class, athlete.getCouch());
		List<Athlete> athletesCouch = couch.getAthletes();
		athletesCouch.remove(athlete);
		// TODO (Can athlete have several clubs?)
		Club club = em.find(Club.class, athlete.getClub());
		List<Athlete> athletesClub = club.getAthletes();
		athletesClub.remove(athlete);
		em.remove(athlete);
		return ReturnCode.OK;
	}

	@Override
	public Iterable<AthleteDto> showAthletes(String pasport) {
		// TODO
		Couch couch = em.find(Couch.class, pasport);
		return couch.getAthletes().stream().map(x -> athleteToAthleteDto(x)).collect(Collectors.toList());
	}

	@Override
	public AthleteDto showAthlete(String nickName) {
		Athlete athlete = em.find(Athlete.class, nickName);
		AthleteDto athleteDto = athleteToAthleteDto(athlete);
		return athleteDto;
	}

	private AthleteDto athleteToAthleteDto(Athlete athlete) {
		AthleteDto athleteDto = new AthleteDto(athlete.getNickName(), athlete.getPassport(), athlete.getFirstName(),
				athlete.getSecondName(), athlete.getBirthday(), athlete.getPhone(), athlete.geteMail(),
				athlete.isGender(), athlete.getWeigth(), athlete.getCouch().getFirstName(),
				athlete.getCouch().getSecondName(), athlete.getClub().getId().getTitle());
		return athleteDto;
	}

	@Override
	@Transactional
	public ReturnCode addAthleteToTourn(String nickName, TournamentDto tourn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public ReturnCode addNewAddress(AddressDto address) {
		CoordinatesId coordinatesId = new CoordinatesId(address.coordinates.getLat(), address.coordinates.getLon());
		if (em.find(Address.class, coordinatesId) != null) {
			return ReturnCode.ADDRESS_EXISTS;
		}
		// TODO
		em.persist(new Address(coordinatesId, address.country, address.city, address.state, address.street,
				address.buinding, address.housing));
		return ReturnCode.OK;
	}

}

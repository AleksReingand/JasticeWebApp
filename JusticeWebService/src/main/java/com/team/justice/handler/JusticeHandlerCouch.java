package com.team.justice.handler;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.team.justice.api.dto.*;
import com.team.justice.api.enums.*;
import com.team.justice.entities.*;
import com.team.justice.interfaces.IJusticeCouch;
import com.team.justice.interfaces.IJusticeCummon;

@Repository
public class JusticeHandlerCouch implements IJusticeCouch, IJusticeCummon {
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public ReturnCode addNewCouch(CouchDto couchDto, ClubDto clubDto) {
		if (em.find(Couch.class, couchDto.passport) != null) {
			return ReturnCode.COUCH_EXISTS;
		}

		ClubId clubId = new ClubId(clubDto.title, clubDto.nameCity);
		Club club = em.find(Club.class, clubId);
		if (club == null) {
			addNewClub(clubDto);
		}
		List<Athlete> athletes = Collections.emptyList();
		List<Club> clubs = Collections.emptyList();
		// TODO check list clubs
		clubs.add(club);
		em.persist(new Couch(couchDto.passport, couchDto.city, couchDto.firstName, couchDto.secondName, couchDto.phone,
				couchDto.email, couchDto.skype, clubs, athletes, StatusCouch.ACTIVE));
		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode addNewAthlete(AthleteDto athleteDto, ClubDto clubDto) {
		if (em.find(Athlete.class, athleteDto.nickName) != null) {
			return ReturnCode.ATHLETE_EXISTS;
		}
		// search couch of ID
		Couch couch = em.find(Couch.class, athleteDto.passportCouch);
		// search club of ID
		ClubId clubId = new ClubId(clubDto.title, clubDto.nameCity);
		Club club = em.find(Club.class, clubId);
		// get list athletes from club
		List<Athlete> athletes = club.getAthletes();
		// create new athlete
		Athlete athlete = new Athlete(athleteDto.nickName, athleteDto.passport, athleteDto.firstName,
				athleteDto.secondName, athleteDto.birthday, athleteDto.phone, athleteDto.email, athleteDto.gender,
				athleteDto.weigth, StatusAthlete.ACTIVE, couch, club);
		// athlete to add in list
		athletes.add(athlete);
		// change list club's
		club.setAthletes(athletes);
		// to add athlete in DB
		em.persist(athlete);
		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode addNewClub(ClubDto clubDto) {
		ClubId clubId = new ClubId(clubDto.title, clubDto.nameCity);
		if ((em.find(Club.class, clubId) != null)) {
			return ReturnCode.CLUB_EXISTS;
		}
		AddressDto addressDto = clubDto.getAddress();
		// Address of ID search
		CoordinatesId coordinatesId = new CoordinatesId(addressDto.lon, addressDto.lat);
		Address address = em.find(Address.class, coordinatesId);
		// Address not exist, to create and to add new Address
		if (address == null) {
			addNewAddress(addressDto);
		}
		// Create new Club
		List<Couch> couches = Collections.emptyList();
		List<Athlete> athletes = Collections.emptyList();
		ClubId id = new ClubId(clubDto.title, clubDto.nameCity);
		Club club = new Club(id, address, couches, athletes);
		// Get list clubs from address and to add new Club in the list
		List<Club> clubs = address.getClubs();
		clubs.add(club);
		address.setClubs(clubs);
		// to add Club in DB
		em.persist(club);
		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode updateProfileCouch(String passport, CouchDto couchDto) {
		Couch couch = em.find(Couch.class, passport);
		if (couch == null) {
			return ReturnCode.COUCH_NOT_FOUND;
		}
		updateAndAddProfileCouch(couch, couchDto);

		return ReturnCode.OK;
	}

	private void updateAndAddProfileCouch(Couch couch, CouchDto couchDto) {
		String city = couch.getCity();
		String firstName = couch.getFirstName();
		String secondName = couch.getSecondName();
		String phone = couch.getPhone();
		String email = couch.getEmail();
		String skype = couch.getSkype();
		List<Club> clubs = couch.getClubs();
		// Check fields of update
		if (!(couchDto.city.equals(city))) {
			couch.setCity(city);
		}
		if (!(couchDto.firstName.equals(firstName))) {
			couch.setFirstName(couchDto.firstName);
		}
		if (!(couchDto.secondName.equals(secondName))) {
			couch.setSecondName(couchDto.secondName);
		}
		if (!(couchDto.phone.equals(phone))) {
			couch.setPhone(couchDto.phone);
		}
		if (!(couchDto.email.equals(email))) {
			couch.setEmail(couchDto.email);
		}
		if (!(couchDto.skype.equals(skype))) {
			couch.setSkype(couchDto.skype);
		}

		ClubId clubId = new ClubId(couchDto.clubName, couchDto.city);
		Club clubNew = em.find(Club.class, clubId);
		if (clubNew == null) {
			// TODO Address
			AddressDto address = new AddressDto();
			List<String> couchePassports = Collections.emptyList();
			List<String> athleteNickNames = Collections.emptyList();
			couchePassports.add(couch.getPassport());
			ClubDto clubDto = new ClubDto(clubId.getTitle(), clubId.getNameCity(), address, couchePassports,
					athleteNickNames);
			// TODO new Club
			addNewClub(clubDto);
		} else {

		}

	}

	@Override
	@Transactional
	public ReturnCode deleteProfileCouch(String passport) {
		Couch couch = em.find(Couch.class, passport);
		if (couch == null) {
			return ReturnCode.COUCH_NOT_FOUND;
		}
		List<Club> clubs = couch.getClubs();
		// TODO check delete couch from list club's
		for (Club club : clubs) {
			club.getCouches().remove(couch);
		}
		couch.setStatusCouch(StatusCouch.ARCHIVE);
		//TODO to discuss what to do with list athletes 
		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode updateProfileAthlete(String nickName, AthleteDto athleteDto) {
		Athlete athlete = em.find(Athlete.class, nickName);
		if (athlete == null) {
			return ReturnCode.ATHLETE_NOT_FOUND;
		}
		String passport = athlete.getPassport();
		String firstName = athlete.getFirstName();
		String secondName = athlete.getSecondName();
		String phone = athlete.getPhone();
		String email = athlete.getEmail();
		double weigth = athlete.getWeigth();
		Couch couch = athlete.getCouch();
		// Check fields of update
		if (!(athleteDto.passport.equals(passport))) {
			athlete.setPassport(athleteDto.passport);
		}
		if (!(athleteDto.firstName.equals(firstName))) {
			athlete.setFirstName(athleteDto.firstName);
		}
		if (!(athleteDto.secondName.equals(secondName))) {
			athlete.setSecondName(athleteDto.secondName);
		}
		if (!(athleteDto.phone.equals(phone))) {
			athlete.setPhone(athleteDto.phone);
		}
		if (!(athleteDto.email.equals(email))) {
			athlete.setEmail(athleteDto.email);
		}
		if (athleteDto.weigth != weigth) {
			athlete.setWeigth(athleteDto.weigth);
		}
		Couch newCouch = em.find(Couch.class, athleteDto.passportCouch);
		if (newCouch == null) {
			return ReturnCode.COUCH_NOT_FOUND;
		}
		if (!(newCouch.equals(couch))) {
			athlete.setCouch(newCouch);
		}
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
		Club club = em.find(Club.class, athlete.getClub());
		List<Athlete> athletesClub = club.getAthletes();
		athletesClub.remove(athlete);
		em.remove(athlete);
		return ReturnCode.OK;
	}

	@Override
	public Iterable<AthleteDto> showAthletes(String pasport) {
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
				athlete.getSecondName(), athlete.getBirthday(), athlete.getPhone(), athlete.getEmail(),
				athlete.isGender(), athlete.getWeigth(), athlete.getStatusAthlete(), athlete.getCouch().getPassport(),
				athlete.getClub().getId().getTitle());
		return athleteDto;
	}

	@Override
	@Transactional
	public ReturnCode addAthleteToTourn(String nickName, TournamentDto tournDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public ReturnCode addNewAddress(AddressDto addressDto) {
		CoordinatesId coordinatesId = new CoordinatesId(addressDto.lon, addressDto.lat);
		if (em.find(Address.class, coordinatesId) != null) {
			return ReturnCode.ADDRESS_EXISTS;
		}
		List<Club> clubs = Collections.emptyList();
		em.persist(new Address(coordinatesId, addressDto.country, addressDto.city, addressDto.state, addressDto.street,
				addressDto.building, addressDto.housing, clubs));
		return ReturnCode.OK;
	}

	@Override
	public Iterable<ClubDto> showAllClubs() {
		// TODO Auto-generated method stub
		return null;
	}

}

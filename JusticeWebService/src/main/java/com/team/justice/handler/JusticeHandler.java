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
import com.team.justice.interfaces.*;

@Repository
public class JusticeHandler implements IJustice {
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public ReturnCode addNewCoach(CoachDto coachDto) {
		if (em.find(Coach.class, coachDto.passport) != null) {
			return ReturnCode.COACH_EXISTS;
		}

		ClubId clubId = new ClubId(null, coachDto.city);
		Club club = em.find(Club.class, clubId);
		if (club == null) {
			return ReturnCode.CLUB_NOT_FOUND;
		}
		List<Athlete> athletes = Collections.emptyList();
		List<Club> clubs = Collections.emptyList();
		// TODO check list clubs
		clubs.add(club);
		em.persist(new Coach(coachDto.passport, coachDto.city, coachDto.firstName, coachDto.secondName, coachDto.phone,
				coachDto.email, coachDto.skype, clubs, athletes, StatusCoach.ACTIVE));
		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode addNewAthlete(AthleteDto athleteDto) {
		if (em.find(Athlete.class, athleteDto.nickName) != null) {
			return ReturnCode.ATHLETE_EXISTS;
		}
		// search club of ID
		ClubId clubId = new ClubId(athleteDto.clubName, athleteDto.city);
		Club club = em.find(Club.class, clubId);
		if (club == null) {
			return ReturnCode.CLUB_NOT_FOUND;
		}
		// search coach of ID
		Coach coach = em.find(Coach.class, athleteDto.passportCoach);
		// get list athletes from club
		List<Athlete> athletes = club.getAthletes();
		// create new athlete
		Athlete athlete = new Athlete(athleteDto.nickName, athleteDto.passport, athleteDto.firstName,
				athleteDto.secondName, athleteDto.birthday, athleteDto.phone, athleteDto.email, athleteDto.gender,
				athleteDto.weigth, StatusAthlete.ACTIVE, coach, club);
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

		ClubId clubId = new ClubId(clubDto.clubIdDto.title, clubDto.clubIdDto.city);
		if ((em.find(Club.class, clubId) != null)) {
			return ReturnCode.CLUB_EXISTS;
		}
		AddressDto addressDto = clubDto.addressDto;
		// Address of ID search
		CoordinatesId coordinatesId = new CoordinatesId(addressDto.lon, addressDto.lat);
		Address address = em.find(Address.class, coordinatesId);
		// Address not exist, to create and to add new Address
		if (address == null) {
			addNewAddress(addressDto);
		}
		// Create new Club
		List<Coach> coaches = Collections.emptyList();
		List<Athlete> athletes = Collections.emptyList();
		ClubId id = new ClubId(clubDto.clubIdDto.title, clubDto.clubIdDto.city);
		Club club = new Club(id, address, coaches, athletes);
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
	public ReturnCode updateProfileCoach(CoachDto coachDto) {
		Coach coach = em.find(Coach.class, coachDto.passport);
		if (coach == null) {
			return ReturnCode.COACH_NOT_FOUND;
		}

		return updateAndAddProfileCoach(coach, coachDto);

	}

	private ReturnCode updateAndAddProfileCoach(Coach coach, CoachDto coachDto) {
		String city = coach.getCity();
		String firstName = coach.getFirstName();
		String secondName = coach.getSecondName();
		String phone = coach.getPhone();
		String email = coach.getEmail();
		String skype = coach.getSkype();
		List<Club> clubs = coach.getClubs();
		// Check fields of update
		if (!(coachDto.city.equals(city))) {
			coach.setCity(city);
		}
		if (!(coachDto.firstName.equals(firstName))) {
			coach.setFirstName(coachDto.firstName);
		}
		if (!(coachDto.secondName.equals(secondName))) {
			coach.setSecondName(coachDto.secondName);
		}
		if (!(coachDto.phone.equals(phone))) {
			coach.setPhone(coachDto.phone);
		}
		if (!(coachDto.email.equals(email))) {
			coach.setEmail(coachDto.email);
		}
		if (!(coachDto.skype.equals(skype))) {
			coach.setSkype(coachDto.skype);
		}

		Club clubNew = em.find(Club.class, coachDto.clubIdDto);
		if (clubNew == null) {
			return ReturnCode.CLUB_NOT_FOUND;
		}
		clubs.add(clubNew);
		em.persist(coach);
		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode deleteProfileCoach(String passport) {
		Coach coach = em.find(Coach.class, passport);
		if (coach == null) {
			return ReturnCode.COACH_NOT_FOUND;
		}
		List<Club> clubs = coach.getClubs();
		// TODO check delete coach from list club's
		for (Club club : clubs) {
			club.getCoaches().remove(coach);
		}
		List<Athlete> athletes = coach.getAthletes();
		for (Athlete athlete : athletes) {
			// TODO maybe better change field Coach of status NOT_COACH.
			athlete.setCoach(null);
		}
		coach.setStatusCoach(StatusCoach.ARCHIVE);

		return ReturnCode.OK;
	}

	@Override
	@Transactional
	public ReturnCode updateProfileAthlete(AthleteDto athleteDto) {
		Athlete athlete = em.find(Athlete.class, athleteDto.nickName);
		if (athlete == null) {
			return ReturnCode.ATHLETE_NOT_FOUND;
		}
		String passport = athlete.getPassport();
		String firstName = athlete.getFirstName();
		String secondName = athlete.getSecondName();
		String phone = athlete.getPhone();
		String email = athlete.getEmail();
		double weigth = athlete.getWeigth();
		Coach coach = athlete.getCoach();
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
		Coach newCoach = em.find(Coach.class, athleteDto.passportCoach);
		if (newCoach == null) {
			return ReturnCode.COACH_NOT_FOUND;
		}
		if (!(newCoach.equals(coach))) {
			athlete.setCoach(newCoach);
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
		Coach coach = em.find(Coach.class, athlete.getCoach());
		List<Athlete> athletesCouch = coach.getAthletes();
		athletesCouch.remove(athlete);
		Club club = em.find(Club.class, athlete.getClub());
		List<Athlete> athletesClub = club.getAthletes();
		athletesClub.remove(athlete);
		em.remove(athlete);
		return ReturnCode.OK;
	}

	@Override
	public Iterable<AthleteDto> showAthletes(String pasport) {
		Coach coach = em.find(Coach.class, pasport);
		return coach.getAthletes().stream().map(x -> athleteToAthleteDto(x)).collect(Collectors.toList());
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
				athlete.isGender(), athlete.getWeigth(), athlete.getStatusAthlete(), athlete.getCoach().getPassport(),
				athlete.getClub().getId().getTitle(), athlete.getClub().getAddress().getCity());
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

	@Override
	public TournamentDto showCurrentTourn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<TournamentDto> comingAllTourn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<TournamentDto> archiveTourn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnCode subscribeNews(String email, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<AthleteDto> showAthletesOnStatRegistered() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnCode changeStatAthleteOfArraved(String idAthlete) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnCode addNewTournament(TournamentDto newTournamentDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<AthleteDto> showAthletesOnStatArraved() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnCode sortAthlete(List<AthleteDto> athletesDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnCode addMats(Integer mats) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<AthleteDto> manualChangeSort(List<AthleteDto> athletesDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnCode deleteMat(Integer idMat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TournamentDto embeddedCopyTourn(TournamentDto tournamentDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnCode changeStatTournament(String idTournament) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MatDto showMat(Integer idMat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<CoachDto> showAllCoaches() {
		// TODO Auto-generated method stub
		return null;
	}

}

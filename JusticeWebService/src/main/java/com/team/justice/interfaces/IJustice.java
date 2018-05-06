package com.team.justice.interfaces;

import com.team.justice.api.dto.*;
import com.team.justice.api.enums.ReturnCode;

public interface IJustice {

	ReturnCode addNewCouch(CouchDto couch);

	ReturnCode addNewAthlete(AthleteDto athlete);

	ReturnCode addNewClub(ClubDto club);

	ReturnCode addNewAddress(AddressDto address);

}

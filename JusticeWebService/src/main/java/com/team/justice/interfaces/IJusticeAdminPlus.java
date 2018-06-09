package com.team.justice.interfaces;

import com.team.justice.api.dto.*;
import com.team.justice.api.enums.ReturnCode;

public interface IJusticeAdminPlus {

	ReturnCode addAdministrator(AdministratorDto adminDto);

	ReturnCode daleteAdministrator(String idAdmin);

	Iterable<TournamentDto> tournaments();

	ReturnCode changeInfoTourn(String idTournament);

}

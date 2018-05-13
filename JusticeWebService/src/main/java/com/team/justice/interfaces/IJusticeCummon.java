package com.team.justice.interfaces;

import com.team.justice.api.dto.AddressDto;
import com.team.justice.api.enums.ReturnCode;

public interface IJusticeCummon {

	ReturnCode addNewAddress(AddressDto address);
}

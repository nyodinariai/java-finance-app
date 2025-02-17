package com.nwallet.nwallet.api.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.nwallet.nwallet.api.dtos.requests.BankRequest;
import com.nwallet.nwallet.api.dtos.responses.BankResponse;
import com.nwallet.nwallet.core.models.Bank;

@Mapper(componentModel = "spring")
public interface ApiBankMapper {

    @Mapping(target = "id", ignore = true)
    Bank toModel(BankRequest request);

    BankResponse toBankResponse(Bank model);

}

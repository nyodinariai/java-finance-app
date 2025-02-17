package com.nwallet.nwallet.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nwallet.nwallet.api.dtos.requests.BankRequest;
import com.nwallet.nwallet.api.dtos.responses.BankResponse;
import com.nwallet.nwallet.api.mappers.ApiBankMapper;
import com.nwallet.nwallet.core.repository.BankRepository;

@Service
public class ApiBankService {
    
    @Autowired
    private BankRepository repository;

    @Autowired ApiBankMapper mapper;

    public BankResponse cadastrar(BankRequest request){

        var bankToRegister = mapper.toModel(request);

        var bankRegistered = repository.save(bankToRegister);

        var response = mapper.toBankResponse(bankRegistered);

        return response;
    }
}

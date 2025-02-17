package com.nwallet.nwallet.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nwallet.nwallet.api.dtos.requests.BankRequest;
import com.nwallet.nwallet.api.dtos.responses.BankResponse;
import com.nwallet.nwallet.api.service.ApiBankService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/banks")
public class BankRestController {
    
    @Autowired
    private ApiBankService service;

    @PostMapping
    @ResponseStatus( code = HttpStatus.CREATED)
    public BankResponse register(@RequestBody BankRequest request) {
        
        System.out.println(request);
        var response = service.cadastrar(request);

        return response;
    }
    
    
}

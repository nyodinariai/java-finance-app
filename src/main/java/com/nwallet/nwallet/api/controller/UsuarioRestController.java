package com.nwallet.nwallet.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nwallet.nwallet.api.dtos.requests.UsuarioRequest;
import com.nwallet.nwallet.api.dtos.responses.UsuarioResponse;
import com.nwallet.nwallet.api.service.ApiUsuarioService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/usuarios")
public class UsuarioRestController {

    @Autowired
    private ApiUsuarioService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public UsuarioResponse cadastrar(@RequestBody @Valid UsuarioRequest request){
        System.out.println(request);
        var response = service.cadastrar(request);

        return response;
    }
    
    @GetMapping("/{id}")
    public UsuarioResponse getMethodName(@PathVariable Long id) {
        return service.getUser(id);
    }
    
}

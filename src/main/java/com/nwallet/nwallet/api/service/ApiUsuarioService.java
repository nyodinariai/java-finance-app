package com.nwallet.nwallet.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nwallet.nwallet.api.dtos.requests.UsuarioRequest;
import com.nwallet.nwallet.api.dtos.responses.UsuarioResponse;
import com.nwallet.nwallet.api.mappers.ApiUsuarioMapper;
import com.nwallet.nwallet.core.repository.UsuarioRepository;
import com.nwallet.nwallet.core.validators.UsuarioValidator;

@Service
public class ApiUsuarioService {
    
    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private ApiUsuarioMapper mapper;

    @Autowired
    private UsuarioValidator validator;

    public UsuarioResponse cadastrar(UsuarioRequest request){

        var usuarioParaCadastrar = mapper.toModel(request);
        
        validator.validar(usuarioParaCadastrar);

        var usuarioCadastrado = repository.save(usuarioParaCadastrar);

        

        var response = mapper.toCadastroResponse(usuarioCadastrado);

        return response;
    }

    public UsuarioResponse getUser(Long id){
        
        var user = repository.getReferenceById(id);
        

        return mapper.toCadastroResponse(user);
    }

}



package com.nwallet.nwallet.api.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.nwallet.nwallet.api.dtos.requests.UsuarioRequest;
import com.nwallet.nwallet.api.dtos.responses.UsuarioCadastroResponse;
import com.nwallet.nwallet.core.models.Usuario;

@Mapper(componentModel = "spring")
public interface ApiUsuarioMapper {

    @Mapping(target = "id", ignore = true)
    Usuario toModel(UsuarioRequest request);

    @Mapping(target = "token", ignore = true)
    @Mapping(target = "tipoUsuario", expression = "java(model.getTipoUsuario().getId())")
    UsuarioCadastroResponse toCadastroResponse(Usuario model);
}

package com.nwallet.nwallet.api.mappers;

import java.util.stream.Stream;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.nwallet.nwallet.api.dtos.requests.UsuarioRequest;
import com.nwallet.nwallet.api.dtos.responses.UsuarioCadastroResponse;
import com.nwallet.nwallet.core.enums.TipoUsuario;
import com.nwallet.nwallet.core.models.Usuario;

@Mapper(componentModel = "spring")
public interface ApiUsuarioMapper {

    ApiUsuarioMapper INSTANCE = Mappers.getMapper(ApiUsuarioMapper.class);

    @Mapping(target = "id", ignore = true)
    Usuario toModel(UsuarioRequest request);


    @Mapping(target = "token", ignore = true)
    @Mapping(target = "tipoUsuario", source = "tipoUsuario.id")
    UsuarioCadastroResponse toCadastroResponse(Usuario model);
        
    default TipoUsuario integerToTipoUsuario(Integer valor) {
        return Stream.of(TipoUsuario.values())
            .filter(tipoUsuario -> tipoUsuario.getId().equals(valor))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Tipo Usuário inválido"));
    }
}

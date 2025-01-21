package com.nwallet.nwallet.core.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.FieldError;

import com.nwallet.nwallet.core.exceptions.UsuarioJaCadastradoException;
import com.nwallet.nwallet.core.models.Usuario;
import com.nwallet.nwallet.core.repository.UsuarioRepository;

@Component
public class UsuarioValidator {
    
    @Autowired
    private UsuarioRepository repository;


    public void validar(Usuario usuario){
        validarEmail(usuario);
    }

    private void validarEmail(Usuario usuario){
        if (repository.isEmailJaCadastrado(usuario)){
          var mensagem = "Já existe um usuário com esse e-mail cadastrado";
          var fieldError = new FieldError(usuario.getClass().getName(), "email", usuario.getEmail(), false, null, null, mensagem);
          
          throw new UsuarioJaCadastradoException(mensagem, fieldError);
        }
    }
}


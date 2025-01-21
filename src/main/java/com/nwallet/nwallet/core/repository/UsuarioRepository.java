package com.nwallet.nwallet.core.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nwallet.nwallet.core.models.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

    default Boolean isEmailJaCadastrado(Usuario usuario){

        if(usuario.getEmail() == null){
            return false;
        }

        return findByEmail(usuario.getEmail())
                .map(usuarioEncontrado -> !usuarioEncontrado.getId().equals(usuario.getId()))
                .orElse(false);

    }

}

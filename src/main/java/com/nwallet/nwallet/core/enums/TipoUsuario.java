package com.nwallet.nwallet.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoUsuario {
    CLIENTE (1),
    ADMIN (2);

    private Integer id;
}

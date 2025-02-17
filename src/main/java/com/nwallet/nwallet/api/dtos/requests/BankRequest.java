package com.nwallet.nwallet.api.dtos.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankRequest {
    
    @NotNull
    @Size(min = 3, max = 255)
    private String nome;

    @NotNull
    @Size(min = 3, max = 3)
    private String compe;

    @NotNull
    @Size(min = 8, max = 8)
    private String isbp;


}

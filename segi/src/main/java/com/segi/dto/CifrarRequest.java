package com.segi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CifrarRequest {

    @NotBlank(message = "O texto claro é obrigatório!")
    @Size(max = 255, message = "O texto claro deve ter no máximo 255 caracteres!")
    private String textoClaro;

    @NotBlank(message = "A chave é obrigatória!")
    @Size(max = 255, message = "A chave deve ter no máximo 255 caracteres!")
    private String chave;

    public String getTextoClaro() {
        return textoClaro;
    }

    public void setTextoClaro(String textoClaro) {
        this.textoClaro = textoClaro;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }
}

package com.segi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class DecifrarRequest {

    @NotBlank(message = "O texto cifrado é obrigatório!")
    @Size(max = 2048, message = "O texto cifrado deve ter no máximo 2048 caracteres!")
    private String textoCifrado;

    @NotBlank(message = "A chave é obrigatória!")
    @Size(max = 255, message = "A chave deve ter no máximo 255 caracteres!")
    private String chave;

    public String getTextoCifrado() {
        return textoCifrado;
    }

    public void setTextoCifrado(String textoCifrado) {
        this.textoCifrado = textoCifrado;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }
}

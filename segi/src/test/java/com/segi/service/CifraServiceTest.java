package com.segi.service;

// @Test identifica um método com teste unit
import org.junit.jupiter.api.Test;

// métodos para comparar resultados
import static org.junit.jupiter.api.Assertions.*;

public class CifraServiceTest {

    private final CifraService cifraService = new CifraService();

    @Test
    void testCifrarCorreto() {

        String resultEsperado = "000011000000010000010101";

        String resultObtido = cifraService.cifrar("OLA", "CHT");

        System.out.println("Texto cifrado: " + resultObtido);
    }

    @Test
    void testExcecaoTamDif() {

        // teste para verificar lançamento de exceção por diferença de tamanho
        // entre textoClaro e chave
        assertThrows(
          IllegalArgumentException.class,
                () -> cifraService.cifrar("OLA", "CH")
        );

        System.out.println("Exceção lançada");
    }

}

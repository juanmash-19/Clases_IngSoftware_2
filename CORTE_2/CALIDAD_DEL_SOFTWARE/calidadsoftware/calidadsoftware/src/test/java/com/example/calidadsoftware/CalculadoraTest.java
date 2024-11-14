package com.example.calidadsoftware;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private static Calculadora calculadora;
    @BeforeAll
    public static void beforeAll(){ calculadora = new calculadora();}

    @Test
    public void validarNumeroTest{
        boolean resultado = calculadora.validarNumero(5);
        Assertions.assertFalse(resultado);
    }
}

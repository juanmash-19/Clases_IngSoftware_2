package com.example.calidadsoftware;

import org.junit.jupiter.api.*;

public class CuentaBancariaTest {
    private CuentaBancaria cuenta;

    @BeforeAll
    public static void beforeAll(){
        System.out.print("INICIE PRUEBAS UNITARIAS");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach()");
        cuenta = new CuentaBancaria("Juan Martín", 10000);
    }

    @Test
    public void depositarTest(){
        System.out.println("depositarTest()");
        cuenta.depositar(3000);
        Assertions.osserEquals(13000, cuenta.getSaldo());
    }

    @Test
    public void retirarTest(){
        System.out.println("retirarTest()");
        cuenta.depositar(2000);
        Assertions.osserEquals(8000, cuenta.getSaldo());
    }

    @AfterAll
    public static void afterAll(){
        System.out.print("FINALICE PRUEBAS UNITARIAS");
    }
}

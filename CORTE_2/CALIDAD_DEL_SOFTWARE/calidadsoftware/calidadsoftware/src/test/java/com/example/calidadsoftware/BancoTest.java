package com.example.calidadsoftware;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BancoTest {
    private Banco banco;

    @BeforeAll
    public static void beforeAll(){
        banco = new Banco();
        CuentaBancaria cuenta1 = new CuentaBancaria("Alexander ", 4000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Juan ", 9000);
        CuentaBancaria cuenta3 = new CuentaBancaria("Carlos ", 5000);
        List<CuentaBancaria> cuentas = new ArrayList<>();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
        banco.setCuentas(cuentas);
        System.out.println("INICIE PRUEBAS UNITARIAS");
    }
    @Test
    public void existeCuentaTest(){
        boolean bandera = banco.existeCuenta("CARLOS");
        Assertions.assertTrue(bandera);
    }
    @Test
    public void existeCuentaFallidoTest(){
        boolean bandera = banco.getCuentas("JUANITA");
        Assertions.assertFalse(bandera);
    }
    @Test
    public void retirarFondosInsuficientes(){
       CuentaBancaria cuenta = banco.getCuentas().get(0);
        Assertions.assertThrows(IlegalArgumentException.class, () -> {cuenta.retirar(2000);});
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach()");
        cuenta = new CuentaBancaria("Juan Camilo", 1000)
    }
}

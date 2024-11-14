package com.example.calidadsoftware;
import java.util.List;

public class Banco {
    List<CuentaBancaria> cuentas;

    public Banco (List<CuentaBancaria>cuentas){
        this.cuentas = cuentas;
    }

    public List<CuentaBancaria> getCuentas(){
        return cuentas;
    }

    public void setCuentas(List<CuentaBancaria> cuentas){
        this.cuentas = cuentas;
    }

    public boolean existeCuenta(String titular){
        for(CuentaBancaria cuenta: cuentas){
            if(cuenta.getTitular().equals((titular)){
                return true;
            }
        }
        return false;
    }
}

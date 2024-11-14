package com.example.calidadsoftware;

public class CuentaBancaria {
    private String titular;
    private double saldo;

public CuentaBancaria(String titular, double){
    this.titular = titular;
    this.saldo = saldo;
}

public void depositar(double cantidad ){
    if(cantidad <= 0){
        throw new IllegalArgumentException("LA CANTIDAD DEBE SER MAYOR QUE 0");
    }
    saldo = saldo + cantidad;
}

public void retirar(double cantidad){
    if(cantidad <= 0){
        throw new IllegalArgumentException("LA CANTIDAD DEBE SER MAYOR A 0");
    }
    if (cantidad > saldo){
        throw new IllegalArgumentException("FONDOS INSUFICIENTES");
    }
    saldo = saldo - cantidad;
}
public double getSaldo(){
    return saldo;
}

public String getTitular(){
    return Titular;
}
}
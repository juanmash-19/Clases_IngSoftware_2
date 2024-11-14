package com.example.calidadsoftware;

public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public boolean validarNumero(int a){
        if(a > 10){
            return true;
        }
        return false;
    }
}
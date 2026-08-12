package org.example;

public class Calculadora {
    // Methods
    public int sumar(int numero, int numero2){
        return numero + numero2;
    }

    public float dividir(float dividendo, float divisor){
        if (divisor == 0){
            throw new ArithmeticException();
        }
        return dividendo / divisor;
    }
}

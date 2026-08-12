package org.example;

public class Calculadora {
    // Methods
    public int sumar(int numero, int numero2){
        return numero + numero2;
    }

    public float dividir(float dividiendo, float divisor){
        if (divisor == 0){
            return 0;
        }
        return dividiendo / divisor;
    }
}

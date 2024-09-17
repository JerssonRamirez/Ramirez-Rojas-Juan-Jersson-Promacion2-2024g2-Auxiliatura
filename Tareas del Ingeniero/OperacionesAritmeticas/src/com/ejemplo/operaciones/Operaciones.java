package com.ejemplo.operaciones;

public class Operaciones {
    public static void main(String[] args) {
        // Ejemplo de uso
        double a = 5.0, b = 3.0;
        System.out.println("Suma: " + sumar(a, b));
        System.out.println("Resta: " + restar(a, b));
        System.out.println("Multiplicación: " + multiplicar(a, b));
        System.out.println("División: " + dividir(a, b));

        // Operaciones con números complejos
        Complejo c1 = new Complejo(2, 3);
        Complejo c2 = new Complejo(1, 4);
        System.out.println("Suma de complejos: " + c1.sumar(c2));
        System.out.println("Resta de complejos: " + c1.restar(c2));
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("División por cero no permitida");
        }
    }
}

class Complejo {
    private double real;
    private double imaginario;

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complejo sumar(Complejo otro) {
        return new Complejo(this.real + otro.real, this.imaginario + otro.imaginario);
    }

    public Complejo restar(Complejo otro) {
        return new Complejo(this.real - otro.real, this.imaginario - otro.imaginario);
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginario + "i)";
    }
}

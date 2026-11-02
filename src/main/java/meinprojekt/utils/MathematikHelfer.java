package meinprojekt.utils;
// Package erstellen

public class MathematikHelfer {
    
    public MathematikHelfer() {
    }
    
    public int addieren(int a, int b) {
        return a + b;
    }
    
    public int multiplizieren(int a, int b) {
        return a * b;
    }
    
    public int subtrahieren(int a, int b) {
        return a - b;
    }
    
    public int dividieren(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division durch null ist nicht erlaubt");
        }
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }
    

    public static double berechneDurchschnitt(int a, int b) {
        return (a + b) / 2.0;
    }

    
}

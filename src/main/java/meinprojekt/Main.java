// Package
package meinprojekt;

// Imports
import meinprojekt.utils.MathematikHelfer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean loop = true;
        System.out.println("Willkommen zum Java Package Beispiel!");

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();

            MathematikHelfer helfer = new MathematikHelfer();

            int zahl1 = 0;
            int zahl2 = 0;
            try {
                System.out.print("Gib die erste Zahl ein: ");
                zahl1 = scanner.nextInt();
                System.out.print("Gib die zweite Zahl ein: ");
                zahl2 = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Fehler! Bitte geben Sie eine Zahl ein.");
                scanner.nextLine();
                continue;
            }

            System.out.println("Zahl 1: " + zahl1);
            System.out.println("Zahl 2: " + zahl2);
            System.out.println();

            int summe = helfer.addieren(zahl1, zahl2);
            System.out.println("Summe: " + summe);

            int minussumme = helfer.subtrahieren(zahl1, zahl2);
            System.out.println("Minussumme: " + minussumme);

            int produkt = helfer.multiplizieren(zahl1, zahl2);
            System.out.println("Produkt: " + produkt);

            try {
                int division = helfer.dividieren(zahl1, zahl2);
                System.out.print("Division: " + division + " Rest: ");
                int modulo = helfer.modulo(zahl1, zahl2);
                System.out.println(modulo);
            } catch (ArithmeticException e) {
                System.out.println("Division: Fehler! " + e.getMessage());
            }

            double ergebnis = MathematikHelfer.berechneDurchschnitt(zahl1, zahl2);
            System.out.println("Durchschnitt: " + ergebnis);

            boolean validAntwort = false;
            while (!validAntwort) {
                System.out.println("\nWollen Sie nochmal rechnen? (j/n)");
                String antwort = scanner.next();
                if (antwort.equalsIgnoreCase("j")) {
                    validAntwort = true;
                } else {
                    loop = false;
                    validAntwort = true;
                }
            }
        } while (loop);

        scanner.close();
    }
}

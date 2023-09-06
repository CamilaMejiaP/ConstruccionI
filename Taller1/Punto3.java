package Talleres.Taller1;

import java.util.Scanner;

public class Punto3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        int age = input.nextInt();

        int actualYear = 2023;
        int birthYear = actualYear - age;

        int daysYear = 365;
        int biciesto = 1;

        int daysWeeks = (age * daysYear) + countBiciesto(birthYear, actualYear);

        int weeks = daysWeeks / 7;

        System.out.println("Usted nacio hace " + daysWeeks + " días");
        System.out.println("tiene " + weeks + " semanas.");
    }

    // Función para contar años bisiestos entre dos años
    public static int countBiciesto(int inicio, int fin) {
        int count = 0;
        for (int i = inicio; i <= fin; i++) {
            if (isBiciesto(i)) {
                count++;
            }
        }
        return count;
    }

    // Función para determinar si un año es bisiesto
    public static boolean isBiciesto(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

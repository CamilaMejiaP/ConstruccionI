package Talleres.Taller1;
import java.util.Scanner;

public class punto2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("ingrese un numero porfavor: ");
        int numero = lector.nextInt();

        EncontrarNumeroEspecial(numero);
    }

    public static void EncontrarNumeroEspecial(int num){
        String numbers = Integer.toString(num);
        int sumDigit = 0;

        for(int i=0; i<numbers.length(); i++){
            char digits = numbers.charAt(i);
            int digit = Character.getNumericValue(digits);
            sumDigit += digit;
        }

        if(num % 5 == 0 && num % 2 != 0 && num % 3 != 0 && sumDigit>10){
            System.out.println("Este numero es especial: "+ num);
        }else{
            System.out.println("Este numero NO es especial: "+ num);
        }
    }
}
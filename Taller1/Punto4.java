package Talleres.Taller1;
import java.util.Scanner;

public class Punto4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = "Admin";
        String pass = "12345";
        int count = 0;
        String userTry, passTry;
        do {
            System.out.println("Ingrese su usuario");
            userTry = input.nextLine();

            System.out.println("Ingrese su password");
            passTry = input.nextLine();

            if (!user.equals(userTry) || !pass.equals(passTry)) {
                count++;
                System.out.println("Usuario y/o contraseña incorrectas");
                System.out.println("Le quedan " + (3 - count) + " intentos");
            } else {
                System.out.println("Acceso concedido");
                break;
            }
        } while (count < 3);
        
        if (count == 3) {
            System.out.println("Acceso denegado");
        }
    }
}

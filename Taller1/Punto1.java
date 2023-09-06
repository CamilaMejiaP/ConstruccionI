package Talleres.Taller1;
import java.util.Scanner;

public class Punto1 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        
        int numResult = 0;
        int demResult = 0;
        String result= "";

        System.out.println("ingrese la primera fraccion");
        String fract1 = input.nextLine();

        int num1 = Integer.parseInt(fract1.split("/")[0]);
        int dem1 = Integer.parseInt(fract1.split("/")[1]);

        System.out.println("ingrese la segunda fraccion");
        String fract2 = input.nextLine();

        int num2 = Integer.parseInt(fract2.split("/")[0]);
        int dem2 = Integer.parseInt(fract2.split("/")[1]);
  
        System.out.println("Ingrese la operacion a realizar \n+ = Suma\n- = Resta\nx = Multiplicacion\n/ = Division");
        String operator = input.nextLine();
        switch(operator){
            case "+":
                numResult = ((num1*dem2)+(num2*dem1));
                demResult = (dem1*dem2);
                break;
            case "-":
                numResult = ((num1*dem2)-(num2*dem1));
                demResult = (dem1*dem2);
                break;
            case "x":
                numResult = (num1*num2);
                demResult = (dem1*dem2);
                break;
            case "/":
                if(dem1 == 0 || dem2 == 0 ) {
                    System.out.println("No se puede dividir entre 0"); 
                    result = "error";
                    break;
                }
                numResult = (num1*dem2);
                demResult = (dem1*num2);
                break;
            default: 
                System.out.println("operacion invalida, ingrese un operador valido");
        }
        if(result == "error"){
            result = "Math error";
        }
        else if(numResult == demResult){
            result = ""+numResult;
        } else{
            result = numResult+"/"+demResult;
        }
        System.out.println("el resultado es:\n"+result);   
    }
}
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorEntero {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean control = false;

        while (!control){
            try {
                int valor1, valor2;

                System.out.println("Ingrese valor 1");
                valor1 = entrada.nextInt();

                System.out.println("Ingrese valor 2");
                valor2 = entrada.nextInt();

                int resultado = valor1 + valor2;
                System.out.println("Resultado: "+ resultado);
                control = true;
            // Esta excepcion controla que los valores sean enteros.
            }catch (InputMismatchException error){
                System.out.println("Error : "+ error);
                System.out.println("Error: Un valor ingresado no es entero");
                // Este metodo limpia el valor o valores ingresados anteriormente
                entrada.nextLine();
            }
        }
    }
}

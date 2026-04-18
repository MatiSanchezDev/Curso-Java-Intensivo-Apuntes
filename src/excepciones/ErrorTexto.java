package excepciones;

import java.util.Scanner;

public class ErrorTexto {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese cantidad ...");
        String cantidad = entrada.next();

        try {
            int numero = Integer.parseInt(cantidad);
            System.out.println("Cantidad convertida: " + cantidad);
        } catch (NumberFormatException e){
            System.out.println("Error: " + e);
            System.out.println("El valor no es una cantidad numérica.");
        }
    }
}

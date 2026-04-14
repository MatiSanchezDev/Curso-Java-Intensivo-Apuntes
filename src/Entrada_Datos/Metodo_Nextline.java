package Entrada_Datos;

import java.util.Scanner;

public class Metodo_Nextline {
    static void main(String[] args) {
        String texto1, texto2, texto3;
        Scanner entrada = new Scanner(System.in);

        // Metodo nextLine() toma toda la linea
        System.out.println("Ingrese la primer palabra...");
        texto1 = entrada.nextLine();
        System.out.println("Ingrese la segunda palabra...");
        texto2 = entrada.nextLine();

        // metodo next() toma solo una palabra
        System.out.println("Ingrese la tercera palabra...");
        texto3 = entrada.next();

        System.out.println("texto 1: " + texto2);
        System.out.println("texto 2: " + texto1);
        System.out.println("texto 3: " + texto3);
    }
}

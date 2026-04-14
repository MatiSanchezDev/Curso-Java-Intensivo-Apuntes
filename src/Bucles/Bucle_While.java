package Bucles;

import java.util.Scanner;

public class Bucle_While {
    static void main(String[] args) {
        /*
        int f = 0;

        // bucle while
        while (f < 5){
            System.out.println("Valor de f: " + f);
            f++;
        }*/

        int f = 0;

        Scanner entrada = new Scanner(System.in);

        // Tabla de multiplicar
        /*
        int valor;

        System.out.println("Ingrese tabla a consultar...");
        valor = entrada.nextInt();

        while (f <= 10){
            System.out.println(valor+"X"+f+"="+valor * f);
            f++;
        }*/

        // Control de login de usuario

        final String username = "matias";
        final String password = "gunbound12";
        boolean acceso = false;

        while (!acceso){
            System.out.println("Ingrese su usuario...");
            String usuario = entrada.next();
            System.out.println("Ingrese su contraseña...");
            String clave = entrada.next();

            if (username.equals(usuario) && password.equals(clave)){
                System.out.println("Usuario logueado con éxito!");
                acceso=true;
            } else {
                System.out.println("ERROR: usuario o contraseña incorrecta");
            }


        }
        System.out.println("Fin del bucle");
    }
}

package Operadores;

import java.util.Scanner;

public class Oper_Aritmeticos {
    static void main(String[] args) {
        int valor1, valor2, resultado;


        Scanner entrada = new Scanner(System.in);

        // Ingreso de datos
        System.out.println("INGRESE VALOR 1...");
        valor1 =  entrada.nextInt();
        System.out.println("INGRESE VALOR 2...");
        valor2 = entrada.nextInt();

        resultado = valor1 + valor2;

        System.out.println("Suma resultado: " + resultado);

        // Operación restar

        resultado = valor1 - valor2;
        System.out.println("Resta resultado: " + resultado);

        // Operación producto
        resultado = valor1 * valor2;
        System.out.println("Multiplicación resultado: " + resultado);

        // Operación dividir
        resultado = valor1 / valor2;
        System.out.println("División resultado: " + resultado);

        // Operación residuo
        resultado = valor1 % valor2;
        System.out.println("Residuo resultado: " + resultado);
    }
}

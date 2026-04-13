package Arreglos;

import java.util.Scanner;

public class Arreglos_Mayor_Valor {
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[5];
        int mayor = 0;

        // Llenando array
        for (int i=0; i<5; i++){
            int nro = i + 1;
            System.out.println("Ingrese valor nro:  "+ nro);

            // Analizando mayor valor
            numeros[i] = entrada.nextInt();
            if (numeros[i]>mayor){
                mayor = numeros[i];
                System.out.println("Este es el mayor número ingresado hasta el momento: " + mayor);
            }

        }
        System.out.println("El mayor de todos los números ingresados es: " + mayor);
    }
}

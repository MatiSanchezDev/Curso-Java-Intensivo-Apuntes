package Condicionales;

import java.util.Scanner;

public class Condicional_Switch {
    static void main(String[] args) {
        int DiaSemana;
        Scanner entrada = new Scanner(System.in);

        // Ingresando datos
        System.out.println("Ingrese dia a consultar");
        DiaSemana = entrada.nextInt();

        switch (DiaSemana){
            case 1 :
                System.out.println("Hoy es Lunes");
                break;
            case 2 :
                System.out.println("Hoy es Martes");
                break;
            case 3 :
                System.out.println("Hoy es Miércoles");
                break;
            case 4 :
                System.out.println("Hoy es Jueves");
                break;
            case 5 :
                System.out.println("Hoy es Viernes");
                break;
            case 6 :
                System.out.println("Hoy es Sábado");
                break;
            case 7 :
                System.out.println("Hoy es Domingo");
                break;
            default:
                System.out.println("Numero incorrecto, debe ingresar un numero del 1 al 7");
        }
    }
}

import java.util.Scanner;

public class Condicional_Switch_Mejorado {
    static void main(String[] args) {
        int DiaSemana;
        Scanner entrada = new Scanner(System.in);

        // Ingresando datos
        System.out.println("Ingrese dia a consultar");
        DiaSemana = entrada.nextInt();

        switch (DiaSemana){
            case 1 -> {
                System.out.println("Hoy es Lunes");
                System.out.println("Recordar que hay que mejorar la landigPage");
            }
            case 2 -> System.out.println("Hoy es Martes");
            case 3 -> System.out.println("Hoy es Miércoles");
            case 4 -> System.out.println("Hoy es Jueves");
            case 5 -> System.out.println("Hoy1 es Sábado");
            case 7 -> System.out.println("Hoy es Domingo");
            default -> System.out.println("Numero incorrecto, debe ingresar un numero del 1 al 7");
        }
    }
}

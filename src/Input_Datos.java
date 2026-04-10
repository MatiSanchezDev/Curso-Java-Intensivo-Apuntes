import java.util.Scanner;

public class Input_Datos {
    static void main(String[] args) {
        String nombre;
        int edad;

        // Ingreso de datos
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        nombre = input.next();
        System.out.println("Escribe tu edad: ");
        edad = input.nextInt();

        // Salida de datos
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

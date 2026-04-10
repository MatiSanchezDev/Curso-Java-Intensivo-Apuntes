import java.util.Scanner;

public class Bucle_Do_While {
    static void main(String[] args) {
        int contador = 1;
        final var valor = 5;
        Scanner entrada = new Scanner(System.in);

        // bucle do while
        /*do {
            System.out.println("Valor: " + contador++);
        } while (contador <= valor);

        System.out.println("Bucle terminado");*/

        //
        int numero = 0;
        int errores = 0;
        do {
            System.out.println("Ingrese el número 5...");
            numero = entrada.nextInt();
            if (numero !=5){
                System.out.println("No ingresaste el número 5...");
                System.out.println("Intentos fallidos: "+ contador);
            }
        }while (numero != 5);
        System.out.println("Bien pibe! Solo erraste: " + errores);
    }
}

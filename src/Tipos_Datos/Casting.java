package Tipos_Datos;

public class Casting {
    static void main(String[] args) {
        // De texto a entero string to integer
        String numeroTexto = "123";
        int numeroEntero = Integer.parseInt(numeroTexto);
        System.out.println("Numero enterio: " + numeroEntero);

        // De entero a texto integer to string
        int entero = 456;
        String enteroTexto = String.valueOf(entero);

        System.out.println("Texto: " + enteroTexto);

        //Doble a entero double to integer

        double numeroDoble = 45.50;
        int dobleEntero =(int)numeroDoble;

        System.out.println("De doble a entero: " + dobleEntero);

        // Entero a doble
        int entero2 = 567;
        double enteroDouble = (double)entero2;

        System.out.println("De entero a doble: "+ enteroDouble);
    }
}

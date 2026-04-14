package Strings;

import java.util.Scanner;

public class Clase_String {
    static void main(String[] args) {
        String palabra1, palabra2;
        Scanner entrada = new Scanner(System.in);

        // Ingreso de datos
        System.out.println("Ingrese primera palabra...");
        palabra1= entrada.next();

        System.out.println("Ingrese segunda palabra...");
        palabra2= entrada.next();

        // Comparar textos
        // metoodo equals() compara string
        if (palabra1.equals(palabra2)){
            System.out.println(palabra1 + " Es igual a " + palabra2);
        }else {
            System.out.println("No son palabras iguales");
        }

        // Comparar textos sin mayúsculas
        // Meetodo equalsIgnoreCase()
        if(palabra1.equalsIgnoreCase(palabra2)){
            System.out.println(palabra1 + " Es igual a " + palabra2 + "\n" + "sin tomar en cuenta las mayusculas");
        }else {
            System.out.println("No son palabras iguales");
        }

        // Comparar cantidad de caracteres
        // Meetodo compareTo()
        if (palabra1.compareTo(palabra2)== 0){
            System.out.println(palabra1 + " tiene las mismas létras que: " + palabra2);
            System.out.println("Esto retorna compareTo: "+ palabra1.compareTo(palabra2));
        } else {
            if (palabra1.compareTo(palabra2) > 0){
                System.out.println(palabra1 + " tiene menos létras que: " + palabra2);
                System.out.println("Esto retorna compareTo: "+ palabra1.compareTo(palabra2));
            } else {
                System.out.println(palabra1 + " tiene más létras que: " + palabra2);
                System.out.println("Esto retorna compareTo: "+ palabra1.compareTo(palabra2));
            }
        }

        // Saber posición de un carácter de una palabra
        // Meetodo charAt()
        char caracter = palabra1.charAt(0);
        char caracter2 = palabra1.charAt(1);
        System.out.println("Primera letra de "+ palabra1 + " es: " + caracter);
        System.out.println("Segunda letra de "+ palabra1 + " es: " + caracter2);
        System.out.println("Tercera letra de "+ palabra1 + " es: " + palabra1.charAt(2));

        // Cantidad de carácteres de un texto
        // Meetodo length()
        System.out.println(palabra1.length());
        System.out.println(palabra2.length());

        // Identificar varios carácteres en un texto o palabra
        // Meetodo substring()
        System.out.println(palabra1.substring(0, 3));

        // Buscar carácteres que coincidan en dos palabras
        // Meetodo indexOf Que retornar 1 o -1 si hay o no hay coincidencias
        int coincidencia = palabra1.indexOf(palabra2);
        if (coincidencia == -1){
            System.out.println("No se encontraron coincidencias");
        } else {
            System.out.println("Se encontraron coincidencias!");
        }

        // Llevar a mayusculas
        // Meetodo toUpperCase()
        System.out.println(palabra1 + " en mayusculas es: "+ palabra1.toUpperCase());

        // Llevar a minusculas
        // Meetodo toLowerCase()
        System.out.println(palabra1 + " en minuscula es: "+ palabra1.toLowerCase());
    }
}

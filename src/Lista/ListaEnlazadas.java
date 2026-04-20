package Lista;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ListaEnlazadas {
    static void main(String[] args) {
        LinkedList<String> frutas = new LinkedList<>();

        // Agregar elementos
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Durazno");
        frutas.add("Uvas");
        frutas.add("Papayas");

        System.out.println("Lista de frutas: " + frutas);

        for(Object i : frutas){
            System.out.println(i);
        }

        // Agregar según índice
        System.out.println("======================");
        frutas.add(3, "Kiwis");

        for(Object i : frutas){
            System.out.println(i);
        }

        // Remover según índice
        System.out.println("======================");
        frutas.remove(3);
        for(Object i : frutas){
            System.out.println(i);
        }

        // Sustituir según índice
        System.out.println("======================");
        frutas.set(3, "Sandía");
        for(Object i : frutas){
            System.out.println(i);
        }

        // Ordenar lista de frutas alfabéticamente A-Z
        System.out.println("======================");
        Collections.sort(frutas);
        for(Object i : frutas){
            System.out.println(i);
        }

        // Ordenar lista de frutas alfabéticamente al revés Z-A
        System.out.println("======================");
        Collections.reverse(frutas);
        for(Object i : frutas){
            System.out.println(i);
        }

        // Ver tamaño de mi lista enlazada
        System.out.println("Tamaño de mi lista: " + frutas.size());

    }
}

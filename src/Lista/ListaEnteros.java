package Lista;

import java.util.ArrayList;
import java.util.Collections;

public class ListaEnteros {
    static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();

        //  Agregar elementos
        valores.add(12);
        valores.add(20);// Al agregar nuevos elementos, se van colocando en la última posición.
        valores.add(35);
        valores.add(200);
        valores.add(54);

        // Agregar un valor en una posición específica.
        valores.add(1,70);
        System.out.println("Elementos: " + valores);

        // Sustituir un valor en una posición específica.
        valores.set(1, 60);
        System.out.println("Elementos: " + valores);

        // Ver la cantidad de valores de una lista.
        System.out.println("Tamaño de mi lista "+ valores.size());

        // Ver elemento por posición.
        System.out.println("Elemento 3: " + valores.get(3));

        // Ver primer elemento.
        System.out.println("Elemento 1: " + valores.getFirst());

        // Ver último elemento.
        System.out.println("Elemento último: " + valores.getLast());

        // Eliminar valor por indice.
        valores.remove(2);
        System.out.println("Elementos: " + valores);

        // Eliminar el primer valor.
        valores.removeFirst();
        System.out.println("Elementos: " + valores);

        // Eliminar el último valor.
        valores.removeLast();
        System.out.println("Elementos: " + valores);

        // Buscar valor específico.
        System.out.println("La lista tiene 20? " + valores.contains(20));

        // Ver índice de una lista.
        System.out.println("índice del numero 20: " + valores.indexOf(20));

        // Ordenar una lista de mayor a menor
        Collections.reverse(valores);
        System.out.println("Lista ordenada mayor a menor: "+ valores);

        // Ordenar una lista de menor a mayor
        Collections.sort(valores);
        System.out.println("Lista ordenada menor a mayor: "+ valores);

        // Como recorrer una lista
        for (Object i: valores){
            System.out.println("Valor: " + i);
        }
    }
}

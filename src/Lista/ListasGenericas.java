package Lista;

import java.util.ArrayList;

public class ListasGenericas {
    static void main(String[] args) {
        ArrayList objetos = new ArrayList();

        objetos.add("Hola");
        objetos.add(200);
        objetos.add(254.4);
        objetos.add(true);
        for (Object i : objetos){
            System.out.println(i);
        }
    }
}

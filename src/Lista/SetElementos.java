package Lista;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetElementos {
    static void main(String[] args) {
        // Set<String> lenguajes = new HashSet<>();
        // Set<String> lenguajes = new LinkedHashSet<>();
        Set<String> lenguajes = new TreeSet<>();

        lenguajes.add("Java");
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("C#");
        lenguajes.add("JavaScript");
        System.out.println(lenguajes);
    }
}

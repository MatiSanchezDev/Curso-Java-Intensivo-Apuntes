package Metodos_Estaticos;

class Matematica {
    // metodo estatico
    // No se permite la palabra this porque no se puede usar variables de clase en un estatico
    public static int suma (int a, int b){
        return a + b;
    }
}

public class Metodos_Estaticos {

    static void main(String[] args) {
        // Acá puedo usar el metodo suma porque está definido como "static"
        // Evitar tener que instanciar una clase para usar un metodo
        int resultado = Matematica.suma(5,3);
        System.out.println(resultado);
    }
}

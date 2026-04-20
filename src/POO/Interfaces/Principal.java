package POO.Interfaces;

// Definir una interfas
interface Animal {

    // Se debe inicializar los atributos siempre en las interfases
    // Todos los atributos de las interfases son constantes o final.
    // Por lo cual no se pueden modificar o ser alterados.
    String nombre = "Willy";
    int peso = 2000;

    // Los metodos definidos en una interfaz se manejan como metodos abstractos
    // Por lo que no pueden contener codigo, solo sirven de guía.
    void sonido (); // Metodo abstracto
    void moverse(); // Metodo abstracto
}

interface Animal2 {
    void comer();
}

// Acá implementamos la interfaz Animal en la clase Ballena.
// Al implementar una interfaz, es obligatorio utilizar todos los metodos que tiene dicha interfaz
// Una clase puede tener varias interfaces.
class Ballena implements Animal, Animal2 {

    @Override
    public void sonido(){
        System.out.println("Nombre: " + nombre);
        System.out.println("La ballena canta.");
    }

    public void moverse(){
        System.out.println("La ballena nada.");
    }

    public void comer () {
        System.out.println("La ballena come peces pequeños.");
    }
}


public class Principal {
    static void main(String[] args) {
        Ballena miBallena = new Ballena();
        miBallena.sonido();
        miBallena.moverse();
        miBallena.comer();
    }
}

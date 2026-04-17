package POO.Polimorfismo;
import POO.Polimorfismo.*;

public class Principal {
    static void main(String[] args) {
        // Clase padre con su metodo animal.
        Animal animal1 = new Animal();
        animal1.sonido();
        // Clase hija con el mismo metodo pero usando polimorfismo.
        Perro elPerro = new Perro();
        elPerro.sonido();

        // Clase hija con el mismo metodo, usando polimorfismo y usando el metodo padre.
        Gato elGato = new Gato();
        elGato.sonido();
    }

}

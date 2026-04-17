package POO.Polimorfismo;

public class Animal {
    // Creamos un metodo para usar de ejemplo de polimorfismo
    // El metodo es de la clase padre llamada sonido()
    void sonido(){
        System.out.println("Sonido de animal");
    }
}

class Perro extends Animal {
    // Acá aplicamos polimorfismo ya que estamos sobreescribiendo la clase sonido() del padre
    void sonido(){
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal{
    // Acá aplicamos polimorfismo de nuevo, pero si necesitamos usar el metodo del padre, usamos super y el nombre del metodo padre.
    void sonido(){
        super.sonido();
        System.out.println("El gato maulla");
    }
}
package POO.Abstracta;

// Definición de clase abstracta
// Reglas para trabajar con clases abstractas Java
// 1. No puedo crear objetos para esta clase
// 2. Puede tener metodos abstractos, pero solo se pueden implementar en otras cosas, no la misma.
// 3. Pueden contener metodo constructor, pero no se puede usar directamente en la misma clase.
// Pero puede ser invocado por una subclase o instancia de otras clases.
// 4. Si yo defino que algún medoto o atributo de la clase es abstracto, la clase debe pasar a ser abstracta.
// No se puede tener metodos o atributos abstractos si la clase no es abstracta.
abstract class Animal {

    // Los metodos abstractos no tienen implementación, sin llaves {}
    public abstract void hacerSonidos ();

    // Metodo concreto
    public void dormir(){
        System.out.println("Este animal duerme");
    }
}

class Perro extends Animal {

    // La anotación @Override en Java indica que un metodo sobrescribe a otro heredado
    // de una superclase o interfaz. Aunque es opcional, se recomienda para asegurar la
    // integridad del código, ya que obliga al compilador a verificar en tiempo de compilación
    // que la firma del metodo sea correcta, evitando errores si el metodo padre cambia.
    @Override
    public void hacerSonidos(){
        System.out.println("El perro ladra");
    }
}

class Gato extends Animal{
    @Override
    public void hacerSonidos(){
        System.out.println("El gato maulla");
    }
}

public class Abstracta {

    static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.dormir();
        miPerro.hacerSonidos();

        System.out.println("======================");

        Gato miGato = new Gato();
        miGato.dormir();
        miGato.hacerSonidos();
    }
}


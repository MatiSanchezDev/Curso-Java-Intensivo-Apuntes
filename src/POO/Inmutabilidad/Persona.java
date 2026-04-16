package POO.Inmutabilidad;


// Definir clase con "final" para hacerla inmutable
public final class Persona {
    private final String nombre;
    private final int edad;
    protected final double sueldo;

    Persona (String nombre, int edad, double sueldo){
        this.nombre = nombre;
        this.edad= edad;
        this.sueldo = sueldo;
    }


    public String dimeNombre(){
        return nombre;
    }

    public int dimeEdad(){
        return edad;
    }

    public double dimeSueldo(){
        return sueldo;
    }

    static void main(String[] args) {

    }
}

package POO.Clases;


class Metodos_Parametros_String {

    void DameDatos (String nombre, int edad) {
        System.out.println("Nombre: "+ nombre+ "\nEdad: "+ edad);
    }

    static void main(String[] args) {
        Metodos_Parametros_String persona1 = new Metodos_Parametros_String();
        Metodos_Parametros_String persona2 = new Metodos_Parametros_String();
        persona1.DameDatos("Matias", 28);
        persona2.DameDatos("Maria", 29);
    }
}

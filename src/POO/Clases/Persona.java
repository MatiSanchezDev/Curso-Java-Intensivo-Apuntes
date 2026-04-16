package POO.Clases;

class Persona {

    String nombre = "José";
    int edad = 30;
    double peso = 78.45;
    boolean soltero = true;

    // Creando metodo
    String Saludo () {
        return "Hola a todos";
    }

    // Creando metodo get
    String DimeNombre (){
        return nombre+" Está aprendiendo java";
    }

    int DimeEdad (){
        return edad;
    }

    // Crear metodo set
    // Void se escribe porque la función o metodo no retorna nada.
    void DimePeso () {
        if(peso>70&& edad>30){
            System.out.println(nombre + " Debe hacer ejercicios");
        } else {
            System.out.println(nombre + " Estás en tu peso ideal");
        }
        if (soltero){
            System.out.println("Necesita una novia");
        } else {
            System.out.println("Cuida a tu pareja");
        }
    }

    static void main(String[] args) {

        Persona persona1 = new Persona();

        System.out.println("Nombre: " + persona1.nombre);
        System.out.println(persona1.Saludo());
        System.out.println(persona1.DimeNombre() + "\nEdad: "+ persona1.DimeEdad());
        persona1.DimePeso();

    }
}

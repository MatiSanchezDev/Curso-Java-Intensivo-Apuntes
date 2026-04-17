package POO.Herencia;

public class Vehiculo {
    // Atributos comunes
    String marca, modelo;
    int anio;

    // Para la herencia, los atributos deben estar especificados en el constructor.
    // Por eso fecha_fabricación no entra en la herencia.
    int fecha_fabricacion;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Este Metodo ya se está heredando a las clases hijas.
    public void dameInfo(){
        System.out.println("Marca: " + marca + " Modelo: "+ modelo+ " Año: "+ anio);
    }

}

class Carro extends Vehiculo {
    // Acá creo un atributo único para esta clase.
    int ruedas;
    // Para heredar de la clase padre hay que definir un constructor con los mimos atributos.
    public Carro (String marca, String modelo, int anio){
        // Se utiliza la palabra reservada "super()" para la herencia del padre.
        super(marca, modelo, anio);
        // acá defino el atributo propio de la subclase la cual es único solo para esta clase.
        this.ruedas = 4;

    }
    public void dameInfo(){
        System.out.println("Información del carro");
        // Al usar esto estoy heredando también metodos creados del padre.
        // En este caso estoy llamando al metodo dameInfo, pero del metodo padre.
        // Pero porque hay un conflicto de nombres, por lo que utilizo super.dameInfo() para usar ese metodo.
        // Esto se llama polimorfismo cuando el metodo hijo sobreescribe el metodo padre.
        super.dameInfo();
        System.out.println("Ruedas: " + ruedas);
    }
}

class Moto extends Vehiculo{
    int ruedas;
    public Moto (String marca, String modelo, int anio){
        super(marca, modelo, anio);
        this.ruedas = 2;
    }

    // Acá aplicamos de nuevo polimorfismo en la clase Moto
    public void dameInfo(){
        System.out.println("Información del carro");
        // Al usar esto estoy heredando también metodos creados del padre.
        // En este caso estoy llamando al metodo dameInfo, pero del metodo padre.
        // Pero porque hay un conflicto de nombres, por lo que utilizo super.dameInfo() para usar ese metodo.
        super.dameInfo();
        System.out.println("Ruedas: " + ruedas);
    }
}
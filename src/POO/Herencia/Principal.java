package POO.Herencia;

import POO.Herencia.*;

public class Principal {
    static void main(String[] args) {
        // Llamando a la subclase Carro que hereda de la clase Vehículo.
        Carro miCarro = new Carro("Peugeot", "408", 2018);
        miCarro.dameInfo();

        // Llamando a la subclase Moto que hereda de la clase Vehículo.
        Moto miMoto = new Moto("Honda","CV",2026);
        miMoto.dameInfo();

    }
}

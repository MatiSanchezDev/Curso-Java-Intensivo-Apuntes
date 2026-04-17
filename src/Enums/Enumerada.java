package Enums;

public class Enumerada {

    // Definición de un enum

    enum diasSemana {
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }

    static void main(String[] args) {
        diasSemana hoy = diasSemana.Viernes;

        // For each
        for (diasSemana dia : diasSemana.values()){
            System.out.println(dia);
        }
    }
}

package Java_Time;

import java.time.LocalDate;

public class Calendario {
    static void main(String[] args) {
        // Obtener fecha actual
        LocalDate fecha = LocalDate.now();

        System.out.println("Fecha actual: "+ fecha);

        // Fecha especifica / personalizada
        LocalDate fecha2 = LocalDate.of(2021,7,14);

        System.out.println("Mi fecha: " + fecha2);

        // Obtener info de fecha
        int diaDelMes = fecha.getDayOfMonth();
        int mes = fecha.getMonthValue();
        int anio = fecha.getYear();
        System.out.println("Dia: " + diaDelMes+ " Mes: "+ mes + " Año: " + anio);

        // Sumar o restar dias, meses o años
        // Metodo plusWeeks te da el que dia será el dia actual pero de la otra semana ejemplo:
        // Hoy es jueves, por lo que el metodo te va a dar la fecha del jueves que viene.
        LocalDate prox_semana = fecha.plusWeeks(1); // El uno representa que cant. de semanas queres saber.
        System.out.println("Fecha proxima semana: " + prox_semana);

        // El metodo minusMonths es lo mismo que el plus pero a la inversa, saber que fecha fue hacer un mes antes.
        LocalDate ultimo_mes = fecha.minusMonths(1);
        System.out.println("Fecha mes pasado: " + ultimo_mes);



    }
}

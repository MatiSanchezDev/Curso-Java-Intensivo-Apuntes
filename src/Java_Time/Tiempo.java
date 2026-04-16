package Java_Time;

import java.time.LocalTime;

public class Tiempo {
    static void main(String[] args) {

        // Obtener hora/min/seg actual
        LocalTime hora = LocalTime.now();
        System.out.println("Hora actual: "+ hora);

        // Crear hora especifica
        LocalTime hora2 = LocalTime.of(14,40,0);
        System.out.println("Mi hora: "+ hora2);

        // Obtener hora - minutos - segundos
        int hh = hora.getHour();
        int mm = hora.getMinute();
        int ss = hora.getSecond();

        System.out.println("Hora:"+ hh + " Min:"+ mm + " Seg:" + ss);
        System.out.println("Hora: "+ hh + ":"+ mm + ":" + ss);

        // Sumar o restar horas minutos y segundos
        // Devuelve la hora que seran dependiendo el parametro que agregues
        LocalTime sumaHoras = hora.plusHours(2);
        System.out.println("En dos horas: " + sumaHoras);

        // Restará a la variable hora el parametro qeu agregues
        LocalTime menos30min = hora.minusMinutes(30);
        System.out.println("Hora actual menos 30 min: " + menos30min);

    }
}

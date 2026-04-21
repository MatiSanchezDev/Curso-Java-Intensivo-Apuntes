package Concurrencia_Hilos;

class Proceso1 extends Thread {
    public void run (){
        System.out.println("Analizando datos...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException error){
            System.out.println(error);
        }
        System.out.println("Cargando datos...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException error){
            System.out.println(error);
        }
        System.out.println("Cargando datos...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException error){
            System.out.println(error);
        }
        System.out.println("Carga finalizada");

    }

}

public class Procesos {



    static void main(String[] args) {
        Proceso1 hilo1 = new Proceso1();
        hilo1.start();// Inicia el hilo

    }
}

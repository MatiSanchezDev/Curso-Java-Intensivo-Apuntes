package Concurrencia_Hilos;

// Acá estoy creando una clase padre para que mi clase hijo tenga los metodos
class ClaseBase {
    public void InitThread (){
        System.out.println("El hilo se está inicializando");
    }

    public void LoadingThread () {
        System.out.println("Cargando hilo...");
    }

    public void FinishThread () {
        System.out.println("Cargando Cargado éxitosamente");
    }
}
// Esta es la clase hijo que extiende del padre y utiliza los metodos creados, pero también implementa una interfaz
// Para poder usar hilos en paralelo, la cual sería imposible si mensaje extiende de la clase Threads, ya que no
// se puede crear tener una clase hija que extienda de dos padres. En este caso serían de Threads y ClaseBase
// No se permiten herencias multiples en Java.
class Mensaje extends ClaseBase implements Runnable {

    public void run() {
        super.InitThread();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException error) {
            System.out.println(error);
        }
        super.LoadingThread();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException error) {
            System.out.println(error);
        }
        super.LoadingThread();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException error) {
            System.out.println(error);
        }
        super.LoadingThread();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException error) {
            System.out.println(error);
        }
        super.FinishThread();
    }
}


public class Interface_Runnable {
    static void main(String[] args) {
        Mensaje objeto1 = new Mensaje();
        Thread hilo = new Thread(objeto1);
        hilo.start();
    }
}

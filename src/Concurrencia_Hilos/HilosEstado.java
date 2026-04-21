package Concurrencia_Hilos;
// ESTADOS DE UN HILO JAVA
// NEW
// RUNNABLE
// BLOCKED
// WAITING
// TERMINATED


class HilosMonitor extends Thread{
    public void run (){
        System.out.println("Estado del hilo al comenzar: " + this.getState()); // Estado: Runnable
        try {
            for (int i = 0; i < 5; i++){
                System.out.println("Hilo en ejecucion: " + i);
                Thread.sleep(2000);

            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Estado del hilo al terminar: " + this.getState());
    }
}

public class HilosEstado {
    static void main(String[] args) {
        HilosMonitor hilo = new  HilosMonitor();
        System.out.println("Estado del hilo una vez  instanciado: " + hilo.getState());// Estado: new
        hilo.start(); // Estado: Runnable
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Estado luego de esperar: " + hilo.getState());// Estado: TIMED_WAITING
        try {
            // Metodo join de la clase Threads
            // El metodo join() en Java, perteneciente a la clase Thread, se utiliza para pausar la ejecución del hilo actual
            // (por ejemplo, el hilo principal main) hasta que otro hilo específico termine su ejecución.
            // Funcionamiento: Cuando el Hilo A llama a hiloB.join(), el Hilo A se bloquea (entra en estado de espera)
            // y no continúa hasta que hiloB finaliza. Ejemplo : *** abajo
            hilo.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Estado al finalizar el hilo: " + hilo.getState()); // Estado TERMINATED
    }
}


/*


Ejemplo ***
Thread hilo1 = new Thread(() -> {
    System.out.println("Hilo 1 ejecutándose...");
});
hilo1.start();
try {
    hilo1.join(); // El hilo principal espera a que hilo1 termine
} catch (InterruptedException e) {
    e.printStackTrace();
}
System.out.println("Hilo 1 ha finalizado. Continuando con el hilo principal.");


 */
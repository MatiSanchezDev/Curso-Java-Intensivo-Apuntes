package Concurrencia_Hilos;

class Saludar extends Thread{
    public void run(){
        for (int i = 0; i<3 ; i++){
            System.out.println("Saludos a todos");
        }
    }
}

class Despedir extends Thread {
    public void run(){
        for (int i = 0; i<3; i++){
            System.out.println("Adios a todos");
        }
    }
}

public class Paralelos {
    static void main(String[] args) {
        Saludar saludo = new Saludar();
        Despedir despedida = new Despedir();
        saludo.start();
        despedida.start();
    }
}

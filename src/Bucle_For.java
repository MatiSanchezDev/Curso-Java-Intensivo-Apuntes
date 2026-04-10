public class Bucle_For {
    static void main(String[] args) {

       /* // Bucle ascendente
        System.out.println("Bucle ascendente");
        for (int f=0; f <= 10; f++){
            System.out.println("Vuelta numero: "+f);
        }

        // Bucle descendente
        System.out.println("Bucle descendente");
        for (int f = 10; f>=0; f--){
            System.out.println("Vuelta numero: "+ f);
        }*/

        int suma = 0;

            System.out.println("Sumando valores...");
        for (int i = 0; i<=20; i++){
            if (i % 2 == 0){
                suma = suma + i;
                System.out.println("Valor sumado: " + i);
            }
        }
        System.out.println("Suma de pares: " + suma);
    }
}

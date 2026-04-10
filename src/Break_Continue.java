public class Break_Continue {
    static void main(String[] args) {
        int control = 0, f = 0;

        // Bucle while
       /* System.out.println("Cargando registros...");
        while (f<=10){
            f++;
            System.out.println("Nro de registros cargados: "+ f);
            if(f == 7) {
                System.out.println("Error de carga, saliendo del sistema.");
                break;
            }
        }
        System.out.println("Fin de bucle");*/

        // Bucle for

        for (f = 0; f <=20; f++){
            // Acá ignoro los pares
           if (f % 2 == 0){
               continue;
           }
            System.out.println("Valor: "+ f);
        }
    }
}

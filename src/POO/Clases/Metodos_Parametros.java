package POO.Clases;

class Metodos_Parametros {


    // Metodos
    int Suma(int a, int b){
        return a + b;
    }

    int Restar(int a, int b){
        return a -b;
    }

    int Multiplicacion(int a, int b, int c){
        return a * b * c;
    }

    double Dividir(int a, int b){
        if (b!=0){
            return a / b;
        }else {
            System.out.println("No se puede dividir entre 0");
        }
        return 0;
    }

    double Potencia(double base, double exponente){
        return Math.pow(base,exponente);
    }



    static void main(String[] args) {
        Metodos_Parametros operacion = new Metodos_Parametros();

        System.out.println("Resultado Suma: "+ operacion.Suma(40, 60));
        System.out.println("Resultado Resta: "+ operacion.Restar(60, 40));
        System.out.println("Resultado Multiplicacion: "+ operacion.Multiplicacion(2, 3, 8));
        System.out.println("Resultado Division: "+ operacion.Dividir(10, 5));
        System.out.println("Resultado Potencia: "+ operacion.Potencia(10, 2));
    }
}

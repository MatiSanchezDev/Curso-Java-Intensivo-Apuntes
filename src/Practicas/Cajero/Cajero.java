package Practicas.Cajero;

import Fundamentos.Saludo;

import java.util.Scanner;

public class Cajero {
    int clave, max_transac, max_intentos;
    double balance;
    Scanner entrada = new Scanner(System.in);

    public Cajero (){
        clave = 2020;
        max_intentos = 0;
        max_transac = 0;
        balance = 10000.00;
        System.out.println("====================================\n" +
                           "   BIENVENIDO AL BANCO PROVINCIA\n" +
                           "==================================== ");
        System.out.println("Por favor ingrese su clave de acceso...");
        int miClave = entrada.nextInt();
        while (miClave != clave){
            max_intentos++;
            System.out.println("Contraseña incorrecta, intente de nuevo...");
            miClave = entrada.nextInt();
            if (max_intentos == 2){
                System.out.println("Cantidad de intentos agotada\n"+
                                    "Su usuario ha sido bloqueado\n"+
                                    "Pongase en contacto con el banco.");
                System.exit(0);
            }
        }

        MenuOpciones();


    }

    public void MenuOpciones(){
        int opciones, controlMenu = 0;
        while (max_transac<=2){
            System.out.println("====================================");
            System.out.println("Por favor elija una transacción\n" +
                    "1. Consulta de balance\n" +
                    "2. Retiro de efectivo\n" +
                    "3. Depósito a cuenta\n" +
                    "4. Salir");
            opciones = entrada.nextInt();
            switch (opciones){
                case 1:
                    Consultar();
                    break;
                case 2:
                    Retirar();
                    break;
                case 3:
                    Depositar();
                    break;
                case 4:
                    Salir();
                    break;
                default:
                    System.out.println("Opción no valida, intente de nuevo...");
                    if(controlMenu == 2){
                        System.out.println("Cantidad de intentos agotada\n"+
                                "Su usuario ha sido bloqueado\n"+
                                "Pongase en contacto con el banco.");
                        System.exit(0);
                    }
                    controlMenu++;
            }
        }
    }

    public void Consultar () {
        System.out.println("Balance actual: "+ balance);
        max_transac++;
        Transacciones();
    }

    public void Transacciones (){
        int valor;
        System.out.println("====================================");
        System.out.println("Desea realizar otra transaccion?\n" +
                "1. Si\n" +
                "2. No");

        valor = entrada.nextInt();
        if (valor == 1){
            MenuOpciones();
        }else {
            Salir();
        }
    }

    public void Retirar(){
        System.out.println("Indique la cantidad a retirar...");
        int retiro = entrada.nextInt();

        while (retiro>balance){
            System.out.println("No tiene balance suficiente\n" +
                    "Intente de nuevo...");
            retiro = entrada.nextInt();
        }
        balance = balance - retiro;
        Consultar();
        Transacciones();
    }

    public void Depositar (){
        System.out.println("Indique la cantidad a depositar...");
        int deposito = entrada.nextInt();
        balance = balance + deposito;
        Consultar();
        Transacciones();
    }

    public void Salir(){
        System.out.println("Gracias por elegirnos! Saludos :)");
        System.exit(0);
    }

    static void main(String[] args) {
        Cajero operacion = new Cajero();
        operacion.MenuOpciones();
    }
}

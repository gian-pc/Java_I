package Semana03;

/*
    Realice un programa que reciba como datos:
        - tipo producto
        - tipo celular
        - Cantidad de celulares
    Determinar el monto a pagar

* */

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tipo de producto: \n 1 - Oficina \n 2 - Juegos \n 3 - utilitarios");
        int tipoProducto = sc.nextInt();

        System.out.println("Tipo de celular: \n O - Iphone \n 1 - Android");
        int tipoCelular = sc.nextInt();

        System.out.println("Ingrese la cantidad");
        int cantidad = sc.nextInt();

        double res = montoPagar(tipoProducto, tipoCelular, cantidad);
        System.out.println("El monto a pagar es "  + res);

    }

    public static double montoPagar(int tipoProducto, int tipoCelular, int cantidad) {

        double monto = 0;


        if (tipoCelular == 0) {
            switch (tipoProducto) {
                case 1:
                    monto = cantidad * 50.60;

                    break;
                case 2:
                    monto = cantidad * 90.80;
                    break;
                case 3:
                    monto = cantidad * 60.50;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    System.exit(0);
            }


        } else if (tipoCelular == 1) {
            switch (tipoProducto) {
                case 1:
                    monto = cantidad * 20.3;

                    break;
                case 2:
                    monto = cantidad * 40.50;
                    break;
                case 3:
                    monto = cantidad * 30.60;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    System.exit(0);
            }


        } else {
            System.out.println("Ingrese una opción válida");
        }
        {

        }
        return monto;

    }
}

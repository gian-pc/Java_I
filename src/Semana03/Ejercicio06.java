package Semana03;

// Problema: Calcular el monto a pagar en función de el tipo de producto y la cantidad(sacos)
/*
 - Input -> Tipo producto, Cantidad(sacos)
 - Calcular -> Monto a pagar
* */


import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ELIGA EL TIPO DE PRODUCTO: \nP - papa \nC - cebolla \nL - limon \nA - ají\nM - maíz");
        String tipo = sc.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cant = sc.nextInt();

        double resp = calculaMonto(tipo, cant);

        System.out.println("El costo total por " + cant + " sacos de " + tipo + " es de " + resp);


    }


    static double calculaMonto(String tipo, int cant) {

        double costo = 0;

        switch (tipo) {
            case "P":
                costo = 20.5 * cant;
                break;
            case "C":
                costo = 19.4 * cant;
                break;
            case "L":
                costo = 32.3 * cant;
                break;
            case "A":
                costo = 16.5 * cant;
                break;
            case "M":
                costo = 19.8 * cant;
                break;
            default:
                System.out.println("Ingrese una opción válida");
                break;


        }

        return costo;


    }

}

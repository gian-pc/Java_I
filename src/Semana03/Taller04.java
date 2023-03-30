package Semana03;

import java.util.Scanner;

public class Taller04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //  Inputs

        System.out.println("INGRESE LA SIGUIENTE INFORMACIÓN \n-----------------------------------");

        System.out.print("  Precio del taller: ");
        double precio = input.nextDouble();

        System.out.print("  Cantidad de talleres: ");
        int cantTalleres = input.nextInt();

        System.out.print("  Cantidad de referidos: ");
        int cantReferidos = input.nextInt();

        // Llamando métodos:

        double descuentoTalleres = descuentoTalleres(precio, cantTalleres);
        System.out.println("-----------------------------------");
        System.out.printf("Descuento por %d talleres es %1.2f \n", cantTalleres, descuentoTalleres);

        double descuentoReferidos = descuentoReferidos(precio, cantReferidos);
        System.out.printf("Descuento por %d referidos es %1.2f \n", cantReferidos, descuentoReferidos);

        double precioFinal = calcularPrecioFinal(precio, descuentoTalleres, descuentoReferidos);
        System.out.println("-----------------------------------");
        System.out.printf("El precio final es: %1.2f", precioFinal);


    }

    public static double descuentoTalleres(double precio, int cantTalleres) {
        double descTalleres = 0;
        if (cantTalleres >= 2 && cantTalleres <= 4) {
            descTalleres = 0.05 * precio;
        } else if (cantTalleres >= 5 && cantTalleres <= 7) {
            descTalleres = 0.1 * precio;
        } else if (cantTalleres >= 8 && cantTalleres <= 10) {
            descTalleres = 0.15 * precio;
        }

        return descTalleres;

    }

    public static double descuentoReferidos(double precio, int cantReferidos) {
        double descReferidos = 0;
        if (cantReferidos >= 2 && cantReferidos <= 5) {
            descReferidos = 0.07 * precio;
        } else if (cantReferidos >= 6 && cantReferidos <= 8) {
            descReferidos = 0.1 * precio;
        } else if (cantReferidos >= 9 && cantReferidos <= 10) {
            descReferidos = 0.12 * precio;
            descReferidos = descReferidos + 20;
        }

        return descReferidos;

    }

    public static double calcularPrecioFinal(double precio, double descuentoTalleres, double descuentoReferidos) {
        double precioFinal = 0;

        precioFinal = precio - descuentoTalleres - descuentoReferidos;

        return precioFinal;


    }

}

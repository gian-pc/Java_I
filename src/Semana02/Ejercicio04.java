package Semana02;

// 4. Que calcule y muestre la fuerza de atracción gravitacional entre dos masas,
// M1 y M2 situadas a una distancia R. Donde las masas se expresan en kilogramos
// y la distancia en metros y la constante de gravitación universal tiene el valor
// de: G=6.67*10-11 Nw*m2/Kg2

import java.math.BigDecimal;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double G = 0.0000000000667;
        double fg;


        System.out.print("Ingrese masa1(m1) en Kg: ");
        double m1 = sc.nextDouble();

        System.out.print("Ingrese masa2(m2) en Kg: ");
        double m2 = sc.nextDouble();

        System.out.print("Ingrese distancia(r) en metros: ");
        double r = sc.nextDouble();


        fg = (G * m1 * m2) / (r * r);

        System.out.println("---------------------------------------");
        System.out.println("La Fg entre m1 y m2 es : " + fg + " N");


    }
}

package Semana02;

// 5. Que calcule y muestre el menor número de monedas de 5, 2 y 1 para desglosar una cantidad C, de Soles.
// Por ejemplo, si C fuese 23, entonces la cantidad de monedas de 5 sería 4, de 2 sería 1 y de 1 sería 1.

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cantidad en Billetes: ");
        int c = sc.nextInt();

        int moneda5, moneda2, moneda1;

        moneda5 = c / 5;
        moneda2 = (c % 5) / 2;
        moneda1 = (moneda2 % 2);

        System.out.println("monedas de 5: " + moneda5);
        System.out.println("monedas de 2: " + moneda2);
        System.out.println("monedas de 1: " + moneda1);


    }
}

package Semana03;

// Que reciba dos números A y B y nos indique si A es múltiplo de B. (V o F)

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();

        multiplo(a, b);

    }

    static void multiplo(int a, int b) {
        if (a % b == 0) {
            System.out.println(b + " es multiplo de " + a);
        } else {
            System.out.println(b + " No es multiplo de " + a);
        }

    }
}

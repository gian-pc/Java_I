package Semana02;

// 1. Dados dos números, que determine la suma, resta, multiplicación, división, potencia

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número 1: ");
        int number1 = sc.nextInt();

        System.out.print("Ingrese número 2: ");
        int number2 = sc.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        System.out.println(number1 + " Pot " + number2 + " = " + (Math.pow(number1,number2)));
    }
}

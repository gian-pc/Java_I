package Semana02;

// 3. Que solicite la temperatura en grados Celsius y la convierta a grados Fahrenheit.

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la Temperatura en °C: ");
        int temp = sc.nextInt();

        System.out.println("Temperatura en °F es: " + (temp * 1.8 + 32));


    }
}

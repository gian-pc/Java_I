package Semana03;

/*
Que reciba dos parámetros (nombre y edad), que muestre el mensaje dependiendo de la Edad:
        1. Edad entre 0 a 2 muestre mensaje: nombre + “ es un infante”
        2. Edad entre 3 a 10 muestre mensaje: nombre + “ es niño”
        3. Edad entre 11 a 13 muestre mensaje: nombre + “ es puber”
        4. Edad entre 14 a 18 muestre mensaje: nombre + “ es adolescente”
        5. Edad entre 19 a 59 muestre mensaje: nombre + “ es adulto”
        6. Edad mayor a 69 muestre mensaje:  nombre + “ es anciano”
*/

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        // Ingresando datos

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Llamando método

        String answer = message(name, age);
        System.out.println(answer);


    }

    static String message(String name, int age) {
        String msg = "";
        if (age >= 0 && age <= 2) {
            msg = name + " es un infante ";
        } else if (age >= 3 && age <= 10) {
            msg = name + " es un niño ";
        } else if (age >= 11 && age <= 13) {
            msg = name + " es un puber ";
        } else if (age >= 14 && age <= 18) {
            msg = name + " es un adolescente ";
        } else if (age >= 19 && age <= 59) {
            msg = name + " es un adulto ";
        } else if (age > 59) {
            msg = name + " es un anciano ";
        } else {
            System.out.println("¡Ingrese una edad valida!");
        }

        return msg;
    }
}

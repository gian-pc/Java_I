package Semana03;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int age = sc.nextInt();

        System.out.println("Elige una opción: \n1 - Extranjero \n2 - Nacional ");
        int nationality = sc.nextInt();


        calculateSalary(nationality, age);


    }

    static void calculateSalary(int nationality, int edad) {
        double sueldoFijo = 2500, bono = 500, incremento, sueldoTotal;


        if (edad >= 15 && edad <= 20) {
            incremento = 1400;
        } else if (edad >= 21 && edad <= 25) {
            incremento = 1500;
        } else if (edad >= 26 && edad <= 30) {
            incremento = 1200;
        } else {
            incremento = 800;
        }

        switch (nationality) {
            case 1:
                sueldoTotal = sueldoFijo + incremento + bono;
                System.out.println("El jugador extranjero de " + edad + " años, su sueldo es de S/. " + sueldoTotal);
                break;
            case 2:
                sueldoTotal = sueldoFijo + incremento;
                System.out.println("El jugador nacional de " + edad + " años, su sueldo es de S/. " + sueldoTotal);
                break;
            default:
                System.out.println("Ingrese una opción válida");

        }


    }
}

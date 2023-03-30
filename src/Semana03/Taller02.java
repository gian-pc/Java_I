package Semana03;

import java.util.Scanner;

public class Taller02 {
    public static void main(String[] args) {

        // Colores
        String b = "\u001B[0m"; // borrar
        String rojo = "\033[31m";
        String negro = "\033[30m";
        String fAmarillo = "\033[43m";

        Scanner input = new Scanner(System.in);

        // Inputs de variables
        System.out.println("SEXO:\n 1 - HOMBRE \n 2 - MUJER");
        System.out.print("Ingrese sexo:                -->     ");
        int sexo = input.nextInt();
        System.out.println("---------------------------------------");

        System.out.println("OCUPACIÓN: \n 1 - TRABAJADOR \n 2 - ESTUDIANTE");
        System.out.print("Ingrese ocupación:           -->     ");
        int ocupacion = input.nextInt();
        System.out.println("---------------------------------------");

        System.out.println("ESTADO DE ÁNIMO: \n 1 - CANSADO \n 2 - NORMAL \n 3 - ACTIVO");
        System.out.print("Ingrese estado de ánimo:     -->     ");
        int estadoAnimo = input.nextInt();
        System.out.println("---------------------------------------");

        // Llamando método que Determina el CAFÉ recomendado
        String cafeRecomendado = determinarCafe(sexo, ocupacion, estadoAnimo);
        System.out.println("----------------------------------------------------");
        System.out.println(fAmarillo + negro + " Según datos del cliente recomendamos: " + rojo + "café " + cafeRecomendado + " " + b);

        // Llamando método que calcula el precio a pagar
        double precioCafe = precioPagar(cafeRecomendado);
        System.out.println(fAmarillo + negro + " Precio café " + cafeRecomendado + ":" + rojo + " S/ " + precioCafe + "                        " + b);


    }

    public static String determinarCafe(int sexo, int ocupacion, int estadoAnimo) {

        String cafe = "";

        System.out.println("RESULTADO DEL MENU DE OPCIONES");
        System.out.println("---------------------------------------");
        if (sexo == 1) {
            System.out.println(" Hombre");
            if (ocupacion == 1) {
                System.out.println(" Trabajador");
                switch (estadoAnimo) {
                    case 1:
                        System.out.println(" Cansado");
                        cafe = "Expreso";
                        break;
                    case 2:
                        System.out.println(" Normal");
                        cafe = "Capuchino";
                        break;
                    case 3:
                        System.out.println(" Activo");
                        cafe = "Latte";
                        break;

                }

            } else if (ocupacion == 2) {
                System.out.println(" Estudiante");

                switch (estadoAnimo) {
                    case 1:
                        System.out.println(" Cansado");
                        cafe = "Expreso";
                        break;
                    case 2:
                        System.out.println(" Normal");
                        cafe = "Americano";
                        break;
                    case 3:
                        System.out.println(" Activo");
                        cafe = "Americano";
                        break;

                }

            } else {
                System.out.println("Eliga una opción válida");
            }

        } else if (sexo == 2) {
            System.out.println(" Mujer");
            if (ocupacion == 1) {
                System.out.println(" Trabajador");
                switch (estadoAnimo) {
                    case 1:
                        System.out.println(" Cansado");
                        cafe = "Expreso";
                        break;
                    case 2:
                        System.out.println(" Normal");
                        cafe = "Capuchino";
                        break;
                    case 3:
                        System.out.println(" Activo");
                        cafe = "Capuchino";
                        break;

                }

            } else if (ocupacion == 2) {
                System.out.println(" Estudiante");
                switch (estadoAnimo) {
                    case 1:
                        System.out.println(" Cansado");
                        cafe = "Expreso";
                        break;
                    case 2:
                        System.out.println(" Normal");
                        cafe = "Americano";
                        break;
                    case 3:
                        System.out.println(" Activo");
                        cafe = "Latte";
                        break;

                }

            } else {
                System.out.println("Eliga una opción válida");
            }

        } else {
            System.out.println("Eliga una opción válida");
        }

        return cafe;
    }

    public static double precioPagar(String cafeRecomedado) {
        double precio = 0;
        switch (cafeRecomedado) {
            case "Expreso":
                precio = 6;
                break;
            case "Capuchino":
                precio = 9;
                break;
            case "Latte":
                precio = 10;
                break;
            case "Americano":
                precio = 8;
                break;

        }
        return precio;

    }
}

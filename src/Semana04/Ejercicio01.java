package Semana04;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        // Inputs
        Scanner input = new Scanner(System.in);


        System.out.print("Ingrese numeros: ");
        String digitos = input.nextLine();

        System.out.print("Ingrese el digito a contar: ");
        String digitoSelec = input.nextLine();

        // Calls
        int cantDigitos = calcularNumeros(digitos);
        System.out.println("Cantidad total de digitos: " + cantDigitos);

        int numRepetidos = calcularNumRepetidos(digitos, digitoSelec);
        System.out.println("num repetidos "+numRepetidos);



    }


    public static int calcularNumeros(String digitos) {

        int count = 0;

        for (int i = 0; i < digitos.length(); i++) {

            count++;

        }

        return count;
    }

    public static int calcularNumRepetidos(String digitos, String digitoSelec) {


        int c = 0;

        for (int i = 0; i < digitos.length(); i++) {


            System.out.println(digitos);





        }
        return c;
    }

}

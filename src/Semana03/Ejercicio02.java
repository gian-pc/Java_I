package Semana03;

// Que reciba un numero y muestre un mensaje indicando si es par o no.

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.print("Ingrese un número: ");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        parImpar(num);

    }

    static void parImpar(int num) {

        if (num % 2 == 0) {
            System.out.println("El número " + num + " es PAR");

        }else{
            System.out.println("El número " + num + " es IMPAR");
        }


    }

}

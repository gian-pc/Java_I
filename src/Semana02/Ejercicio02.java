package Semana02;

import java.util.Scanner;

// 2. Que determine el Área de un circulo: pi(r*r)
public class Ejercicio02 {
    public static void main(String[] args) {

        System.out.print("Ingrese el radio del circulo: ");
        Scanner sc = new Scanner(System.in);
        int radio = sc.nextInt();
        double area = Math.PI * Math.pow(radio, 2);


        System.out.printf("El área del círculo de radio %d es %1.2f u2", radio, area);


    }
}

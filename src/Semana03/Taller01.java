package Semana03;

import java.util.Scanner;

/*  Se solicita:
    A.	Dado un tipo de intervención, indicar el precio en soles. (no incluir internamiento)
    B.	Dado un tipo de intervención, determinar el precio total en soles. (incluir internamiento).
*/
public class Taller01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // MENU
        System.out.println("TIPOS DE CIRUGÍA: \n  1 - Rinoplastia \n  2 - Liposucción \n  3 - Mamoplastia");
        System.out.println("--------------------------------");
        System.out.print("Eliga una opción [1 - 3]: ");

        // VARIABLES
        int tipoCirugia = sc.nextInt();
        System.out.println("--------------------------------");

        double tipoCambio = 3.75;

        // SALIDAS
        double precioSinInternamiento = CalcularPrecioxIntervencion(tipoCirugia, tipoCambio);
        System.out.println("Cirugía en S/ sin Internamiento: " + precioSinInternamiento);

        double precioConInternamiento = CalcularPrecioxIntervencionMasInternamiento(tipoCirugia, tipoCambio);
        System.out.println("Cirugía en S/ con Internamiento: " + precioConInternamiento);


    }

    public static double CalcularPrecioxIntervencion(int tipoCirugia, double tipoCambio) {

        double precio = 0;
        switch (tipoCirugia) {
            case 1:
                precio = 1800 * tipoCambio;
                break;
            case 2:
                precio = 4500 * tipoCambio;
                break;
            case 3:
                precio = 3500 * tipoCambio;
                break;
            default:
                System.out.println("Ingrese una opción válida");

        }

        return precio;
    }


    public static double CalcularPrecioxIntervencionMasInternamiento(int tipoCirugia, double tipoCambio) {
        double precioTotal = 0;
        double costoDiarioInternamiento = 1000;


        switch (tipoCirugia) {
            case 1:
                precioTotal = CalcularPrecioxIntervencion(tipoCirugia, tipoCambio) + costoDiarioInternamiento * 1;
                break;
            case 2:
                precioTotal = CalcularPrecioxIntervencion(tipoCirugia, tipoCambio) + costoDiarioInternamiento * 4;
                break;
            case 3:
                precioTotal = CalcularPrecioxIntervencion(tipoCirugia, tipoCambio) + costoDiarioInternamiento * 2;
                break;


        }
        return precioTotal;

    }
}

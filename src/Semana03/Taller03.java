package Semana03;

import java.util.Scanner;

public class Taller03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = input.nextLine();

        System.out.println("FACULTAD\n 1 - Ing. de Sistemas\n 2 - Derecho\n 3 - Ing. Naviera\n " +
                "4 - Ing. Pesquera\n 5 - Contabilidad\n 6 - Administración");

        System.out.print("Eliga una Facultad: ");
        int facultad = input.nextInt();

        // Llamando método
        Calcular_matricula_mensualidad_igv_montoFinal(nombre, facultad);

    }

    public static void Calcular_matricula_mensualidad_igv_montoFinal(String nombre, int facultad) {

        double matricula = 0, mensualidad = 0, igv = 0, montoFinal = 0;
        switch (facultad) {
            case 1:
                matricula = 350;
                mensualidad = 650;
                igv = 0.18 * (matricula + mensualidad);
                montoFinal = matricula + mensualidad + igv;
                break;
            case 2:
                matricula = 300;
                mensualidad = 550;
                igv = 0.18 * (matricula + mensualidad);
                montoFinal = matricula + mensualidad + igv;
                break;
            case 3:
                matricula = 300;
                mensualidad = 500;
                igv = 0.18 * (matricula + mensualidad);
                montoFinal = matricula + mensualidad + igv;
                break;
            case 4:
                matricula = 310;
                mensualidad = 460;
                igv = 0.18 * (matricula + mensualidad);
                montoFinal = matricula + mensualidad + igv;
                break;
            case 5:
                matricula = 280;
                mensualidad = 490;
                igv = 0.18 * (matricula + mensualidad);
                montoFinal = matricula + mensualidad + igv;
                break;
            case 6:
                matricula = 360;
                mensualidad = 520;
                igv = 0.18 * (matricula + mensualidad);
                montoFinal = matricula + mensualidad + igv;
                break;


        }
        System.out.println("\033[31m---------------------------\u001B[0m");
        System.out.println("Nombre: " + nombre);
        System.out.println("Facultad: " + facultad);
        System.out.println("Matricula: " + matricula);
        System.out.println("Mensualidad: " + mensualidad);
        System.out.println("IGV: " + igv);
        System.out.println("Monto Final: " + montoFinal);
        System.out.println("\033[31m---------------------------\u001B[0m");

    }
}

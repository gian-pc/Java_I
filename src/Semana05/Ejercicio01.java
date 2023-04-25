package Semana05;


import java.util.Arrays;

public class Ejercicio01 {
    public static void main(String[] args) {

        // variables
        String[] vendedores = {"Hugo", "Mariana", "Luis", "Jennifer", "Jorge", "Valeria", "Manuel"};
        int[] ventas = {15, 16, 1, 0, 4, 15, 13};
        int totalVentas;
        double porcentaje;
        String[] vendedoresSuperCuota;
        double comision;


        // call
        totalVentas = calcular_total_ventas(ventas);
        porcentaje = calcular_porcentaje(ventas);
        vendedoresSuperCuota = calcular_vendedores_super_cuota(vendedores, ventas);
        comision = calcular_comision(ventas);

        // print
        System.out.println("Total de ventas por mes: " + totalVentas);
        System.out.printf("El %.2f superaron la cuota de venta", porcentaje);
        System.out.println("\n" + Arrays.toString(vendedoresSuperCuota));
        System.out.println("La comision por venta es: " + comision);


    }

    public static int calcular_total_ventas(int[] ventas) {
        int suma = 0;
        for (int venta : ventas) {
            suma += venta;
        }
        return suma;
    }


    public static double calcular_porcentaje(int[] ventas) {
        double contador = 0;
        double porcentaje_vendedores = 0;


        for (int venta : ventas) {
            if (venta > 5) {
                contador++;
                porcentaje_vendedores = contador / ventas.length * 100;
            }
        }
        return porcentaje_vendedores;
    }


    public static String[] calcular_vendedores_super_cuota(String[] vendedores, int[] ventas) {
        String[] arr = new String[vendedores.length];
        int pos = 0;

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > 5) {
                arr[pos] = vendedores[i];
                pos++;
            }
        }
        return arr;
    }


    public static double calcular_comision(int[] ventas) {
        double suma = 0;
        double comision = 0;
        for (int venta : ventas) {
            suma += venta;
            comision = suma * 300;
        }
        return comision;
    }

}

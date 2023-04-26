package Semana05;

import java.util.Arrays;

public class Ejercicio02 {
    public static void main(String[] args) {

        // Variables
        String[] platos = {"Lomo Saltado", "Ají de Gallina", "Papa Rellena", "Seco con Frijoles", "Pollo a la brasa"};
        int[] nacionales = {25000, 18600, 14400, 12000, 30000};
        int[] extranjeros = {10000, 5000, 200, 800, 60000};

        int[] totalPlatos;
        double[] porcentaje;
        String masVendido;

        // call
        totalPlatos = calcular_total_platos(nacionales, extranjeros);
        porcentaje = calcular_porcentaje_platos(totalPlatos);
        masVendido = calcular_plato_mas_vendido(platos, totalPlatos);

        // prints
        System.out.println("1) El total de platos: " + Arrays.toString(totalPlatos));
        System.out.println("2) Porcentaje x platos: " + Arrays.toString(porcentaje));
        System.out.println("3) El plato más vendido es: " + masVendido);


    }


    public static int[] calcular_total_platos(int[] nacionales, int[] extranjeros) {
        int[] total_platos = new int[nacionales.length];

        for (int i = 0; i < total_platos.length; i++) {
            total_platos[i] = nacionales[i] + extranjeros[i];
        }
        return total_platos;
    }


    public static double[] calcular_porcentaje_platos(int[] totalPlatos) {
        double suma = 0;

        double[] arr = new double[totalPlatos.length];
        for (int totalPlato : totalPlatos) {
            suma += totalPlato;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round((totalPlatos[i] / suma * 100) * 100.0) / 100.0;

        }
        return arr;
    }


    public static String calcular_plato_mas_vendido(String[] platos, int[] totalPlatos) {
        int mayor = 0;
        String plato = "";

        for (int i = 0; i < platos.length; i++) {
            if (totalPlatos[i] > mayor) {
                mayor = totalPlatos[i];
                plato = platos[i];
            }
        }
        System.out.println(mayor);

        return plato;
    }
}

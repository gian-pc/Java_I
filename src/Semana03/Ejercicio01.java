package Semana03;

// Dados dos números, nos indique quien es mayor, menor o si son iguales.

public class Ejercicio01 {
    public static void main(String[] args) {
        mayorMenorIguales(5, 6);
    }

    static void mayorMenorIguales(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }
    }
}

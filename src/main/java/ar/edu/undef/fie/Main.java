package ar.edu.undef.fie;

import java.util.Arrays;

public class Main {
    //Ejercicio 1:
    public static void main(String[] args) {
        int[] numeros = Arrays.stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        double promedio = Arrays.stream(numeros)
                .average()
                .orElse(0.0); // Si no hay números, el promedio es 0.0

        System.out.println("El promedio de los números es: " + promedio);
    }
}




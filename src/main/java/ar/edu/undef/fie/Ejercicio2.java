package ar.edu.undef.fie;

import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int numeroBuscado = 5;

        boolean existe = buscarNumero(numeros, numeroBuscado);

        if (existe) {
            System.out.println("El número " + numeroBuscado + " existe en la lista.");
        } else {
            System.out.println("El número " + numeroBuscado + " no existe en la lista.");
        }
    }

    public static boolean buscarNumero(List<Integer> lista, int numero) {
        return lista.stream().anyMatch(elemento -> elemento == numero);
    }
}

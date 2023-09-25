package ar.edu.undef.fie;

import java.util.Arrays;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> lista2 = Arrays.asList(30, 45, 5, 16, 1);

        List<Integer> interseccion = encontrarInterseccion(lista1, lista2);

        System.out.println("Intersección mostrada como lista: " + interseccion);

        System.out.println("Intersección de las listas:");
        for (Integer numero : interseccion) {
            System.out.println(numero);
        }
    }

    public static List<Integer> encontrarInterseccion(List<Integer> lista1, List<Integer> lista2) {
        return lista1.stream()
                .filter(lista2::contains)
                .toList();
    }
}

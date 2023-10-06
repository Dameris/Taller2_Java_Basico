package _06_ejercicios_funciones.ejercicio29_34;

import java.util.Arrays;

import static _06_ejercicios_funciones.ejercicio29_34.exercise29_34.*;
import static java.lang.System.out;

public class Ejemplo29_34 {
    public static void main(String[] args) {
        int[][] array = generaArrayBiInt(3, 4, 1, 10);
        // Imprimir el array generado
        for (int[] ints : array) {
            for (int anInt : ints) {
                out.print(anInt + " ");
            }
            out.println();
        }

        int[] fila = filaDeArrayBiInt(array, 1);
        out.println("Fila 1: " + Arrays.toString(fila));

        int[] columna = columnaDeArrayBiInt(array, 2);
        out.println("Columna 2: " + Arrays.toString(columna));

        int[] coordenadas = coordenadasEnArrayBiInt(array, 5);
        out.println("Coordenadas del número 5: " + Arrays.toString(coordenadas));

        boolean esPuntoSilla = esPuntoDeSilla(array, 1, 2);
        out.println("¿Es punto de silla en (1, 2)? " + esPuntoSilla);

        int[] diagonalNose = diagonal(array, 1, 1, "nose");
        out.println("Diagonal NO-SE: " + Arrays.toString(diagonalNose));
    }
}
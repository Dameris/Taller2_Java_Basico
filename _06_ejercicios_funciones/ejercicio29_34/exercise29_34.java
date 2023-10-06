package _06_ejercicios_funciones.ejercicio29_34;

import java.util.Random;

public class exercise29_34 {
    static Random random = new Random();

    // Función para generar un array bidimensional de números aleatorios en un intervalo
    public static int[][] generaArrayBiInt(int filas, int columnas, int minimo, int maximo) {
        int[][] array = new int[filas][columnas];
        for (int i = 0; i < filas; i ++) {
            for (int j = 0; j < columnas; j ++) {
                array[i][j] = (random.nextInt() * (maximo - minimo + 1)) + minimo;
            }
        }
        return array;
    }

    // Función para obtener la fila i-ésima de un array bidimensional
    public static int[] filaDeArrayBiInt(int[][] array, int fila) {
        return array[fila];
    }

    // Función para obtener la columna j-ésima de un array bidimensional
    public static int[] columnaDeArrayBiInt(int[][] array, int columna) {
        int[] columnaArray = new int[array.length];
        for (int i = 0; i < array.length; i ++) {
            columnaArray[i] = array[i][columna];
        }
        return columnaArray;
    }

    // Función para encontrar las coordenadas de la primera ocurrencia de un número en un array bidimensional
    public static int[] coordenadasEnArrayBiInt(int[][] array, int numero) {
        int[] coordenadas = {-1, -1};
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j ++) {
                if (array[i][j] == numero) {
                    coordenadas[0] = i;
                    coordenadas[1] = j;
                    return coordenadas;
                }
            }
        }
        return coordenadas;
    }

    // Función para comprobar si un número es punto de silla en un array bidimensional
    public static boolean esPuntoDeSilla(int[][] array, int fila, int columna) {
        int numero = array[fila][columna];
        // Comprobar si es mínimo en la fila
        for (int j = 0; j < array[0].length; j ++) {
            if (array[fila][j] < numero) {
                return false;
            }
        }
        for (int[] ints : array) {
            if (ints[columna] > numero) {
                return false;
            }
        }
        return true;
    }

    // Función para obtener una diagonal de un array bidimensional
    public static int[] diagonal(int[][] array, int fila, int columna, String direccion) {
        int filas = array.length;
        int columnas = array[0].length;
        int tamanyo = Math.min(filas, columnas);
        int[] diagonal = new int[tamanyo];

        if (direccion.equals("nose")) {
            for (int i = 0; i < tamanyo; i ++) {
                if (fila + i < filas && columna + i < columnas) {
                    diagonal[i] = array[fila + i][columna + i];
                }
            }
        }
        else if (direccion.equals("neso")) {
            for (int i = 0; i < tamanyo; i++) {
                if (fila + i < filas && columna - i >= 0) {
                    diagonal[i] = array[fila + i][columna - i];
                }
            }
        }
        return diagonal;
    }

    private exercise29_34() {}
}
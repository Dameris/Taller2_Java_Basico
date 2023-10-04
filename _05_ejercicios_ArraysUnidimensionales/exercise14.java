package _05_ejercicios_ArraysUnidimensionales;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] palabras = new String[8];

        for (int i = 0; i < 8; i++) {
            out.print("Ingresa una palabra: ");
            palabras[i] = scanner.nextLine().toLowerCase();
        }

        String[] palabrasColores = new String[8];
        String[] otrasPalabras = new String[8];
        int contadorColores = 0;
        int contadorOtras = 0;

        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

        for (String palabra : palabras) {
            boolean esColor = false;
            for (String color : colores) {
                if (palabra.equals(color)) {
                    esColor = true;
                    break;
                }
            }
            if (esColor) {
                palabrasColores[contadorColores] = palabra;
                contadorColores++;
            } else {
                otrasPalabras[contadorOtras] = palabra;
                contadorOtras++;
            }
        }

        if (contadorColores >= 0) System.arraycopy(palabrasColores, 0, palabras, 0, contadorColores);

        if (contadorOtras >= 0) System.arraycopy(otrasPalabras, 0, palabras, contadorColores, contadorOtras);

        out.println("Array resultado:");
        for (String palabra : palabras) {
            out.print(palabra + " ");
        }
    }
}
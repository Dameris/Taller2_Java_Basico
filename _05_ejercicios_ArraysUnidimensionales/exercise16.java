package _05_ejercicios_ArraysUnidimensionales;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int[] listaNumeros = new int[20];

        for (int i = 0; i < 20; i++) {
            listaNumeros[i] = rand.nextInt(401);
        }

        out.println(Arrays.toString(listaNumeros));

        int multiplo = 0;

        while (true) {
            out.println("¿Qué números quiere resaltar?\n" +
                    "1 - Múltiplos de 5\n" +
                    "2 - Múltiplos de 7");
            multiplo = scanner.nextInt();

            if (multiplo != 1 && multiplo != 2) {
                out.println("Escribe 1 o 2");
            }
            else {
                if (multiplo == 1) {
                    multiplo = 5;
                }
                else {
                    multiplo = 7;
                }

                break;
            }
        }

        for (int j = 0; j < listaNumeros.length; j ++) {
            if ((listaNumeros[j] % multiplo) == 0) {
                out.print("[" + listaNumeros[j] + "]" + " ");
            }
            else {
                out.print(listaNumeros[j] + " ");
            }
        }
    }
}
package _05_ejercicios_ArraysUnidimensionales;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] listaNum = new int[10];

        for (int i = 0; i < 10; i ++) {
            out.println("Escribe un número entero");
            listaNum[i] = scanner.nextInt();
        }

        out.println(Arrays.toString(listaNum));

        int numeroMax = Arrays.stream(listaNum).max().getAsInt();
        int numeroMin = Arrays.stream(listaNum).min().getAsInt();

        for (int j = 9; j > -1; j --) {
            if (numeroMax == listaNum[j]) {
                out.println(listaNum[j] + " Máximo");
            }
            else if (numeroMin == listaNum[j]) {
                out.println(listaNum[j] + " Mínimo");
            }
            else {
                out.println(listaNum[j]);
            }
        }
    }
}
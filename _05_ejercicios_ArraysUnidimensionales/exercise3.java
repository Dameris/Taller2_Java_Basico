package _05_ejercicios_ArraysUnidimensionales;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] listaNum = new int[10];

        for (int i = 0; i < 10; i ++) {
            out.println("Escribe un número entero");
            listaNum[i] = scanner.nextInt();
        }

        out.println(Arrays.toString(listaNum));

        for (int j = 9; j > -1; j --) {
            out.println(listaNum[j]);
        }
    }
}
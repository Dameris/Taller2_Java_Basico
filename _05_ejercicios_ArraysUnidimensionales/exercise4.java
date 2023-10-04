package _05_ejercicios_ArraysUnidimensionales;

import java.util.Random;

import static java.lang.System.out;

public class exercise4 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            numero[i] = rand.nextInt(101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
        }

        out.println("Número\tCuadrado\tCubo");

        for (int i = 0; i < 20; i++) {
            out.println(numero[i] + "\t\t" + cuadrado[i] + "\t\t" + cubo[i]);
        }
    }
}
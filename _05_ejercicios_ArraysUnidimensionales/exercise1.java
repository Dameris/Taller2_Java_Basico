package _05_ejercicios_ArraysUnidimensionales;

import static java.lang.System.out;

public class exercise1 {
    public static void main(String[] args) {
        int[] num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        for (int element : num) {
            out.println(element);
        }
    }
}

// A los elementos que no hemos inicializado le da valor 0
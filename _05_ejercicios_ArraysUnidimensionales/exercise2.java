package _05_ejercicios_ArraysUnidimensionales;

import static java.lang.System.out;

public class exercise2 {
    public static void main(String[] args) {
        char[] num = new char[10];
        num[0] = 'a';
        num[1] = 'x';
        num[4] = '@';
        num[6] = ' ';
        num[7] = '+';
        num[8] = 'Q';

        for (char element : num) {
            out.println(element);
        }
    }
}

// A los elementos que no hemos inicializado le da valor vacío
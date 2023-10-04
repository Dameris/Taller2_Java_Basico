package _05_ejercicios_ArraysUnidimensionales;

import java.util.Scanner;

import static java.lang.System.out;

public class exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] mesas = new int[10];

        while (true) {
            out.println("Mesa no 1 2 3 4 5 6 7 8 9 10");
            out.print("Ocupación ");
            for (int ocupacion : mesas) {
                out.print(ocupacion + " ");
            }
            out.print("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
            int clientes = scanner.nextInt();

            if (clientes == -1) {
                break;
            }

            if (clientes > 4) {
                out.println("Lo siento, no admitimos grupos de " + clientes + " personas.");
            }
            else {
                boolean sentados = false;
                for (int i = 0; i < mesas.length; i ++) {
                    if (clientes <= (4 - mesas[i])) {
                        mesas[i] += clientes;
                        out.println("Por favor, siéntense en la mesa número " + (i + 1) + ".");
                        sentados = true;
                        break;
                    }
                }
                if (!sentados) {
                    for (int i = 0; i < mesas.length; i ++) {
                        if (clientes <= (4 - mesas[i])) {
                            mesas[i] += clientes;
                            out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (i + 1) + ".");
                            break;
                        }
                    }
                }
            }
        }
    }
}
package _06_ejercicios_funciones.ejercicio1_14;

import static java.lang.System.out;

public class Ejemplo1_14 {
    public static void main(String[] args) {
        int numero = 12345;
        boolean esCapicua = exercise1_14.esCapicua(numero);
        out.println("Es capicúa: " + esCapicua);

        int primo = 17;
        boolean esPrimo = exercise1_14.esPrimo(primo);
        out.println("Es primo: " + esPrimo);

        int siguientePrimo = exercise1_14.siguientePrimo(primo);
        out.println("Siguiente primo: " + siguientePrimo);

        double potencia = exercise1_14.potencia(2, 3);
        out.println("Potencia: " + potencia);

        int digitos = exercise1_14.digitos(numero);
        out.println("Número de dígitos: " + digitos);

        int numeroInvertido = exercise1_14.voltea(numero);
        out.println("Número invertido: " + numeroInvertido);

        int digitoEnPosicion = exercise1_14.digitoN(numero, 2);
        out.println("Dígito en posición 2: " + digitoEnPosicion);

        int posicionDigito = exercise1_14.posicionDeDigito(numero, 4);
        out.println("Posición del dígito 4: " + posicionDigito);

        int sinDigitosPorDetras = exercise1_14.quitaPorDetras(numero, 2);
        out.println("Sin 2 dígitos por detrás: " + sinDigitosPorDetras);

        int sinDigitosPorDelante = exercise1_14.quitaPorDelante(numero, 2);
        out.println("Sin 2 dígitos por delante: " + sinDigitosPorDelante);

        int numeroConDigitoDetras = exercise1_14.pegaPorDetras(numero, 6);
        out.println("Número con 6 por detrás: " + numeroConDigitoDetras);

        int numeroConDigitoDelante = exercise1_14.pegaPorDelante(numero, 0);
        out.println("Número con 0 por delante: " + numeroConDigitoDelante);

        int trozo = exercise1_14.trozoDeNumero(numero, 1, 3);
        out.println("Trozo de número: " + trozo);

        int numeroJuntado = exercise1_14.juntaNumeros(123, 456);
        out.println("Números juntados: " + numeroJuntado);
    }
}
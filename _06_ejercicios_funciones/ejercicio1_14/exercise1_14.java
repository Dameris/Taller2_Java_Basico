package _06_ejercicios_funciones.ejercicio1_14;

public class exercise1_14 {
    // Función para comprobar si un número es capicúa
    public static boolean esCapicua(int numero) {
        return numero == voltea(numero);
    }

    // Función para comprobar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Función para obtener el siguiente número primo mayor que un número dado
    public static int siguientePrimo(int numero) {
        int siguiente = numero + 1;
        while (true) {
            if (esPrimo(siguiente)) {
                return siguiente;
            }
            siguiente ++;
        }
    }

    // Función para calcular la potencia de un número
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // Función para contar el número de dígitos en un número entero
    public static int digitos(int numero) {
        return Integer.toString(numero).length();
    }

    // Función para invertir un número
    public static int voltea(int numero) {
        int numeroInvertido = 0;
        while (numero != 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }
        return numeroInvertido;
    }

    // Función para obtener un dígito en una posición específica de un número
    public static int digitoN(int numero, int posicion) {
        int numeroInvertido = voltea(numero);
        int digito = -1;
        for (int i = 0; i <= posicion; i ++) {
            digito = numeroInvertido % 10;
            numeroInvertido /= 10;
        }
        return digito;
    }

    // Función para encontrar la posición de la primera ocurrencia de un dígito en un número
    public static int posicionDeDigito(int numero, int digito) {
        int numeroInvertido = voltea(numero);
        int posicion = 0;
        while (numeroInvertido != 0) {
            if (numeroInvertido % 10 == digito) {
                return posicion;
            }
            numeroInvertido /= 10;
            posicion ++;
        }
        return -1;
    }

    // Función para quitar dígitos por detrás de un número
    public static int quitaPorDetras(int numero, int n) {
        return numero / (int) Math.pow(10, n);
    }

    // Función para quitar dígitos por delante de un número
    public static int quitaPorDelante(int numero, double n) {
        int longitud = digitos(numero);
        return numero % (int) Math.pow(10, longitud - n);
    }

    // Función para añadir un dígito por detrás de un número
    public static int pegaPorDetras(int numero, int digito) {
        return numero * 10 + digito;
    }

    // Función para añadir un dígito por delante de un número
    public static int pegaPorDelante(int numero, int digito) {
        return Integer.parseInt(digito + Integer.toString(numero));
    }

    // Función para obtener un trozo de número dado un rango de posiciones
    public static int trozoDeNumero(int numero, int inicio, int fin) {
        String numeroStr = Integer.toString(numero);
        String trozoStr = numeroStr.substring(inicio, fin + 1);
        return Integer.parseInt(trozoStr);
    }

    // Función para juntar dos números
    public static int juntaNumeros(int numero1, int numero2) {
        return Integer.parseInt(Integer.toString(numero1) + numero2);
    }

    private exercise1_14() {}
}
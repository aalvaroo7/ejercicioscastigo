import java.util.Arrays;
public class MultiplosDeCinco {
    public static void main(String[] args) {
        int begin = 1;
        int end = 100;

        int[] multiplosDeCinco = obtenerMultiplosDeCinco(begin, end);

        System.out.println("Múltiplos de 5 entre " + begin + " y " + end + ":");
        for (int multiplo : multiplosDeCinco) {
            System.out.print(multiplo + " ");
        }

        int suma = sumarArray(multiplosDeCinco);
        System.out.println("\nSuma de los múltiplos de 5: " + suma);
    }

    public static int[] obtenerMultiplosDeCinco(int begin, int end) {
        int cantidad = (end - begin) / 5 + 1;
        int[] multiplos = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            multiplos[i] = begin + i * 5;
        }
        return multiplos;
    }

    public static int sumarArray(int[] array) {
        int suma = 0;
        for (int elemento : array) {
            suma += elemento;
        }
        return suma;
    }
}

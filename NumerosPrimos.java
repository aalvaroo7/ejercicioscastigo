import java.util.Scanner;
public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el valor de N para los números primos: ");
        int N = sc.nextInt();

        int[] primos = obtenerPrimerosNPrimos(N);

        System.out.println("Los primeros " + N + " números primos son:");
        for (int i = 0; i < N; i++) {
            System.out.print(primos[i] + " ");
        }
        System.out.println();
        sc.close();
    }

    public static int[] obtenerPrimerosNPrimos(int N) {
        int[] primos = new int[N];
        int contador = 0;
        int numero = 2;

        while (contador < N) {
            if (esPrimo(numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }

        return primos;
    }

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
}

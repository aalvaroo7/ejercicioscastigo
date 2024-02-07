import java.util.Scanner;
public class EstadisticasArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array dinámico para almacenar los números
        int[] numeros = new int[100]; // Puedes ajustar el tamaño según tus necesidades
        int contador = 0;

        // Leer números hasta que se introduzca un 0
        int numero;
        do {
            System.out.print("Introduce un número entero (0 para terminar): ");
            numero = scanner.nextInt();
            if (numero != 0) {
                numeros[contador] = numero;
                contador++;
            }
        } while (numero != 0);

        scanner.close();

        // Calcular la media, el mínimo y el máximo
        double media = calcularMedia(numeros, contador);
        int minimo = calcularMinimo(numeros, contador);
        int maximo = calcularMaximo(numeros, contador);

        // Mostrar los resultados
        System.out.println("Media: " + media);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
    }

    public static double calcularMedia(int[] array, int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += array[i];
        }
        return (double) suma / n;
    }

    public static int calcularMinimo(int[] array, int n) {
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int calcularMaximo(int[] array, int n) {
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

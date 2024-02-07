import java.util.Random;
import java.util.Scanner;
public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la dimensión N de la matriz cuadrada: ");
        int n = scanner.nextInt();

        int[][] matriz = generarMatrizSimetrica(n);

        System.out.println("Matriz simétrica generada:");
        imprimirMatriz(matriz);
    }

    public static int[][] generarMatrizSimetrica(int n) {
        int[][] matriz = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int numeroAleatorio = random.nextInt(100); // Rango de números aleatorios (0-99)
                matriz[i][j] = numeroAleatorio;
                matriz[j][i] = numeroAleatorio; // Simetría: asignamos el mismo valor en la posición opuesta
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

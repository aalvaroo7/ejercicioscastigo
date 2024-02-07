import java.util.Scanner;
public class ProductoEscalarVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la dimensión N de los vectores: ");
        int n = scanner.nextInt();

        double[] vector1 = leerVector(n);
        double[] vector2 = leerVector(n);

        double productoEscalar = calcularProductoEscalar(vector1, vector2);

        System.out.println("El producto escalar de los vectores es: " + productoEscalar);
    }

    public static double[] leerVector(int n) {
        Scanner scanner = new Scanner(System.in);
        double[] vector = new double[n];

        System.out.println("Introduce los elementos del vector (uno por uno):");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextDouble();
        }

        return vector;
    }

    public static double calcularProductoEscalar(double[] vector1, double[] vector2) {
        double producto = 0;
        for (int i = 0; i < vector1.length; i++) {
            producto += vector1[i] * vector2[i];
        }
        return producto;
    }
}

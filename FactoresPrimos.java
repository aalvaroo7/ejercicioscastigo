import java.util.ArrayList;
import java.util.Scanner;
public class FactoresPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> factoresPrimos = descomponerEnFactoresPrimos(numero);

        System.out.print("Los factores primos de " + numero + " son: ");
        for (int factor : factoresPrimos) {
            System.out.print(factor + " ");
        }
    }

    public static ArrayList<Integer> descomponerEnFactoresPrimos(int numero) {
        ArrayList<Integer> factoresPrimos = new ArrayList<>();
        int divisor = 2;

        while (numero > 1) {
            while (numero % divisor == 0) {
                factoresPrimos.add(divisor);
                numero /= divisor;
            }
            divisor++;
        }

        return factoresPrimos;
    }
}

import java.util.Scanner;

    public class MinMaxLista {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;
            int minimo = Integer.MAX_VALUE; // Inicializamos con el máximo valor posible
            int maximo = Integer.MIN_VALUE; // Inicializamos con el mínimo valor posible

            System.out.println("Introduce números enteros positivos (introduce un número negativo para finalizar):");

            while (true) {
                try {
                    numero = Integer.parseInt(scanner.nextLine());

                    if (numero < 0) {
                        break; // Salimos del bucle si se ingresa un número negativo
                    }

                    // Actualizamos los valores mínimo y máximo
                    minimo = Math.min(minimo, numero);
                    maximo = Math.max(maximo, numero);
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, introduce un número válido.");
                }
            }

            System.out.println("El mínimo es: " + minimo);
            System.out.println("El máximo es: " + maximo);
        }
    }


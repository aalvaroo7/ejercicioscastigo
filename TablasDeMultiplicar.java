public class TablasDeMultiplicar {
    public static void main(String[] args) {
        int N = 10; // Los 10 primeros números naturales

        int[][] tablas = obtenerTablasDeMultiplicar(N);

        for (int i = 0; i < N; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + tablas[i][j]);
            }
            System.out.println(); // Línea en blanco para separar las tablas
        }
    }

    public static int[][] obtenerTablasDeMultiplicar(int N) {
        int[][] tablas = new int[N][10];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = i * j;
            }
        }
        return tablas;
    }
}

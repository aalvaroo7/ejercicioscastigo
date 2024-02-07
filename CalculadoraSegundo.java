public class CalculadoraSegundo {

    public static void main(String[] args) {
        int diasEnUnAnio = 365;
        int horasEnUnDia = 24;
        int minutosEnUnaHora = 60;
        int segundosEnUnMinuto = 60;

        // Calculamos el número total de segundos en un año
        long segundosEnUnAnio = calcularSegundosEnAnio(diasEnUnAnio);

        System.out.println("Segundos en un año: " + segundosEnUnAnio);
    }

    // Función para calcular el número de segundos en un año
    public static long calcularSegundosEnAnio(int diasEnUnAnio) {
        long segundosEnUnAnio = diasEnUnAnio * 24L * 60 * 60;
        return segundosEnUnAnio;
    }
}

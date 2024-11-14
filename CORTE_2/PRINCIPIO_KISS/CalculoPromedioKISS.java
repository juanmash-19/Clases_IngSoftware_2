
import java.util.Arrays;

public class CalculoPromedioKISS {

    // Código sin aplicar el principio KISS
    public static double calcularPromedioSinKISS(int[] numeros) {
        int sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];
        }
        
        if (numeros.length == 0) {
            return 0;
        } else {
            return (double) sum / numeros.length;
        }
    }

    // Código aplicando el principio KISS
    public static double calcularPromedioConKISS(int[] numeros) {
        return Arrays.stream(numeros).average().orElse(0);
    }

    public static void main(String[] args) {
        int[] numeros = {5, 10, 15};

        double promedioSinKISS = calcularPromedioSinKISS(numeros);
        double promedioConKISS = calcularPromedioConKISS(numeros);

        System.out.println("Promedio sin aplicar KISS: " + promedioSinKISS);
        System.out.println("Promedio aplicando KISS: " + promedioConKISS);
    }
}

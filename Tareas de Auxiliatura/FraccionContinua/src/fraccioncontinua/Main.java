package fraccioncontinua;

import java.util.Scanner;

/**
 * Clase principal que ejecuta el programa para calcular la fracción continua.
 */
public class Main {

    /**
     * Método principal que lee la entrada del usuario, calcula la fracción y muestra el resultado.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el valor de N
        System.out.println("Introduce el valor de N:");
        int N = scanner.nextInt();

        // Calcular la fracción continua de nivel N
        Fraccion resultado = calcularFraccionContinua(N);

        // Mostrar el numerador de la fracción
        System.out.println("El numerador de la fracción continua de nivel " + N + " es: " + resultado.getNumerador());

        // Cerrar el objeto Scanner
        scanner.close();
    }

    /**
     * Calcula la fracción continua de nivel n.
     * 
     * @param n Nivel de la fracción continua.
     * @return La fracción continua de nivel n.
     */
    public static Fraccion calcularFraccionContinua(int n) {
        if (n == 1) {
            return new Fraccion(1, 2); // P1 = 1/2
        } else {
            Fraccion anterior = calcularFraccionContinua(n - 1);
            int nuevoNumerador = anterior.getDenominador();
            int nuevoDenominador = anterior.getNumerador() + anterior.getDenominador();
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
    }
}

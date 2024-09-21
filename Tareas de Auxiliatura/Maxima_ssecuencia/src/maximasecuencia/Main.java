package maximasecuencia;

import java.util.Scanner;

/**
 * Clase principal que ejecuta el programa para encontrar la secuencia máxima lexicográficamente.
 */
public class Main {

    /**
     * Método principal que lee la entrada del usuario, ordena los números y muestra el resultado.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer el número de elementos
        System.out.println("Introduce el número de elementos:");
        int N = scanner.nextInt();
        Integer[] numeros = new Integer[N];

        // Leer los números
        System.out.println("Introduce los números:");
        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Ordenar los números lexicográficamente
        Integer[] resultado = Ordenador.ordenarLexicograficamente(numeros);

        // Mostrar el resultado
        System.out.println("Secuencia máxima lexicográficamente:");
        for (int numero : resultado) {
            System.out.print(numero + " ");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

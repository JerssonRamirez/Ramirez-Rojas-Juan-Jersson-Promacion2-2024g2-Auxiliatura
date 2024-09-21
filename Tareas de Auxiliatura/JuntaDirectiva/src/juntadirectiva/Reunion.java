package juntadirectiva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reunion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Leer el número de directores N y el tiempo máximo de la reunión K
            System.out.println("Introduce el número de directores (N): ");
            int N = scanner.nextInt();
            
            System.out.println("Introduce el tiempo máximo de la reunión en minutos (K): ");
            int K = scanner.nextInt();
        
            // Cálculo del tiempo máximo por discurso
            int tiempoMaximoPorDiscurso = calcularTiempoMaximo(N, K);
            
            // Imprimir el resultado
            System.out.println("El tiempo máximo por discurso es: " + tiempoMaximoPorDiscurso);
        
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Asegúrate de introducir números enteros.");
        } finally {
            scanner.close();
        }
    }

    public static int calcularTiempoMaximo(int N, int K) {
        // Tiempo total = tiempo de los discursos + tiempo de las pausas
        // N directores hablan, pero hay N-1 pausas de 1 minuto
        // tiempoTotal = N * t + (N - 1)
        
        // Para encontrar el tiempo máximo por discurso (t), necesitamos
        // despejar t de la ecuación:
        // K = N * t + (N - 1)
        // t = (K - (N - 1)) / N
        
        return (K - (N - 1)) / N;
    }
}



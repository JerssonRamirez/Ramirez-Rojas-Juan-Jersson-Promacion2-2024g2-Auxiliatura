package rotacionmatriz;

import java.util.Scanner;

public class RotarMatriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el tamaño de la matriz
        System.out.print("Introduce el tamaño de la matriz (N): ");
        int N = scanner.nextInt();

        // Leer los elementos de la matriz
        int[][] matriz = new int[N][N];
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Copiar matriz original para compararla después
        int[][] matrizOriginal = copiarMatriz(matriz);

        // Rotar la matriz hasta que vuelva a la forma original
        int rotaciones = 0;
        do {
            rotar90Antihorario(matriz);
            rotaciones++;
        } while (!sonMatricesIguales(matriz, matrizOriginal));

        // Imprimir el número de rotaciones necesarias
        System.out.println("Número de rotaciones necesarias: " + rotaciones);

        scanner.close();
    }

    // Función para rotar la matriz 90 grados en sentido antihorario
    public static void rotar90Antihorario(int[][] matriz) {
        int N = matriz.length;
        int[][] temp = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[N - j - 1][i] = matriz[i][j];
            }
        }

        // Copiar la matriz rotada de vuelta a la original
        for (int i = 0; i < N; i++) {
            System.arraycopy(temp[i], 0, matriz[i], 0, N);
        }
    }

    // Función para copiar una matriz
    public static int[][] copiarMatriz(int[][] matriz) {
        int N = matriz.length;
        int[][] copia = new int[N][N];
        for (int i = 0; i < N; i++) {
            System.arraycopy(matriz[i], 0, copia[i], 0, N);
        }
        return copia;
    }

    // Función para verificar si dos matrices son iguales
    public static boolean sonMatricesIguales(int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

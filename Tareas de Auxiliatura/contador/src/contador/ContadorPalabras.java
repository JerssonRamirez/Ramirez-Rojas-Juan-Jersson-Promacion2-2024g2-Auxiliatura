package contador;

import java.util.List;

public class ContadorPalabras {
    public static void main(String[] args) {
        // Ejemplo de uso
        List<String> palabras = List.of("manzana", "mango", "pera", "melón", "plátano");
        char letra = 'm';
        int contador = contarPalabrasQueEmpiezanCon(palabras, letra);
        System.out.println("Número de palabras que comienzan con '" + letra + "': " + contador);
    }

    public static int contarPalabrasQueEmpiezanCon(List<String> palabras, char letra) {
        int contador = 0;
        for (String palabra : palabras) {
            if (palabra.charAt(0) == letra) {
                contador++;
            }
        }
        return contador;
    }
}

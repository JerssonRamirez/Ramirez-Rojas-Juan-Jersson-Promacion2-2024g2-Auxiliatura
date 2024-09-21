package sistemabotin;

import java.util.Random;
import java.util.Scanner;

public class Botin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enfrentaste a un enemigo. ¡Veamos qué botín obtuviste!");
        generarBotin();
        
        scanner.close();
    }

    public static void generarBotin() {
        Random random = new Random();
        
        // Definición de los tipos de botín
        String[] tipos = {"Arma", "Escudo", "Modificador"};
        String[] rarezas = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
        
        // Seleccionar tipo y rareza aleatoriamente
        String tipo = tipos[random.nextInt(tipos.length)];
        String rareza = rarezas[random.nextInt(rarezas.length)];
        
        // Atributos adicionales
        float valor1 = random.nextFloat() * 100; // Simulación de atributo aleatorio (por ejemplo, daño)
        float valor2 = random.nextFloat() * 100; // Simulación de otro atributo aleatorio
        
        // Imprimir resultado
        System.out.println("Has obtenido un botín:");
        System.out.println("Tipo: " + tipo);
        System.out.println("Rareza: " + rareza);
        System.out.println("Atributo 1 (por ejemplo, daño): " + valor1);
        System.out.println("Atributo 2 (por ejemplo, absorción): " + valor2);
    }
}

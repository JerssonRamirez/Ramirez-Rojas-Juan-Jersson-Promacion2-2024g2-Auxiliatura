package cartas;

public class Main {
    public static void main(String[] args) {
        // Crear una carta normal
        CartaNormal cartaNormal = new CartaNormal(5, "Corazones");
        cartaNormal.mostrarCarta();
        cartaNormal.jugar();

        // Crear una carta especial
        CartaEspecial cartaEspecial = new CartaEspecial(1, "Espadas");
        cartaEspecial.mostrarCarta();
        cartaEspecial.jugar();
        cartaEspecial.realizarAccion();
    }
}

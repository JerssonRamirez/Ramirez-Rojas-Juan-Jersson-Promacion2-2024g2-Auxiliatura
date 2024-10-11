package cartas;

public class CartaNormal extends Carta {

    public CartaNormal(int valor, String palo) {
        super(valor, palo); // Llamamos al constructor de la clase base "Carta"
    }

    @Override
    public void jugar() {
        System.out.println("Se ha jugado una carta normal: " + valor + " de " + palo);
    }
}

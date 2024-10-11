package cartas;

public class CartaEspecial extends Carta implements Accionable {

    public CartaEspecial(int valor, String palo) {
        super(valor, palo); 
    }

    @Override
    public void jugar() {
        System.out.println("Se ha jugado una carta especial: " + valor + " de " + palo);
    }

    @Override
    public void realizarAccion() {
        System.out.println("Se ha realizado una acción especial con la carta " + valor + " de " + palo);
    }
}

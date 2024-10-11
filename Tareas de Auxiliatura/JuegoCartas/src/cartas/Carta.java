package cartas;

public abstract class Carta {
    protected int valor;
    protected String palo;

    public Carta(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public void mostrarCarta() {
        System.out.println("Carta: " + valor + " de " + palo);
    }

    public abstract void jugar(); // Método abstracto que será implementado por las subclases
}

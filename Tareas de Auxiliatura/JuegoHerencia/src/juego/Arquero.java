package juego;

public class Arquero extends Personaje {
    public Arquero(String nombre, int nivel, int puntosDeVida, int destreza) {
        super(nombre, nivel, puntosDeVida);
    }

    public void dispararFlecha() {
        System.out.println(nombre + " ha disparado una flecha.");
    }
}

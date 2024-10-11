package juego;

public class Mago extends Personaje {
    public Mago(String nombre, int nivel, int puntosDeVida, int mana) {
        super(nombre, nivel, puntosDeVida);
    }

    public void lanzarHechizo() {
        System.out.println(nombre + " ha lanzado un hechizo.");
    }
}

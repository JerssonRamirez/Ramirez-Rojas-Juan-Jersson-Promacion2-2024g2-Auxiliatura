package juego;

public class Guerrero extends Personaje {
    public Guerrero(String nombre, int nivel, int puntosDeVida, int fuerza) {
        super(nombre, nivel, puntosDeVida);
    }

    public void atacar() {
        System.out.println(nombre + " ha realizado un ataque.");
    }
}

package juego;

public class Zombie extends Enemigo {
    public Zombie(String nombre, int puntosDeVida, int dañoBase) {
        super(nombre, puntosDeVida, dañoBase);
    }

    @Override
    public int atacar() {
        puntosDeVida += 5;  // Se regenera 5 puntos de vida
        return dañoBase;
    }
}

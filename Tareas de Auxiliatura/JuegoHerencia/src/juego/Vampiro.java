package juego;

public class Vampiro extends Enemigo {
    public Vampiro(String nombre, int puntosDeVida, int dañoBase) {
        super(nombre, puntosDeVida, dañoBase);
    }

    @Override
    public int atacar() {
        int daño = super.atacar();
        puntosDeVida += daño / 2;  // Roba vida
        return daño;
    }
}

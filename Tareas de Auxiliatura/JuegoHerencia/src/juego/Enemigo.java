package juego;

public class Enemigo {
    protected String nombre;
    protected int puntosDeVida;
    protected int dañoBase;

    public Enemigo(String nombre, int puntosDeVida, int dañoBase) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.dañoBase = dañoBase;
    }

    public int atacar() {
        return dañoBase;
    }

    public void recibirDaño(int daño) {
        puntosDeVida -= daño;
        System.out.println(nombre + " ha recibido " + daño + " puntos de daño.");
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }
}

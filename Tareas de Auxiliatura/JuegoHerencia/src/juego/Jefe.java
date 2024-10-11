package juego;

public class Jefe extends Enemigo {
    private double multiplicadorDaño;

    public Jefe(String nombre, int puntosDeVida, int dañoBase, double multiplicadorDaño) {
        super(nombre, puntosDeVida, dañoBase);
        this.multiplicadorDaño = multiplicadorDaño;
    }

    public void hablar() {
        System.out.println(nombre + ": ¡Serás destruido!");
    }

    public int ataqueCritico() {
        return (int) (dañoBase * multiplicadorDaño);
    }
}

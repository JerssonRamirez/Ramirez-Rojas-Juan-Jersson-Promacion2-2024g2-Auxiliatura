package juego;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Gandalf", generarNivelAleatorio(), 100, 50);
        Guerrero guerrero = new Guerrero("Conan", generarNivelAleatorio(), 100, 30);

        Random rand = new Random();

        while (mago.puntosDeVida > 0 && guerrero.puntosDeVida > 0) {
            int dañoMago = rand.nextInt(11) + 10;
            guerrero.recibirDaño(dañoMago);
            mago.lanzarHechizo();
            mago.mostrarEstado();
            guerrero.mostrarEstado();

            if (guerrero.puntosDeVida <= 0) {
                System.out.println(guerrero.nombre + " ha muerto.");
                break;
            }

            int dañoGuerrero = rand.nextInt(11) + 10;
            mago.recibirDaño(dañoGuerrero);
            guerrero.atacar();
            mago.mostrarEstado();
            guerrero.mostrarEstado();

            if (mago.puntosDeVida <= 0) {
                System.out.println(mago.nombre + " ha muerto.");
                break;
            }
        }
    }

    public static int generarNivelAleatorio() {
        return new Random().nextInt(10) + 1;
    }
}

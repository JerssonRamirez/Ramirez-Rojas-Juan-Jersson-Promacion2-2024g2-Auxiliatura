package granjas;

public class Lobo extends Animal implements Carnivoro {

    public Lobo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El lobo aúlla.");
    }

    @Override
    public void cazar() {
        System.out.println("El lobo " + nombre + " está cazando.");
    }
}

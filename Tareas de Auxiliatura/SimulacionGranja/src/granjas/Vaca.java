package granjas;

public class Vaca extends Animal implements Productor {

    public Vaca(String nombre, int edad) {
        super(nombre, edad); // Llamamos al constructor de la clase base "Animal"
    }

    @Override
    public void hacerSonido() {
        System.out.println("La vaca " + nombre + " hace: Muuuu");
    }

    @Override
    public void producir() {
        System.out.println("La vaca " + nombre + " está produciendo leche.");
    }
}

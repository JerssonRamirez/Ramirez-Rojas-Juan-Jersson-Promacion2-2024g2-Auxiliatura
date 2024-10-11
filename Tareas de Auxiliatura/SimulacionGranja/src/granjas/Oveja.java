package granjas;

public class Oveja extends Animal implements Productor {

    public Oveja(String nombre, int edad) {
        super(nombre, edad); // Llamamos al constructor de la clase base "Animal"
    }

    @Override
    public void hacerSonido() {
        System.out.println("La oveja " + nombre + " hace: Beeee");
    }

    @Override
    public void producir() {
        System.out.println("La oveja " + nombre + " está produciendo lana.");
    }
}

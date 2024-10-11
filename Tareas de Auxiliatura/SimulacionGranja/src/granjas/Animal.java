package granjas;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Animal: " + nombre + ", Edad: " + edad + " años");
    }

    public abstract void hacerSonido(); // Método abstracto para ser implementado por las subclases
}

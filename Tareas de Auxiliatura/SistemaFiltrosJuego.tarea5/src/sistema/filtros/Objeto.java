package sistema.filtros;

public class Objeto {
    private String nombre;
    private int peso;

    public Objeto(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Objeto{" + "nombre='" + nombre + '\'' + ", peso=" + peso + '}';
    }
}

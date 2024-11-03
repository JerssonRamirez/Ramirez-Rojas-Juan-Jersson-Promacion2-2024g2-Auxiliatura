package sistema.tareas;

public class Principal {
    public static void main(String[] args) {
        Aventura aventura = new Aventura();

        // Agregar tareas usando expresiones lambda
        aventura.agregarTarea(() -> System.out.println("Recolectando recursos..."));
        aventura.agregarTarea(() -> System.out.println("Explorando una cueva..."));
        aventura.agregarTarea(() -> System.out.println("Enfrentando a un enemigo..."));
        aventura.agregarTarea(() -> System.out.println("Descansando en el campamento..."));

        // Iniciar la aventura, ejecutando todas las tareas
        aventura.iniciar();
    }
}

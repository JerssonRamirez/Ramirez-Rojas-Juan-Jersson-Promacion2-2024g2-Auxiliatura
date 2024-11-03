package sistema.bonificaciones;

public class Principal {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Alice", 100);
        Jugador jugador2 = new Jugador("Bob", 150);

        // Bonificación de tipo multiplicador (20% adicional)
        CalculadoraBonificacion bonificacion20 = puntosBase -> puntosBase * 20 / 100;

        // Bonificación fija de 50 puntos
        CalculadoraBonificacion bonificacionFija = puntosBase -> 50;

        // Aplicar bonificaciones
        jugador1.aplicarBonificacion(bonificacion20);
        jugador2.aplicarBonificacion(bonificacionFija);

        // Mostrar resultados
        System.out.println("Jugador: " + jugador1.getNombre() + ", Puntos: " + jugador1.getPuntos());
        System.out.println("Jugador: " + jugador2.getNombre() + ", Puntos: " + jugador2.getPuntos());
    }
}

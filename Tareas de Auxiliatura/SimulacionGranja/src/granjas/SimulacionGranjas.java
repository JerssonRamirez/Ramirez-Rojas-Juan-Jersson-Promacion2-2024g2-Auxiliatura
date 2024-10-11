package granjas;

public class SimulacionGranjas {
    public static void main(String[] args) {
        Vaca vaca = new Vaca("Jessie", 3);
        vaca.mostrarInfo();
        vaca.hacerSonido();
        vaca.producir(); // Usamos el nuevo método

        Oveja oveja = new Oveja("katy", 2);
        oveja.mostrarInfo();
        oveja.hacerSonido();
        oveja.producir(); // Usamos el nuevo método

        Lobo lobo = new Lobo("Felix", 4);
        lobo.mostrarInfo();
        lobo.hacerSonido();
        lobo.cazar(); // Usamos el nuevo método
    }
}

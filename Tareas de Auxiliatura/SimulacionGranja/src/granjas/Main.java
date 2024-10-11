package granjas;

public class Main {
    public static void main(String[] args) {
        
        Vaca vaca = new Vaca("Jacinta", 5);
        vaca.mostrarInfo();
        vaca.hacerSonido();
        vaca.producir();

        Oveja oveja = new Oveja("Jessie", 3);
        oveja.mostrarInfo();
        oveja.hacerSonido();
        oveja.producir();
    }
}

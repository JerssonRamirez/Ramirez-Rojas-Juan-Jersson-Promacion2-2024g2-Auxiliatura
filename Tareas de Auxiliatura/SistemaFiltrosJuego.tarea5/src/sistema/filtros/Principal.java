package sistema.filtros;

import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregar objetos al inventario
        inventario.agregarObjeto(new Objeto("Espada", 10));
        inventario.agregarObjeto(new Objeto("Escudo", 15));
        inventario.agregarObjeto(new Objeto("Poción", 2));
        inventario.agregarObjeto(new Objeto("Armadura", 20));

        // Filtrar objetos pesados (peso > 10)
        List<Objeto> objetosPesados = inventario.filtrarObjetos(objeto -> objeto.getPeso() > 10);
        System.out.println("Objetos pesados (peso > 10): " + objetosPesados);

        // Filtrar objetos ligeros (peso <= 10)
        List<Objeto> objetosLigeros = inventario.filtrarObjetos(objeto -> objeto.getPeso() <= 10);
        System.out.println("Objetos ligeros (peso <= 10): " + objetosLigeros);
    }
}

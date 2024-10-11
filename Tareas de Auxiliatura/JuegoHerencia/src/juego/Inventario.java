package juego;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<String> items;

    public Inventario() {
        items = new ArrayList<>();
    }

    public void agregarItem(String item) {
        items.add(item);
        System.out.println("Item " + item + " añadido al inventario.");
    }

    public void mostrarItems() {
        System.out.println("Inventario: " + items);
    }
}

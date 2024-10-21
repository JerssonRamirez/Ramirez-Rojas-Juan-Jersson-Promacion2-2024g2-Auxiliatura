package tienda;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));
        store.addProduct(new Accessory("Mouse", 20.0));
        store.addProduct(new Accessory("Keyboard", 30.0));

        // Apply a 10% discount
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        store.applyDiscount(tenPercentDiscount);

        // Apply a fixed discount of $50 for electronics
        Discountable fiftyDollarsDiscount = product -> {
            if (product instanceof Electronic) {
                return product.getPrice() - 50.0;
            }
            return product.getPrice(); // No discount for accessories
        };
        store.applyDiscount(fiftyDollarsDiscount);

        // Apply a variable discount (15% for electronics, 5% for accessories)
        Discountable variableDiscount = product -> {
            if (product instanceof Electronic) {
                return product.getPrice() * 0.85;
            } else if (product instanceof Accessory) {
                return product.getPrice() * 0.95;
            }
            return product.getPrice();
        };
        store.applyDiscount(variableDiscount);
    }
}

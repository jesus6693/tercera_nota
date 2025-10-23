package unidad2.arreglos;
    
public class Main {
    public static void main(String[] args) {
        // Crear inventario
        Inventory inventory = new Inventory();

        // Agregar productos
        inventory.addProduct(new Product("P001", "Laptop", 1200.99));
        inventory.addProduct(new Product("P002", "Smartphone", 799.49));
        inventory.addProduct(new Product("P003", "Wireless Mouse", 25.75));

        // Mostrar todos los productos
        inventory.showProducts();

        // Buscar un producto existente
        inventory.searchProduct("P002");

        // Intentar buscar un producto que no existe (para probar el try-catch)
        inventory.searchProduct("P999");
    }
}
package actividaduni2otra;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        inventario.agregarProducto(new Producto("A001", "Mouse inalámbrico", 15.99));
        inventario.agregarProducto(new Producto("B002", "Teclado mecánico", 45.50));
        inventario.agregarProducto(new Producto("C003", "Monitor 24 pulgadas", 120.00));

        inventario.mostrarProductos();

        System.out.println("\nBuscando producto con código B002:");
        Producto encontrado = inventario.buscarProducto("B002");
        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado.nombre + ", Precio: $" + encontrado.precio);
        }

        System.out.println("\nBuscando producto con código X999:");
        Producto noEncontrado = inventario.buscarProducto("X999");
    }
}

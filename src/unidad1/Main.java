package unidad1;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 1200.50, 10);
        Producto p2 = new Producto("Auriculares", 75.99, 20);

        System.out.println("Información inicial de los productos:");
        p1.mostrarProducto();
        p2.mostrarProducto();


        System.out.println("\nVendiendo productos...");
        p1.vender(3);  
        p2.vender(25);  

        System.out.println("\nReabasteciendo productos...");
        p2.reabastecer(10);

        System.out.println("\nInformación final de los productos:");
        p1.mostrarProducto();
        p2.mostrarProducto();
    }
}


package actividadcasaunidad1;
public class Productos {
    private String nombre;
    private double precio;
    private int stock;

    public Productos(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void showProduct() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }

    public void sell(int cantidad) {
        if (cantidad > stock) {
            System.out.println("No hay suficiente stock para vender " + cantidad + " unidades de " + nombre);
        } else {
            stock -= cantidad;
            System.out.println("Vendidas " + cantidad + " unidades de " + nombre);
        }
    }

    public void restock(int cantidad) {
        stock += cantidad;
        System.out.println("Repuestos " + cantidad + " unidades de " + nombre);
    }
}
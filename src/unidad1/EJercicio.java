package unidad1;

class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void vender(int cantidadVendida) {
        if (cantidadVendida <= cantidad) {
            cantidad -= cantidadVendida;
            System.out.println(cantidadVendida + " unidades de " + nombre + " vendidas correctamente.");
        } else {
            System.out.println("No hay suficiente stock para vender " + cantidadVendida + " unidades de " + nombre + ".");
            System.out.println("Stock disponible: " + cantidad + " unidades.");
        }
    }

    public void reabastecer(int cantidadNueva) {
        cantidad += cantidadNueva;
        System.out.println(cantidadNueva + " unidades de " + nombre + " añadidas al inventario.");
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + cantidad);
    }
}

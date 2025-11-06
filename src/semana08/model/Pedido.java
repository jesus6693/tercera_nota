package semana08.model;

import java.util.List;

public class Pedido extends Cliente {
    public List<Producto> productos;
    

    public Pedido(String numero, String nombre,List<Producto> productos){
        super(numero, nombre);
        this.productos=productos;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        // Validar que la cantidad sea positiva
        if (cantidad <= 0) {
            System.out.println("La cantidad de " + producto.getNombre() + " debe ser mayor que cero.");
            return;
        }

        // Añadir el producto y su cantidad al pedido
        productos.add(producto);
        cantidades.add(cantidad);
        System.out.println(cantidad + " " + producto.getNombre() + "(s) agregado(s) al pedido.");
    }

    // Método para realizar el pedido y mostrar el resumen
    public void realizarPedido() {
        DecimalFormat formatoPrecio = new DecimalFormat("$#,###.00");
        double subtotal = 0;
        double totalPedido = 0;

        // Mostrar resumen del pedido
        System.out.println("\nResumen del Pedido:");
        System.out.println("Cliente: " + this.numero + " - " + this.nombre);
        System.out.println("-------------------------------------------------");

        // Recorrer todos los productos y cantidades
        for (int i = 0; i < productos.size(); i++) {
            Producto producto = productos.get(i);
            int cantidad = cantidades.get(i);

            // Calcular el precio de acuerdo con la cantidad
            double precioPorUnidad = producto.obtenerPrecio(cantidad);
            double totalProducto = precioPorUnidad * cantidad;

            // Mostrar el total por producto
            System.out.println(producto.getNombre() + " (Cantidad: " + cantidad + ")");
            System.out.println("Precio por unidad: " + formatoPrecio.format(precioPorUnidad));
            System.out.println("Total por " + producto.getNombre() + ": " + formatoPrecio.format(totalProducto));

            // Acumular en el subtotal
            subtotal += totalProducto;
        }

        // Aplicar descuento si el subtotal es mayor a $60,000
        if (subtotal > 60000) {
            totalPedido = subtotal * 0.95; // Aplicar un descuento del 5%
            System.out.println("\n¡Se ha aplicado un descuento del 5%!");
        } else {
            totalPedido = subtotal; // No hay descuento
        }

        // Mostrar el subtotal y el total final
        System.out.println("-------------------------------------------------");
        System.out.println("Subtotal: " + formatoPrecio.format(subtotal));
        System.out.println("Total del Pedido (con descuento, si aplica): " + formatoPrecio.format(totalPedido));
    }
}

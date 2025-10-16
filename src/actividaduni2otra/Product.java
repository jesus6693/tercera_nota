package actividaduni2otra;

import java.util.ArrayList;
import java.util.HashMap;

class Producto {
    String codigo;
    String nombre;
    double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
}

class Inventario {
    private ArrayList<Producto> productos;
    private HashMap<String, Producto> catalogo;

    public Inventario() {
        productos = new ArrayList<>();
        catalogo = new HashMap<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
        catalogo.put(p.codigo, p);
    }

    public void mostrarProductos() {
        System.out.println("Lista de productos:");
        for (Producto p : productos) {
            System.out.println("- Código: " + p.codigo + ", Nombre: " + p.nombre + ", Precio: $" + p.precio);
        }
    }

    public Producto buscarProducto(String codigo) {
        try {
            Producto p = catalogo.get(codigo);
            if (p == null) {
                throw new Exception("Producto con código " + codigo + " no encontrado.");
            }
            return p;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}

package semana7.Unidad2_3.java;

import java.util.ArrayList;
import java.util.HashMap;

class Product { 
    String codigo;
    String nombre;
    double precio;

    public Product(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
}

class Inventario {
    private ArrayList<Product> productos;
    private HashMap<String, Product> catalogo;

    public Inventario() {
        productos = new ArrayList<>();
        catalogo = new HashMap<>();
    }

    public void agregarProducto(Product p) {
        productos.add(p);
        catalogo.put(p.codigo, p);
    }

    public void mostrarProductos() {
        System.out.println("Lista de productos:");
        for (Product p : productos) {
            System.out.println("- Código: " + p.codigo + ", Nombre: " + p.nombre + ", Precio: $" + p.precio);
        }
    }

    public Product buscarProducto(String codigo) {
        try {
            Product p = catalogo.get(codigo);
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
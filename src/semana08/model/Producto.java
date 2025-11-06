package semana08.model;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    public String nombre;
    public double precioUnitario;
    public double precioPorVolumen;
  public int cantidadMinimaVolumen;

    public Producto(String nombre, double precioUnitario, double precioPorVolumen, int cantidadMinimaVolumen) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.precioPorVolumen = precioPorVolumen;
        this.cantidadMinimaVolumen = cantidadMinimaVolumen;
    }

    public double obtenerPrecio(int cantidad){
        if (cantidad>=cantidadMinimaVolumen) {
            return precioPorVolumen;
        }else{
            return precioUnitario;
        }
    }

      public static List<Producto> obtenerProductos() {
        List<Producto> productos = new ArrayList<>();

        // Crear los productos de la panadería
        productos.add(new Producto("Baguette", 6000, 5500, 6));
        productos.add(new Producto("Croissant", 4500, 4000, 6));
        productos.add(new Producto("Pan de Chocolate", 5500, 5000, 6));

        return productos;
    }

    public void mostrarProductos(){
        System.out.println("Baguette ($6.000, o $5.500 c/u si llevan 6 o más)");
        System.out.println("Croissant ($4.500, o $4.000 c/u desde 6)");
        System.out.println("Pan de chocolate ($5.500, o $5.000 c/u desde 6)");
    }
    
}

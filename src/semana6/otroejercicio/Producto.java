package semana6.otroejercicio;

public class Producto {
        String name;
    double price;

    
    public Producto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    
    public void showInfo() {
        System.out.println("Producto: " + name + " | Precio: $" + price);
    }

    
    public static void main(String[] args) {
        
        Producto[] productos = {
            new Producto("Laptop", 12000),
            new Producto("Celular", 8500),
            new Producto("Tablet", 6000),
            new Producto("Monitor", 4500),
            new Producto("Teclado", 700)
        };

        
        for (Producto p : productos) {
            p.showInfo();
        }
    }
}

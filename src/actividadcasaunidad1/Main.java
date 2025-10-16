package actividadcasaunidad1;
public class Main {
    public static void main(String[] args) {
        Productos prod1 = new Productos("Camiseta", 29.99, 50);
        Productos prod2 = new Productos("Pantalón", 49.95, 30);

        System.out.println("=== Información inicial ===");
        prod1.showProduct();
        System.out.println();
        prod2.showProduct();
        System.out.println();

        System.out.println("=== Vender productos ===");
        prod1.sell(10); 
        prod2.sell(35);  
        System.out.println();

    
        System.out.println("=== Información luego de ventas ===");
        prod1.showProduct();
        System.out.println();
        prod2.showProduct();
        System.out.println();
        
        System.out.println("=== Reponer stock ===");
        prod1.restock(20);
        prod2.restock(10);
        System.out.println();

        System.out.println("=== Información final ===");
        prod1.showProduct();
        System.out.println();
        prod2.showProduct();
    }
}

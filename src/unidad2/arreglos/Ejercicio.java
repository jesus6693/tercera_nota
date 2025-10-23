package unidad2.arreglos;

import java.util.ArrayList;
import java.util.HashMap;

class Product {
    String code;
    String name;
    double price;

    public Product(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Code: " + code + " | Name: " + name + " | Price: $" + price);
    }
}

class Inventory {
    ArrayList<Product> products;
    HashMap<String, Product> catalog;

    public Inventory() {
        products = new ArrayList<>();
        catalog = new HashMap<>();
    }

    public void addProduct(Product p) {
        products.add(p);
        catalog.put(p.code, p);
    }

    public void showProducts() {
        System.out.println("\nAll products in inventory:");
        for (Product p : products) {
            p.showInfo();
        }
    }

    public Product searchProduct(String code) {
        try {
            Product p = catalog.get(code);
            if (p == null) {
                throw new Exception("Product not found.");
            }
            System.out.println("\nProduct found:");
            p.showInfo();
            return p;
        } catch (Exception e) {
            System.out.println("\nError: " + e.getMessage());
            return null;
        }
    }
}


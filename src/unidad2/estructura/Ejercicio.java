package unidad2.estructura;

import java.util.ArrayList;

class Car {
    String model;
    double pricePerDay;
    boolean available;

    public Car(String model, double pricePerDay, boolean available) {
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = available;
    }

    public void showInfo() {
        System.out.println("Model: " + model + " | Price per day: $" + pricePerDay + 
                           " | Available: " + (available ? "Yes" : "No"));
    }
}

class CarRental {
    ArrayList<Car> cars;

    public CarRental() {
        cars = new ArrayList<>();
    }

    public void addCar(Car c) {
        cars.add(c);
    }
    public void showAvailableCars() {
        System.out.println("\nAvailable cars:");
        boolean anyAvailable = false;
        for (Car c : cars) {
            if (c.available) {
                c.showInfo();
                anyAvailable = true;
            }
        }
        if (!anyAvailable) {
            System.out.println("No cars available at the moment.");
        }
    }

    public double calculateTotal(Car c, int days) {
        if (c.available) {
            double total = c.pricePerDay * days;
            System.out.println("\nTotal price for " + days + " days renting " + c.model + ": $" + total);
            return total;
        } else {
            System.out.println("\nCar " + c.model + " is not available for rental.");
            return 0.0;
        }
    }

    public Car searchCar(String model) {
        for (Car c : cars) {
            if (c.model.equalsIgnoreCase(model)) {
                System.out.println("\nCar found:");
                c.showInfo();
                return c;
            }
        }
        System.out.println("\nCar not found.");
        return null;
    }
}


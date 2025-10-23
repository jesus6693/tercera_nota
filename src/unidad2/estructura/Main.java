package unidad2.estructura;

public class Main {
    public static void main(String[] args) {
        CarRental rental = new CarRental();

        rental.addCar(new Car("Toyota Corolla", 50.0, true));
        rental.addCar(new Car("Honda Civic", 60.0, false));
        rental.addCar(new Car("Ford Focus", 55.0, true));
        rental.addCar(new Car("Chevrolet Onix", 45.0, true));

        System.out.println("All cars in the system:");
        for (Car c : rental.cars) {
            c.showInfo();
        }

        rental.showAvailableCars();

        Car selected = rental.searchCar("Ford Focus");

        if (selected != null) {
            rental.calculateTotal(selected, 5);
        }
    }
}


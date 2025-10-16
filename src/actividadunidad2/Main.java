package actividadunidad2;

public class Main {
    public static void main(String[] args) {
        AlquilerDeAutos alquiler = new AlquilerDeAutos();


        alquiler.agregarAuto(new Auto("Toyota Corolla", 30.0, true));
        alquiler.agregarAuto(new Auto("Honda Civic", 35.0, false));
        alquiler.agregarAuto(new Auto("Ford Focus", 28.5, true));
        alquiler.agregarAuto(new Auto("Chevrolet Malibu", 40.0, true));


        alquiler.mostrarAutosDisponibles();

        String modeloBuscado = "Ford Focus";
        Auto autoParaAlquilar = alquiler.buscarAuto(modeloBuscado);

        if (autoParaAlquilar != null) {
            int dias = 4;
            double total = alquiler.calcularTotal(autoParaAlquilar, dias);
            if (total > 0) {
                System.out.println("Precio total por alquilar " + autoParaAlquilar.modelo + " por " + dias + " días es $" + total);
            }
        }
    }
}

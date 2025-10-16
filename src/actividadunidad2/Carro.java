package actividadunidad2;

import java.util.ArrayList;

class Auto {
    String modelo;
    double precioPorDia;
    boolean disponible;

    public Auto(String modelo, double precioPorDia, boolean disponible) {
        this.modelo = modelo;
        this.precioPorDia = precioPorDia;
        this.disponible = disponible;
    }
}

class AlquilerDeAutos {
    private ArrayList<Auto> autos;

    public AlquilerDeAutos() {
        autos = new ArrayList<>();
    }

    public void agregarAuto(Auto a) {
        autos.add(a);
    }


    public void mostrarAutosDisponibles() {
        System.out.println("Autos disponibles:");
        for (Auto a : autos) {
            if (a.disponible) {
                System.out.println("- Modelo: " + a.modelo + ", Precio por día: $" + a.precioPorDia);
            }
        }
    }

    public double calcularTotal(Auto a, int dias) {
        if (a.disponible) {
            return a.precioPorDia * dias;
        } else {
            System.out.println("Lo siento, el auto " + a.modelo + " no está disponible.");
            return 0;
        }
    }

    public Auto buscarAuto(String modelo) {
        for (Auto a : autos) {
            if (a.modelo.equalsIgnoreCase(modelo)) {
                return a;
            }
        }
        System.out.println("Auto no encontrado.");
        return null;
    }
}


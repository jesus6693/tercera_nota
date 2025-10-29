package semana06.models;

public class Moto extends Vehiculo {

    public Moto(String brand, String model, double speed) {
        super(brand, model, speed);
    }

    public void wheelie() {
        System.out.println("la moto "+getBrand()+" de modelo "+getModel()   + " hizo caballito a una velocidad de "+getSpeed() );
    }
}

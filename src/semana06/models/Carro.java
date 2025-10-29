package semana06.models;

public class Carro extends Vehiculo {

    public Carro(String brand, String model,double speed){
        super(brand, model, speed);
        
    }

    public void openDoor() {
        System.out.println("se abrio la puerta del carro "+getBrand()+" y modelo "+getModel());
    }

}

package semana06.models;

public class Vehiculo {
    private String brand;
    private String model;
    private double speed;

     

    public Vehiculo(String brand, String model,double speed){
        this.brand=brand;
        this.model=model;
        this.speed=speed;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public double getSpeed (){
        return speed;
    }

    public void accelerate(double newSpeed){
        if (newSpeed>0 ) {
            speed +=newSpeed;
            System.out.println("el vehiculo acelero "+newSpeed+"Km/h"+" ahora va a "+getSpeed()+" Km/h");
        }else{
            System.out.println("lo que acelero debe ser mayor a 0");
        }

    }

    public void curb (double newSpeed){
        if (newSpeed>0 && newSpeed<= speed) {
            speed-=newSpeed;
            System.out.println("el vehiculo freno "+newSpeed+"Km/h"+" ahora va a "+getSpeed()+" Km/h");
        }else{
            System.out.println("lo que freno debe ser mayor a 0 y debe ser menor o igual a la velocidad actual");
        }
    }
}

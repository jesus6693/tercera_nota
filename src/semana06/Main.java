package semana06;

import semana06.models.Carro;
import semana06.models.Moto;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("toyota", "2010", 40);
        Moto moto = new Moto("yamaha", "2020", 90);

        System.out.println("---------informacion--------");
        carro.accelerate(20);
        carro.curb(50);
        carro.openDoor();
        System.out.println("---------------------------");
        moto.accelerate(40);
        moto.curb(10);
        moto.wheelie();
    }
}

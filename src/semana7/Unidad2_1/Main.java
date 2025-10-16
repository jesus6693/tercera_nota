package semana7.Unidad2_1;

public class Main {
    public static void main(String[] args) {

        Paquete p1 = new Paquete("ABC123", 5.0);
        System.out.println("Antes de asignar p2 = p1:");
        p1.showPackage(); 

        Paquete p2 = p1;

        p2.setWeight(10.0);

        System.out.println("Después de modificar peso por p2:");

        p1.showPackage();  
        p2.showPackage();

        changeWeight(p1, 20.0);
        System.out.println("Después de llamar a changeWeight(p1, 20.0):");
        p1.showPackage();
    }

    public static void changeWeight(Paquete p, double newWeight) {
        p.setWeight(newWeight);
    }
}


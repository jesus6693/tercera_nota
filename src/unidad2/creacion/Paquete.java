package unidad2.creacion;

public class Paquete {
    public String code;
    public double weight;

    public Paquete(String code, double weight) {
        this.code = code;
        this.weight = weight;
    }

    public void showPaquete() {
        System.out.println("Código: " + code + ", Peso: " + weight);
    }

    public static void changeWeight(Paquete p, double newWeight) {
        if (p != null) {
            p.weight = newWeight;
        }
    }
}
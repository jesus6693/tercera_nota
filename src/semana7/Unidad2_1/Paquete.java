package semana7.Unidad2_1;

public class Paquete {
    private String trackingCode;
    private double weight;

    public Paquete(String trackingCode, double weight) {
        this.trackingCode = trackingCode;
        this.weight = weight;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void showPackage() {
        System.out.println("Tracking code: " + trackingCode + ", Weight: " + weight);
    }
}

package unidad2.creacion;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Ejercicio (subclase de Paquete)
        Paquete p1 = new Paquete("ABC123", 5.0);

        // Crear otra referencia al mismo objeto
        Paquete p2 = p1;

        // Cambiar el peso usando p2
        p2.weight = 10.0;

        // Mostrar el resultado usando p1
        System.out.print("Datos de p1: ");
        p1.showPaquete();

        // Explicación
        System.out.println("\nExplicación:");
        System.out.println("Tanto p1 como p2 apuntan al mismo objeto en memoria.");
        System.out.println("Por eso, si cambiamos el peso usando p2, el cambio también se refleja en p1.\n");

        // BONUS: probar el método changeWeight
        System.out.println("Usando el método changeWeight...");
        Paquete.changeWeight(p1, 15.5);

        // Mostrar el resultado nuevamente
        System.out.print("Datos de p1 después del cambio: ");
        p1.showPaquete();

        System.out.println("\nEl método changeWeight también modifica el mismo objeto,");
        System.out.println("porque en Java los objetos se pasan por referencia (en realidad, se pasa la referencia por valor).");
    }
}
package unidad3.usoadecuadoexcepcion;

public class Main {
    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();
        AverageCalculator calculator = new AverageCalculator();

        String nombreArchivo = "datos.txt";  // Puedes cambiar el nombre para probar

        try {
            String datos = dataLoader.loadFile(nombreArchivo);
            System.out.println("Datos cargados del archivo:");
            System.out.println(datos);

            // Por ejemplo, vamos a calcular un promedio con datos ficticios:
            int total = 100;
            int cantidad = 0;  // Para probar la excepción de división por cero

            double promedio = calculator.calcular(total, cantidad);
            System.out.println("Promedio: " + promedio);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EmptyFileException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operación finalizada.");
        }
    }
}
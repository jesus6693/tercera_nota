package unidad3.usoadecuadoexcepcion;

import java.io.*;
public class Main {
    public static void main(String[] args) {
        DataLoader dataLoader = new DataLoader();
        AverageCalculator calculator = new AverageCalculator();

        String nombreArchivo = "datos.txt";  

        try {
            String datos = dataLoader.loadFile(nombreArchivo);
            System.out.println("Datos cargados del archivo:");
            System.out.println(datos);

            int total = 100;
            int cantidad = 0;

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
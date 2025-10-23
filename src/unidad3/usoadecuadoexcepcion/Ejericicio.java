package unidad3.usoadecuadoexcepcion;

import java.io.*;

class EmptyFileException extends Exception {
    public EmptyFileException(String mensaje) {
        super(mensaje);
    }
}

class DataLoader {

    public String loadFile(String filename) throws IOException, EmptyFileException {
        File archivo = new File(filename);
        if (!archivo.exists()) {
            throw new FileNotFoundException("Error: El archivo no existe.");
        }

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        StringBuilder contenido = new StringBuilder();
        String linea;
        boolean estaVacio = true;

        while ((linea = br.readLine()) != null) {
            estaVacio = false;
            contenido.append(linea).append("\n");
        }
        br.close();

        if (estaVacio) {
            throw new EmptyFileException("Error: El archivo está vacío.");
        }

        return contenido.toString();
    }
}

class AverageCalculator {

    public double calcular(int total, int count) throws ArithmeticException {
        if (count == 0) {
            throw new ArithmeticException("Error: No se puede dividir entre cero al calcular el promedio.");
        }
        return (double) total / count;
    }
}
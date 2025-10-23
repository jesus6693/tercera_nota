package unidad3.excepcion;

class InvalidInputException extends Exception {
    public InvalidInputException(String mensaje) {
        super(mensaje);
    }
}

class SafeCalculator {

    public double dividir(int a, int b) throws InvalidInputException {
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Error: No se permiten números negativos.");
        }
        try {
            return a / (double) b;
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
            return Double.NaN;
        } finally {
            System.out.println("Fin de la operación.");
        }
    }
}
package unidad3.excepcion;

public class Main {
    public static void main(String[] args) {
        SafeCalculator calculadora = new SafeCalculator();

        int[][] casosDePrueba = {
            {10, 2},
            {10, 0},
            {-5, 2},
            {5, -2},
            {20, 4}
        };

        for (int[] caso : casosDePrueba) {
            int a = caso[0];
            int b = caso[1];
            System.out.println("Dividiendo " + a + " entre " + b);
            try {
                double resultado = calculadora.dividir(a, b);
                if (!Double.isNaN(resultado)) {
                    System.out.println("Resultado: " + resultado);
                }
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("--------------------");
        }
    }
}

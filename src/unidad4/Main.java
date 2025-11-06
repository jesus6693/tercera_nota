package unidad4;

public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion(" Calle 45 ", " Bogotá");
        Direccion direccion2 = new Direccion(" Calle 10 ", " Ocaña");

        Gerente gerente = new Gerente (" camilo ", 5000, direccion1, 1000);
        Vendedor vendedor = new Vendedor (" pablo ", 3000, direccion2, 20000, 0.10);

        System.out.println("====EMPLEADOS====");
        gerente.mostrarInfo();
        vendedor.mostrarInfo();
    }
}

package semana07;

import semana07.model.Direccion;
import semana07.model.Gerente;
import semana07.model.Vendedor;

public class Main {
    public static void main(String[] args) {
        Direccion d1 = new Direccion("bogota", "calle 45");
        Direccion d2 = new Direccion("ocaña", "calle 10");

        Gerente g1 = new Gerente("Laura", 4000, d1, 1200);
        Vendedor v1 = new Vendedor("Carlos",2500, d2, 15000, 0.10);

        System.out.println("====EMPLEADOS====");
        g1.mostrarInfo();
        v1.mostrarInfo();
    }

}

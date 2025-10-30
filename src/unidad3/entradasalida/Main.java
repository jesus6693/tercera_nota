package unidad3.entradasalida;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Book> listaLibros = new ArrayList<>();
        listaLibros.add(new Book("Cien años de soledad", "Gabriel García Márquez", 25.99));
        listaLibros.add(new Book("Don Quijote de la Mancha", "Miguel de Cervantes", 19.50));
        listaLibros.add(new Book("La sombra del viento", "Carlos Ruiz Zafón", 22.30));

        BookFileHandler manejador = new BookFileHandler();

        manejador.saveBooks(listaLibros);

        manejador.readBooks();
    }
}

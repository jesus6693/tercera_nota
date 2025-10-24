package unidad3.entradasalida;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


class Book {
    private String title;
    private String author;
    private double price;


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + "," + author + "," + price;
    }

    public static Book fromString(String line) {
        String[] parts = line.split(",");
        if (parts.length == 3) {
            try {
                double price = Double.parseDouble(parts[2]);
                return new Book(parts[0], parts[1], price);
            } catch (NumberFormatException e) {
                System.err.println("Error al convertir el precio del libro: " + line);
            }
        }
        return null;
    }
}

class BookFileHandler {
    private final String fileName = "libros.txt";

    public void saveBooks(List<Book> books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Book book : books) {
                writer.write(book.toString());
                writer.newLine();
            }
            System.out.println("Libros guardados correctamente en " + fileName);
        } catch (IOException e) {
            System.err.println("Error al guardar los libros: " + e.getMessage());
        } finally {
            System.out.println("Operación finalizada (guardar).");
        }
    }

    public void readBooks() {
        List<Book> books = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Book book = Book.fromString(line);
                if (book != null) {
                    books.add(book);
                }
            }

            System.out.println("\n=== Lista de libros leídos ===");
            for (Book book : books) {
                System.out.println("Título: " + book.getTitle());
                System.out.println("Autor: " + book.getAuthor());
                System.out.println("Precio: $" + book.getPrice());
                System.out.println("-----------------------------");
            }

        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            System.out.println("Operación finalizada (lectura).");
        }
    }
}


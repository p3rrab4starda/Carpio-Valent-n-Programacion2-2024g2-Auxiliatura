import java.util.ArrayList;

import Author.*;

public class App {
    public static void main(String[] args) throws Exception {
        Book viajes = new Book("Viaje al centro de la tierra", "Julio Verne", 89.0);
        Book libro = new Book("La vuelta al mundo en 80 dias", "Julio Verne", 99.9);
        Author JulioVerne = new Author("Julio Verne");
        ArrayList<Author> Autores = new ArrayList<>();
        Autores.add(JulioVerne);
        ArrayList<Book> libros = new ArrayList<>();
        libros.add(viajes);
        libros.add(libro);
        for (Book book : libros) {
            book.getInfo();
        }
    }
}

package Author;

import java.util.ArrayList;

public class Author {
    private String Name;
    public ArrayList<Book> books;

    public Author(String Name) {
        this.Name = Name;
        this.books = new ArrayList<>();
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public void addBook(Book book) {
        this.books.add(book);
    }
}

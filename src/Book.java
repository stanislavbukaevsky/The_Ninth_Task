import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int publication;

    public Book(String title, Author author, int publication) {
        this.title = title;
        this.author = author;
        this.publication = publication;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublication() {
        return this.publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "Книга: " + title + " Год публикации: " + publication + " Автор: " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publication == book.publication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}

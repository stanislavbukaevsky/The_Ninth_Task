public class Main {
    public static void main(String[] args) {
        Author author = new Author("Александр", "Пушкин");
        Book book = new Book("Евгений Онегин", author, 1830);

        System.out.println("Название: " + book.getTitle() + "; Автор: " + book.getAuthor() + "; Дата публикации: " + book.getPublication());
        book.setPublication(1830);
        System.out.println("Дата публикации через сеттер: " + book.getPublication());

        Author authorTwo = new Author("Сергей", "Есенин");
        Book bookTwo = new Book("Черный человек", authorTwo, 1923);

        System.out.println("Название: " + bookTwo.getTitle() + "; Автор: " + bookTwo.getAuthor() + "; Дата публикации: " + bookTwo.getPublication());
        bookTwo.setPublication(1923);
        System.out.println("Дата публикации через сеттер: " + bookTwo.getPublication());
    }
}
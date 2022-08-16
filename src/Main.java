public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Book pushkinBook = new Book("Евгений Онегин", pushkin, 1830);
        pushkinBook.setPublication(1833);
        System.out.println(pushkinBook);


        Author esenin = new Author("Сергей", "Есенин");
        Book eseninBook = new Book("Черный человек", esenin, 1923);
        eseninBook.setPublication(1925);
        System.out.println(eseninBook);

    }
}
public class Book {
    String title;
    String author;
    static int bookCount = 0;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;
    }

    void printBookInfo() {
        int serialNumber = bookCount;
        System.out.println("Book #" + serialNumber + ": " + title + " by " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java", "James");
        Book b2 = new Book("Python", "Guido");
        b1.printBookInfo();
        b2.printBookInfo();
    }
}


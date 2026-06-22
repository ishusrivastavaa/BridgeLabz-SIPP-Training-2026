class Book {
    String title;
    String author;
    double price;
    boolean available;

    Book(String title,
         String author,
         double price) {

        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {

        if (available) {
            available = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Book Not Available");
        }
    }

    void display() {
        System.out.println(title + " " +
                author + " " +
                price + " " +
                available);
    }
}

public class Problem5 {
    public static void main(String[] args) {

        Book b =
                new Book("Java",
                        "James",
                        500);

        b.borrowBook();
        b.display();
    }
}
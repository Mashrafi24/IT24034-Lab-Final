class Book {
    int bookId;
    String title;
    double price;

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(bookId + " " + title + " " + price);
    }
}

public class BookMain {
    public static void main(String[] args) {

        Book[] books = new Book[5];

        books[0] = new Book(1, "Java", 1300);
        books[1] = new Book(2, "Python", 450);
        books[2] = new Book(3, "C++", 1050);
        books[3] = new Book(4, "DSA", 1370);
        books[4] = new Book(5, "OS", 500);

        double sum = 0;

        System.out.println("Books price > 1000:");
        for (Book b : books) {
            if (b.price > 1000) {
                b.display();
            }
            sum += b.price;
        }

        System.out.println("Average Price: " + (sum / books.length));
    }
}

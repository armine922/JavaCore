package classwork;

public class BookStorage {
    private Book[] books = new Book[10];
    private int size;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i].getTitle() + " " + books[i].getAuthorName() + " " + books[i].getPrice() + " " + books[i].getQuantity() + " ");
        }
    }

    public void search(String keyWord) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyWord) || books[i].getAuthorName().contains(keyWord)) {

                System.out.println(books[i].getTitle() + " " + books[i].getAuthorName() + " " + books[i].getPrice() + " " + books[i].getQuantity() + " ");

            }
        }
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, books.length);
        books = tmp;
    }
}

package bookLibrary;

public class Book {
    private String title;
    private String authorName;
    private double price;
    private int quantity;

    public Book(String title, String authorName, double price, int quantity) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.quantity = quantity;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

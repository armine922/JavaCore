package homework.myshop.product;

public class Product {

    private String id;

    private String name;
    private String description;
    private double price;
    private double stockQty;
    private ProductType product;

    public Product(String id, String name, String description, double price, double stockQty, ProductType product) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQty = stockQty;
        this.product = product;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrize() {
        return price;
    }

    public void setPrize(double prize) {
        this.price = prize;
    }

    public double getStockQty() {
        return stockQty;
    }

    public void setStockQty(double stockQty) {
        this.stockQty = stockQty;
    }

    public ProductType getProduct() {
        return product;
    }

    public void setProduct(ProductType product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", prize=" + price +
                ", stockQty=" + stockQty +
                ", product='" + product + '\'' +
                '}';
    }
}

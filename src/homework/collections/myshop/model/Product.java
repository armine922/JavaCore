package homework.collections.myshop.model;

import homework.myshop.enums.ProductType;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {

    private String id;

    private String name;
    private String description;
    private double price;
    private int stockQty;
    private ProductType product;
    private boolean isRemoved = false;

    public boolean isRemoved() {
        return isRemoved;
    }

    public void setRemoved(boolean removed) {
        isRemoved = removed;
    }

    public Product(String id, String name, String description, double price, int stockQty, ProductType product) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double prize) {
        this.price = price;
    }

    public int getStockQty() {
        return stockQty;
    }

    public void setStockQty(int stockQty) {
        this.stockQty = stockQty;
    }

    public ProductType getProduct() {
        return product;
    }

    public void setProduct(ProductType product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Double.compare(product1.price, price) == 0 &&
                stockQty == product1.stockQty &&
                isRemoved == product1.isRemoved &&
                Objects.equals(id, product1.id) &&
                Objects.equals(name, product1.name) &&
                Objects.equals(description, product1.description) &&
                product == product1.product;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, description, price, stockQty, product, isRemoved);
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

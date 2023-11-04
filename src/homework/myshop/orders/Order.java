package homework.myshop.orders;

import homework.myshop.product.Product;
import homework.myshop.user.ShopUser;

import java.util.Date;

public class Order {
    private String id;
    private ShopUser user;
    private Product product;
    Date date;
    private double price;
    private OrderStatus orderstatus;
    private double qty;
    private PaymentMethod paymentmethod;


    public Order() {
    }

    public Order(String id, ShopUser user, Product product, Date date, double price, OrderStatus orderstatus, double qty, PaymentMethod paymentmethod) {
        this.id = id;
        this.user = user;
        this.product = product;
        this.date = date;
        this.price = price;
        this.orderstatus = orderstatus;
        this.qty = qty;
        this.paymentmethod = paymentmethod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShopUser getUser() {
        return user;
    }

    public void setUser(ShopUser user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderStatus getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(OrderStatus orderstatus) {
        this.orderstatus = orderstatus;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public PaymentMethod getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(PaymentMethod paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", product=" + product +
                ", date=" + date +
                ", price=" + price +
                ", orderstatus=" + orderstatus +
                ", qty=" + qty +
                ", paymentmethod=" + paymentmethod +
                '}';
    }
}

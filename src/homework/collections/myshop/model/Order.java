package homework.collections.myshop.model;

import homework.myshop.enums.OrderStatus;
import homework.myshop.enums.PaymentMethod;
import homework.myshop.model.Product;
import homework.myshop.model.ShopUser;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Order implements Serializable {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.price, price) == 0 &&
                Double.compare(order.qty, qty) == 0 &&
                Objects.equals(id, order.id) &&
                Objects.equals(user, order.user) &&
                Objects.equals(product, order.product) &&
                Objects.equals(date, order.date) &&
                orderstatus == order.orderstatus &&
                paymentmethod == order.paymentmethod;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, user, product, date, price, orderstatus, qty, paymentmethod);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", model=" + user +
                ", product=" + product +
                ", date=" + date +
                ", price=" + price +
                ", orderstatus=" + orderstatus +
                ", qty=" + qty +
                ", paymentmethod=" + paymentmethod +
                '}';
    }
}

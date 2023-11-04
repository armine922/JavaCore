package homework.myshop.orders;

import homework.myshop.product.Product;
import homework.myshop.user.ShopUser;

public class OrderStorage {
    private Order orders[] = new Order[100];
    private int size;

    public void buyProduct(Order order) {
        if (size == orders.length) {
            extend();
        }
        orders[size++] = order;
    }

    public void extend() {
        ShopUser[] tmp = new ShopUser[orders.length * 2];
        for (int i = 0; i < size; i++) {
            System.arraycopy(orders, 0, tmp, 0, orders.length);
        }
    }

    public void removeProductById(String id) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getId().equals(id)) {
                orders[i] = orders[i + 1];
                System.out.println(orders[i]);
            }
        }
    }

    public ShopUser orderowner(String owner) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getUser().equals(owner)) {
                System.out.println(orders[i]);
            }
        }
        return null;
    }

    public Product productbuying(String ordering) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getProduct().equals(ordering)) {
                System.out.println(orders[i]);
            }
        }
        return null;
    }

    public void changeOrderStatus(OrderStatus sold) {
        print();
        sold = OrderStatus.DELIVERED;
        for (int i = 0; i < size; i++) {
            if (orders[i].getOrderstatus().equals(sold)) {
                orders[i] = orders[i + 1];
                System.out.println(orders[i]);
            }
        }
    }

    public void cancelOrderById(String id) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getId().equals(id)) {
                orders[i] = orders[i + 1];
                System.out.println(orders[i]);
            }
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }

    public OrderStatus orderStatus(String status){
        for (int i = 0; i < size; i++) {
            if (orders[i].getOrderstatus().equals(status)) {
                System.out.println(orders[i]);
            }


        }return  null;}



    public PaymentMethod payment (String paying) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getPaymentmethod().equals(paying)) {
                System.out.println(orders[i]);
            }

        }
        return null;
    }}
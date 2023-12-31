package homework.collections.myshop.storage;

import homework.myshop.model.Order;
import homework.myshop.model.Product;
import homework.myshop.model.ShopUser;
import homework.myshop.util.FileUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OrderStorage implements Serializable {
         private List<Order> orders = new ArrayList<>();

    public void add(Order order) {
        orders.add(order);

    }



public ShopUser printByUser(ShopUser currentUser){
    for (Order order : orders) {
      if(order.getUser().equals(currentUser)) {
          System.out.println(order);
      }
    }
    return null;
}



    public Product productbuying(String ordering) {
        for (Order order : orders) {
            if (order.getProduct().equals(ordering)) {
                System.out.println(order);
            }
        }
        return null;
    }


    public Order getById(String id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
               return order;
            }
        }
        return null;
    }

    public void print() {
        for (Order order : orders) {
            System.out.println(order);

        }
    }}



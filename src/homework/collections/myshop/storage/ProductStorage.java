package homework.collections.myshop.storage;

import homework.myshop.model.Product;
import homework.myshop.model.ShopUser;
import homework.myshop.enums.ProductType;
import homework.myshop.util.FileUtil;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class ProductStorage implements Serializable {
   private Set<Product> products=new HashSet<>();

    public void add(Product product) {
        products.add(product);

    }



    public Product getById(String id){
        for (Product product : products) {
            if(product.getId().equals(id) ){
               return product;
            }
        }
        return null;
    }


    public void print() {
        for (Product product : products) {
            if(!product.isRemoved()){
            System.out.println(product);
        }}
    }
}

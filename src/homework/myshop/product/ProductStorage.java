package homework.myshop.product;

import homework.myshop.user.ShopUser;

public class ProductStorage {
    private Product products[]=new Product[100];
    private int size;

    public void add(Product product) {
        if (size == products.length) {
            extend();
        }
        products[size++] = product;
    }

    public void extend() {
        ShopUser[] tmp = new ShopUser[products.length * 2];
        for (int i = 0; i < size; i++) {
            System.arraycopy(products, 0, tmp, 0, products.length);
        }
    }

    public void removeProductById(String id){
        for(int i=0;i<size;i++){
            if(products[i].getId().equals(id)){
                products[i]=products[i+1];
                System.out.println(products[i]);
            }
        }
    }
    public ProductType chooseType(String producto){
        for(int i=0;i<size;i++){
            if(products[i].getProduct().equals(producto)){
                System.out.println(products[i]);
            }
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }
}

package classwork.chapter12.enumAndWrap;

public enum Apples {
    JONATHAN(10), REDDEL, GOLDENDEL(9), WINESAP(19), CORTLAND(8);

    private int price;

    Apples(int p) {
        price = p;
    }
Apples(){
        price =-1;
}
    int getPrice() {
        return price;

    }
}
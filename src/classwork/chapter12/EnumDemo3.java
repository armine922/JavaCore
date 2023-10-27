package classwork.chapter12;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apples ap;
        System.out.println(Apples.WINESAP.getPrice() + "cents/n");
        System.out.println("Prices of all sorts");
        for (Apples a : Apples.values())
            System.out.println(a.getPrice());
    }
}

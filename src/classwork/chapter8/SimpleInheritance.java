package classwork.chapter8;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.print("The content of superOb :");
        superOb.showij();
        System.out.println();
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 10;
        System.out.print("The content of subOb ");
        subOb.showk();
        ;
        subOb.showij();
        System.out.println();
        System.out.print("Sum of i,j,k in subOb");
        subOb.sum();
    }
}

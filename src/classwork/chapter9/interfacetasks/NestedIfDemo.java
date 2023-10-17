package classwork.chapter9.interfacetasks;

public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif= new B();
        if(nif.isNotNegative(10)){
            System.out.println("10 as positive");
            if(nif.isNotNegative(-12)){
                System.out.println("This is not run!");
            }
        }
    }
}

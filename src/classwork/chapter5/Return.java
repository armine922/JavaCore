package classwork.chapter5;

public class Return {
    public static void main(String[] args) {
        boolean t=true;
        System.out.println("Before return");
        if(t)return;
        System.out.println("This operator won't be run.");
    }
}

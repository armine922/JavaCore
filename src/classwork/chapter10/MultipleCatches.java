package classwork.chapter10;

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / 0;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of array bounds");
        }
        System.out.println("After try/catch");
    }
}

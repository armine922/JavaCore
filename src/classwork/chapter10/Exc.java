package classwork.chapter10;

public class Exc {
    public static void main(String[] args) {
        int a, d;
        try {
            d = 0;
            a = 42 / 0;
            System.out.println("NOT RUN");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        }
        System.out.println("After catch");
    }
}

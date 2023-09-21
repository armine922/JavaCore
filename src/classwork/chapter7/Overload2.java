package classwork.chapter7;

public class Overload2 {
    void test() {
        System.out.println("No parametre");
    }

    void test(int a, int b) {
        System.out.println("a anb b : " + a + "," + b);
    }

    void test(double a) {
        System.out.println("Inner change of test (double )a: " + a);
    }

    public static void main(String[] args) {
        Overload2 ob = new Overload2();
        int i = 88;
        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.2);
    }
}

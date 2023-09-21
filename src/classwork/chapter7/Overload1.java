package classwork.chapter7;

public class Overload1 {
    void test() {

        System.out.println("No parametre");
    }

    void test(int a) {
        System.out.println("a =" + a);
    }

    void test(int a, int b) {

        System.out.println("a and b:" + a + "," + b);
    }

    double test(double a) {
        System.out.println("double a:" + a);
        return a * a;
    }

    public static void main(String[] args) {
        Overload1 ob = new Overload1();
        double result;
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("The result is " + result);

    }


}

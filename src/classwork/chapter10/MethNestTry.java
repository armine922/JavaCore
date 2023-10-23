package classwork.chapter10;

public class MethNestTry {
    static void nesttry(int a) {
        try {
            if (a == 1) a = a / a - a;
            if (a == 2) {
                int[] c = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero" + e);
        }
    }
}

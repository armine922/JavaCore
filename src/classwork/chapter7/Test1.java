package classwork.chapter7;

public class Test1 {
    void meth(int i, int j) {
        j *= 2;
        i /= 2;
    }

    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15, b = 20;
        System.out.println("a and b before the call " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b  after the call " + a + " " + b);
    }
}

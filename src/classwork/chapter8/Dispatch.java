package classwork.chapter8;

public class Dispatch {
    public static void main(String[] args) {
        DynamicA a = new DynamicA();
        Bbb b = new Bbb();
        Cc c = new Cc();
        DynamicA r;
        r = a;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();

    }
}

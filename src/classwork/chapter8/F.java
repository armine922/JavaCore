package classwork.chapter8;

public class F extends E {
    int k;

    F(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println(k);
    }
}

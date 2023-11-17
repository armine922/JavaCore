package classwork.chapter14;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;

    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    void showType() {
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }
}

class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
        tgObj.showType();
        int v = tgObj.getOb1();
        System.out.println(v);
        String str = tgObj.getOb2();
        System.out.println(str);
    }
}
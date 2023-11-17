package classwork.chapter14;

public class GenH<T> {
    T ob;

    GenH(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class GenH2<T, V> extends GenH<T> {
    V ob2;

    GenH2(T o, V o2) {
        super(o);
        ob = o;
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }


}


class HierDemo {
    public static void main(String[] args) {
        GenH2<String, Integer> x = new GenH2<String, Integer>("Value is equal to ", 99);
        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
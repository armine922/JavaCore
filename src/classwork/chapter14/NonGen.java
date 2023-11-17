package classwork.chapter14;

public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }

}

class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        iOb = new NonGen(88);

        int v = (Integer) iOb.getOb();
        System.out.println(v);
        NonGen strOb = new NonGen("Type without name");
        String str = (String) strOb.getOb();
        System.out.println(str);
        iOb = strOb;
        v = (Integer) iOb.getOb();//ERROR WHILE COMPILING

    }
}
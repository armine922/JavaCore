package classwork.chapter14;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iob;
        iob = new Gen<Integer>(88);
        iob.showType();
        int v = iob.getOb();
        System.out.println(v);
        System.out.println();
        Gen<String> strOb = new Gen<String>("Message test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println(str);


    }
}

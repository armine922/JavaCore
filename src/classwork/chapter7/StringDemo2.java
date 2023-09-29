package classwork.chapter7;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "First line";
        String strOb2 = "Second line";
        String strOb3 = strOb1;
        System.out.println(strOb1.length());
        System.out.println(strOb2.charAt(5));
        if (strOb1.equals(strOb2)) {
            System.out.println("strPOb1==strOb2");
        } else System.out.println("strPOb1!=strOb2");
        if (strOb1.equals(strOb3))
            System.out.println("strPOb1==strOb3");
        else System.out.println("strPOb1!=strOb3");
    }

}

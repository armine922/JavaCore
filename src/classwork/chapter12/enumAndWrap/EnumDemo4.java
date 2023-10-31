package classwork.chapter12.enumAndWrap;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        System.out.println("All apple sorts and their ordinals");
        for (Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal());
        ap = Apple.GoldenDel;
        ap2 = Apple.RedDel;
        ap3 = Apple.GoldenDel;
        System.out.println();
        if (ap.compareTo(ap2) < 0)
            System.out.println(ap + " is before" + ap2);
        if (ap.compareTo(ap2) > 0)
            System.out.println(ap + " is after " + ap2);
        if (ap.compareTo(ap3) == 0)
            System.out.println(ap + " is equal to " + ap3);
        System.out.println();
        if (ap.equals(ap2))
            System.out.println("Error");
        if (ap.equals(ap3))
            System.out.println(ap + " is equal to " + ap3);
        if (ap == ap3)
            System.out.println(ap + "==" + ap3);
    }
}

package classwork.chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Constants of Apple type.");
        Apple allapples[] = Apple.values();
        for (Apple a : allapples)
            System.out.println(a);
        System.out.println();
        ap = Apple.valueOf("WineSap");
        System.out.println(ap);
        //For(Apple a:Apple.values())
//        System.out.println(a);
    }
}

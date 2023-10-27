package classwork.chapter12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println(ap);
        System.out.println();
        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel)
            System.out.println("ap contains GoldenDel.\n");
        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan sort is red");
                break;
            case GoldenDel:
                System.out.println("GoldenDel sort is yellow.");
                break;
            case RedDel:
                System.out.println("RedDel sort is red.");
                break;
            case WineSap:
                System.out.println("WineSap sort is red");
                break;
            case Cortland:
                System.out.println("Cortland sort is red.");
                break;
        }
    }
}

package classwork.chapter7;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Content:");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One parametre of variable length", 10);
        vaTest("One parametre of variable length", 1, 2, 3);
        vaTest("One parametre of variable length");
    }
}

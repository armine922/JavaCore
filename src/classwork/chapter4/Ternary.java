package classwork.chapter4;

public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("Absolute meaning of ");
        System.out.println(i + " is equal to " + k);
        i = -10;
        k = i < 0 ? -i : i;
        System.out.print("Absolute meaning of  ");
        System.out.println(i + " is equal to " + k);

    }
}
